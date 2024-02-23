package service;

import java.util.List;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
}
