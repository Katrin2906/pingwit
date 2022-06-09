package pingwit.homework_24.dto;

import pingwit.homework_24.entity.HouseType;

import java.util.List;

public record HouseDto(Long id, HouseType houseType, Integer floor, Integer entrance, AddressDto address,
                       List<ElevatorDto> elevators, List<ResidentDto> residents) {
}
