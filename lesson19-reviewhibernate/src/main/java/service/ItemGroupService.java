package service;

import java.util.List;

import dto.ItemGroupDTO;
import persistence.ItemGroup;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDTO> getAllItemGroupDTO();
	
}
