package pingwit.homework_24.service;

import org.springframework.stereotype.Service;
import pingwit.homework_24.dto.HouseDto;
import pingwit.homework_24.entity.House;
import pingwit.homework_24.entity.HouseType;
import pingwit.homework_24.repository.HouseRepository;

import java.util.List;

@Service
public class HouseService {

    private final HouseConverter houseConverter;
    private final HouseRepository houseRepository;

    public HouseService(HouseConverter houseConverter, HouseRepository houseRepository) {
        this.houseConverter = houseConverter;
        this.houseRepository = houseRepository;
    }

    public Long save(HouseDto dto) {
        House house = houseConverter.toLocal(dto);
        return houseRepository.save(house).getId();

    }

    public List<HouseDto> findAllByHouseType(HouseType houseType) {
        List<House> allByHouseType = houseRepository.findAllByHouseType(houseType);
        return allByHouseType.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    public List<HouseDto> findAllByHouseType(List<Long> ids) {
        List<House> findAllByIdIn = houseRepository.findAllByIdIn(ids);
        return findAllByIdIn.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    public List<HouseDto> findAllByHouseTypeAndIdIn(HouseType houseType, List<Long> ids) {
        List<House> allByHouseTypeAndIdIn = houseRepository.findAllByHouseTypeAndIdIn(houseType, ids);
        return allByHouseTypeAndIdIn.stream()
                .map(houseConverter::toFront)
                .toList();
    }

    public List<HouseDto> findAllByFloorGreaterThanEqualOrderByIdDesc(Integer floor) {
        List<House> allByFloorGreaterThanEqualOrderByIdDesc = houseRepository.findAllByFloorGreaterThanEqualOrderByIdDesc(floor);
        return allByFloorGreaterThanEqualOrderByIdDesc.stream()
                .map(houseConverter::toFront)
                .toList();
    }
}
