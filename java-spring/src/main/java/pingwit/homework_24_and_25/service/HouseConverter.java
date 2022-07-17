package pingwit.homework_24_and_25.service;

import org.springframework.stereotype.Component;
import pingwit.homework_24_and_25.dto.AddressDto;
import pingwit.homework_24_and_25.dto.ElevatorDto;
import pingwit.homework_24_and_25.dto.HouseDto;
import pingwit.homework_24_and_25.dto.ResidentDto;
import pingwit.homework_24_and_25.entity.Address;
import pingwit.homework_24_and_25.entity.Elevator;
import pingwit.homework_24_and_25.entity.House;
import pingwit.homework_24_and_25.entity.Resident;

import java.util.List;

@Component
public class HouseConverter {

    private final AddressConverter addressConverter;
    private final ElevatorConverter elevatorConverter;
    private final ResidentConverter residentConverter;

    public HouseConverter(AddressConverter addressConverter, ElevatorConverter elevatorConverter, ResidentConverter residentConverter) {
        this.addressConverter = addressConverter;
        this.elevatorConverter = elevatorConverter;
        this.residentConverter = residentConverter;
    }

    public HouseDto toFront(House house) {
        AddressDto addressDto = addressConverter.toFront(house.getAddress());
        List<ElevatorDto> elevatorDtos = elevatorConverter.toFront(house.getElevators());
        List<ResidentDto> residentDtos = residentConverter.toFront(house.getResidents());

        return new HouseDto(house.getId(), house.getHouseType(), house.getFloor(), house.getEntrance(), addressDto, elevatorDtos, residentDtos);
    }

    public House toLocal(HouseDto dto) {
        Address address = addressConverter.toLocal(dto.address());
        List<Resident> residents = residentConverter.toLocal(dto.residents());

        House house = new House();
        house.setId(dto.id());
        house.setHouseType(dto.houseType());
        house.setFloor(dto.floor());
        house.setEntrance(dto.entrance());
        house.setAddress(address);

        List<Elevator> elevators = elevatorConverter.toLocal(house, dto.elevators());
        house.setElevators(elevators);

        house.setResidents(residents);
        return house;
    }
}
