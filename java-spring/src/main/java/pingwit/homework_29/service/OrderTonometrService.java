package pingwit.homework_29.service;

import org.springframework.stereotype.Component;
import pingwit.homework_29.entity.Order;

@Component
public class OrderTonometrService {

    public String orderTonomert() {
        Order order = new Order();
        order.setId();
        return "order created";
    }
}
