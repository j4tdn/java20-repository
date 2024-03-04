package dao;

import java.util.List;

import persistence.dto.RemaningItemGroupDto;

public interface ItemGroupDao {

	List<RemaningItemGroupDto> getRemainingItems();
}
