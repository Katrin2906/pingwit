package pingwit.homework_29.service;

import org.springframework.stereotype.Service;
import pingwit.homework_29.dto.TonometrDto;

@Service
public class OrderService {
    private final TonometrOrderService tonometrOrderService;

    public OrderService(TonometrOrderService tonometrOrderService) {
        this.tonometrOrderService = tonometrOrderService;
    }

    public String makeOrder(TonometrDto dto) {
        return tonometrOrderService.orderTonometr();
    }
}
