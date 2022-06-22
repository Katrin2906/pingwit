package pingwit.homework_29.service;

import org.springframework.stereotype.Service;
import pingwit.homework_29.entity.TonometrOrder;

@Service
public class TonometrOrderService {

    public String orderTonometr() {
        TonometrOrder tonometrOrder = new TonometrOrder();
        return tonometrOrder.toString();
    }
}
