package pingwit.homework_24.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pingwit.homework_24.entity.House;
import pingwit.homework_24.entity.HouseType;

import java.util.List;

public interface HouseRepository extends PagingAndSortingRepository<House, Long> {

    List<House> findAllByHouseType(HouseType houseType);

    List<House> findAllByIdIn(List<Long> ids);

    List<House> findAllByHouseTypeAndIdIn(HouseType houseType, List<Long> ids);

    List<House> findAllByFloorGreaterThanEqualOrderByIdDesc(Integer floor);

}
