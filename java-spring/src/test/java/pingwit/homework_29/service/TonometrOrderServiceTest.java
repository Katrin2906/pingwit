package pingwit.homework_29.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pingwit.homework_29.entity.Tonometr;

import static pingwit.homework_29.entity.TonometrProducer.OMRON;

class TonometrOrderServiceTest {

    private final TonometrOrderService subject = new TonometrOrderService();

    @Test
    void orderTonometr() {
        //Given
        Tonometr tonometr = new Tonometr(1L, OMRON.name(), 113);
        String expected = "pingwit.homework_29.entity.TonometrOrder";
        //When
        String actual = subject.orderTonometr();
        //Then
        Assertions.assertTrue(actual.contains(expected));
    }
}