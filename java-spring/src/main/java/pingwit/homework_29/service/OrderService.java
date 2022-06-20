package pingwit.homework_29.service;

import org.springframework.stereotype.Service;
import pingwit.homework_29.dto.TonometrDto;

@Service
public class OrderService {
    private final OrderTonometrService orderTonometrService;

    public OrderService(OrderTonometrService orderTonometrService) {
        this.orderTonometrService = orderTonometrService;
    }

    public String makeOrder(TonometrDto dto) {
        return orderTonometrService.orderTonomert();
    }
}
