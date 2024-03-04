package dao;

import java.util.List;

import dto.ItemGroupDTO;
import persistence.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();

	List<ItemGroupDTO> getAllItemGroupDTO();

}
