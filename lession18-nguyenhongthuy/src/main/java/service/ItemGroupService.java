package service;

import java.util.List;

import persistence.dto.RemaningItemGroupDto;

public interface ItemGroupService {

	List<RemaningItemGroupDto> getRemainingItems();
}
