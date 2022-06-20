package pingwit.homework_29.controller;

import org.springframework.web.bind.annotation.*;
import pingwit.homework_29.dto.TonometrDto;
import pingwit.homework_29.entity.Tonometr;
import pingwit.homework_29.service.OrderService;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static pingwit.homework_29.entity.Producer.MICROLIFE;
import static pingwit.homework_29.entity.Producer.OMRON;

@RestController
@RequestMapping("/tonometr")
public class OrderController {

    private static final Map<Long, Tonometr> TONOMETR_MAP = new HashMap<>();

    private static AtomicLong ATOMIC_LONG;

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostConstruct
    public void init() {
        TONOMETR_MAP.put(1L, new Tonometr(1L, MICROLIFE.name(), 13));
        TONOMETR_MAP.put(2L, new Tonometr(2L, OMRON.name(), 112));
        TONOMETR_MAP.put(3L, new Tonometr(3L, MICROLIFE.name(), 116));
        ATOMIC_LONG = new AtomicLong(TONOMETR_MAP.size());
    }

    @PostMapping("/order")
    public String makeOrder(@RequestBody TonometrDto tonometrDto) {
        return orderService.makeOrder(tonometrDto);
    }

    @GetMapping("/order/most_popular")
    public Tonometr popular() {
        return TONOMETR_MAP.get(2L);
    }
}
