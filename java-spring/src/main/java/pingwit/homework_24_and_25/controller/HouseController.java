package pingwit.homework_24_and_25.controller;

import org.springframework.web.bind.annotation.*;
import pingwit.homework_24_and_25.dto.HouseDto;
import pingwit.homework_24_and_25.entity.HouseType;
import pingwit.homework_24_and_25.service.HouseService;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody HouseDto dto) {
        return houseService.save(dto);
    }

    @GetMapping("/type/{houseType}")
    public List<HouseDto> findAllByHouseType(@PathVariable HouseType houseType) {
        return houseService.findAllByHouseType(houseType);
    }

    @GetMapping("/{id}")
    public HouseDto findAllByHouseType(@PathVariable Long id) {
        return houseService.findById(id);
    }


    @GetMapping("/id")
    public List<HouseDto> findAllByHouseType(@RequestParam List<Long> ids) {
        return houseService.findAllByHouseType(ids);
    }

    @GetMapping("/search")
    public List<HouseDto> findAllByHouseTypeAndIdIn(@RequestParam HouseType houseType, @RequestParam List<Long> ids) {
        return houseService.findAllByHouseTypeAndIdIn(houseType, ids);
    }

    @GetMapping("/search/floor/{floor}")
    public List<HouseDto> findAllByFloorGreaterThanEqualOrderByIdDesc(@PathVariable Integer floor) {
        return houseService.findAllByFloorGreaterThanEqualOrderByIdDesc(floor);
    }

}
