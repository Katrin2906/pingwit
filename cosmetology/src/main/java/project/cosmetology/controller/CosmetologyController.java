package project.cosmetology.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.homework_24_and_25.dto.HouseDto;

@RestController
@RequestMapping("/cosmetology")
public class CosmetologyController {

    private final CosmetologyService cosmetologyService;

    public CosmetologyController(CosmetologyService cosmetologyService) {
        this.cosmetologyService = cosmetologyService;
    }

    @PostMapping("/save/product")
    public Long save(@RequestBody ProductDto dto) {
        return productService.save(dto);
    }

    @PostMapping("/save/procedure")
    public Long save(@RequestBody ProcedureDto dto) {
        return procedureService.save(dto);
    }

    @PostMapping("/save/person")
    public Long save(@RequestBody PersonDto dto) {
        return personService.save(dto);
    }


}
