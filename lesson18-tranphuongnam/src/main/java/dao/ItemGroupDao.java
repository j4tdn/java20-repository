package dao;

import java.util.List;

import persistence.dtos.ItemGroupDTO;

public interface ItemGroupDao {
	List<ItemGroupDTO> getAllItemGroupDTO();
}
