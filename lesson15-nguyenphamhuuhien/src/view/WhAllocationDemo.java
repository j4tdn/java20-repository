package view;

import bean.Item;
import bean.Store;
import model.DataModel;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhAllocationDemo {
    public static void main(String[] args) {
        int planningAmount=88;
        int requiredMinPlanningAmount=50;

        Map<Item, List<Store>> storesOfRefItemA55 = DataModel.mockStoresOfRefItemA55();
        Map<Item, List<Store>> storesOfRefItemA77 = DataModel.mockStoresOfRefItemA77();
        Map<Integer, Integer> mockRefStores = DataModel.mockRefStores();
        Map<Integer, BigDecimal> mockRefWeights = DataModel.mockRefWeights();

        if(planningAmount<=requiredMinPlanningAmount){
            System.out.println("Stop Calculation");
        }else{
            System.out.println("Continue with step 2");
            for (Item item : storesOfRefItemA77.keySet()){
                List<Store> storeList = storesOfRefItemA77.get(item);
                for(Store store:storeList){
                    BigDecimal potential = store.getPotential();
                    String desc = store.getDesc();
                    Integer refId = mockRefStores.get(store.getId());
                    if(potential.compareTo(BigDecimal.ZERO) == 0){
                        if(refId!=null){
                            List<Store> refStores = storesOfRefItemA77.get(item);
                            for (Store refStore : refStores) {
                                potential=refStore.getPotential();
                            }
                        }else{
                            BigDecimal sum = BigDecimal.ZERO;
                            for (Store store2 : storeList) {
                                if (store2.getId().compareTo(store.getId()) != 0) {
                                    BigDecimal otherPotential = store2.getPotential();
                                    sum = sum.add(otherPotential);
                                }
                            }
                            potential=sum.divide(BigDecimal.valueOf(12), new MathContext(3));
                        }
                    }
                    System.out.println(desc + " - Potential: " + potential);
                }
            }
        }
    }
}