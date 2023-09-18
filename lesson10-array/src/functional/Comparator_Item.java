package functional;

import bean.Item;

@FunctionalInterface
public interface Comparator_Item {
	int compare(Item a,Item b);
}
