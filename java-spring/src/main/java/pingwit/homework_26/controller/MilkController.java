package pingwit.homework_26.controller;

import org.springframework.web.bind.annotation.*;
import pingwit.homework_26.dto.MilkDto;
import pingwit.homework_26.service.MilkService;

import java.nio.file.AccessDeniedException;

@RestController
@RequestMapping("/milk")
public class MilkController {
    private final MilkService milkService;

    public MilkController(MilkService milkService) {
        this.milkService = milkService;
    }

    @PostMapping("/save")
    public Long save(@RequestBody MilkDto dto) {
        return milkService.save(dto);
    }

    @GetMapping("/id/{id}")
    public MilkDto getById(@PathVariable Long id) {
        return milkService.getById(id);
    }

    @GetMapping("/id/broken/{id}")
    public MilkDto getByIdBroken(@PathVariable Long id) throws AccessDeniedException {
        return milkService.getByIdBroken(id);
    }

    @PutMapping("/update/{id}")
    public void setFatPercentAndVolume(@RequestParam Double fatPercent, @RequestParam Double volume, @PathVariable Long id) {
        milkService.setFatPercentAndVolume(fatPercent, volume, id);
    }
}
