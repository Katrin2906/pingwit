package pingwit.homework_24.dto;

import pingwit.homework_24.entity.HouseType;

public record HouseDto(Long Id, HouseType houseType, Integer floor, Integer entrance) {
}
