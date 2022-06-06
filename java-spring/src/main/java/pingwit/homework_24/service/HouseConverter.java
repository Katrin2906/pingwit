package pingwit.homework_24.service;

import org.springframework.stereotype.Component;
import pingwit.homework_24.dto.HouseDto;
import pingwit.homework_24.entity.House;

@Component
public class HouseConverter {

    public HouseDto toFront(House house) {
        return new HouseDto(house.getId(), house.getHouseType(), house.getFloor(), house.getEntrance());
    }

    public House toLocal(HouseDto dto) {
        House house = new House();

        house.setHouseType(dto.houseType());
        house.setFloor(dto.floor());
        house.setEntrance(dto.entrance());

        return house;
    }

}
