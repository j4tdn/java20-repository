package service;

import java.util.List;

import persistence.dtos.ItemGroupDTO;

public interface ItemGroupService {
	
	List<ItemGroupDTO> getAllItemGroupDTO();
	
}