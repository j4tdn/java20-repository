
package funtional;

import bean.Item;

@FunctionalInterface
public interface Comparator_Item {
	int compare(Item i1, Item i2);
}
