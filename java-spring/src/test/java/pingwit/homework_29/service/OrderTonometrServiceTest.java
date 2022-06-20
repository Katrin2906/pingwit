package pingwit.homework_29.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pingwit.homework_29.entity.Tonometr;

import static pingwit.homework_29.entity.Producer.OMRON;

class OrderTonometrServiceTest {

    private final OrderTonometrService subject = new OrderTonometrService();

    @Test
    void orderTonomert() {
        //Given
        Tonometr tonometr = new Tonometr(1L, OMRON.name(), 113);
        String actual = "order created";
        //When
        String expected = subject.orderTonomert();
        //Then
        Assertions.assertEquals(expected, actual);
    }
}