package view;

import java.util.Map;

import bean.Item;
import bean.Store;

import java.util.List;
import java.math.BigDecimal;
import model.DataModel;

public class WhAllocationDemo {

    public static void main(String[] args) {
        DataModel data = new DataModel();
        
        int planningAmountCountry = DataModel.planningAmount;
        int requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;
        if (planningAmountCountry <= requiredMinPlanningAmount) {
            System.out.println("Stop calculation.");
        } else {
            Map<Item, List<Store>> storesOfRefItemA55 = data.mockStoresOfRefItemA55();
            Map<Item, List<Store>> storesOfRefItemA77 = data.mockStoresOfRefItemA77();
            Map<Integer, Integer> refStores = data.mockRefStores();
            Map<Integer, BigDecimal> refWeights = data.mockRefWeights();
            
            AllocationController controller = new AllocationController();
            Map<Store, BigDecimal> storePotentialsA55 = controller.fillStorePotentials(storesOfRefItemA55, refStores, refWeights, DataModel.minPerStore);
            Map<Store, BigDecimal> storePotentialsA77 = controller.fillStorePotentials(storesOfRefItemA77, refStores, refWeights, DataModel.minPerStore);
            
            Map<Store, BigDecimal> demandA55 = controller.calculateStoreDemand(storePotentialsA55, refWeights, DataModel.minPerStore);
            Map<Store, BigDecimal> demandA77 = controller.calculateStoreDemand(storePotentialsA77, refWeights, DataModel.minPerStore);
            
            Map<String, BigDecimal> demandWH = controller.calculateDemandWH(demandA55, demandA77);
            
            Map<String, BigDecimal> shares = controller.calculateShares(demandWH);
            
            Map<String, BigDecimal> allocationAmountWH = controller.allocateByShares(shares, DataModel.planningAmount);
            
            Map<String, BigDecimal> allocationAmountWHWithMin = controller.applyMinimum(allocationAmountWH, DataModel.minPerStore);
            
            Map<String, BigDecimal> newShares = controller.recalculateShare(allocationAmountWH, allocationAmountWHWithMin);
            
            Map<String, BigDecimal> allocationAmountNewWH = controller.reallocate(DataModel.planningAmount, allocationAmountWHWithMin);
            
            allocationAmountNewWH = controller.roundUp(allocationAmountNewWH);
            
            allocationAmountNewWH = controller.fixRounding(DataModel.planningAmount, allocationAmountNewWH);
            
            controller.displayResults(allocationAmountNewWH);
        }
    }
}
