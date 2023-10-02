package view.sorting.theory;

import ArrayUtils.ArraysUtils;
import bean.Item;
import funtional.Comparator_Item;
import model.DataModel;

public class Ex03BubbleSort_Item {
	public static void main(String[] args) {
		// Prior: JDK 1.5
		// int
		// Integer
		// int a, Integer b = new Integer(2);
		// a = b // error
		// b = a // error
		
		// JDK 1.5
		// autoboxing    : primitive -> object
		// autoaunboxing : object    -> primitive
		// Integer b = 2;
		// int a = b;
		// b = a;
		
		// Item: id, name, salesPrice, storeId
		// NULL: first
		Item[] items = DataModel.mockItems();
		ArraysUtils.generate("Items", items);
		sort(items, new Comparator_Item() {
			
			@Override
			public int compare(Item i1, Item i2) {
				return i2.getId().compareTo(i1.getId());
			}
		});
		ArraysUtils.generate("Items", items);
		
		
		Item[] itemsNULL = DataModel.mockItems_NullValues();
		sort(itemsNULL, (i1,i2)->{
			if(i1==null)
			{
				return -1;
			}
			if(i2==null)
			{
				return 1;
			}
			    Integer id1 =i1.getId();
			    Integer id2 =i2.getId();
			    if(id1 ==null && id2 !=null)
			    {
			    	return 1;
			    }
			    if(id2 ==null)
			    	{
			    	return -1;
			    }
			    return id2-id1;
		
		})
		;
		ArraysUtils.generate("Items", itemsNULL);
		
		ArraysUtils.generate("Items", items);
		
		sort(items, (i1,i2)->{
			Integer sti1 = i1.getStoreId();
			Integer sti2 =i2.getStoreId();
			int stcp = sti1.compareTo(sti2);
			return stcp ==0 ? i1.getSalesPrice().compareTo(i2.getSalesPrice()):stcp;
		});
		ArraysUtils.generate("Items", items);
}
	
	private static void sort(Item[] items,Comparator_Item comparator)
	{
		int lenght = items.length;
		for(int i=0;i< lenght;i++)
		{
			for(int j=0;j<lenght-i-1;j++)
			{
				Item i1 = items[j];
				Item i2 =items[j+1];
				if(comparator.compare(i1, i2)>0)
				{
					ArraysUtils.swap(items, j, j+1);
				}
			}
		}
	}
}
