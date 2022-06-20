package pingwit.homework_29.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pingwit.homework_29.dto.TonometrDto;

import static org.mockito.Mockito.when;
import static pingwit.homework_29.entity.Producer.MICROLIFE;

@ExtendWith(SpringExtension.class)
class OrderServiceTest {
    @Mock
    private final OrderTonometrService orderTonometrService;
    @InjectMocks
    private final OrderService subject;

    OrderServiceTest(OrderTonometrService orderTonometrService, OrderService subject) {
        this.orderTonometrService = orderTonometrService;
        this.subject = subject;
    }

    @Test
    void makeOrder() {
        //Given
        TonometrDto tonometrDto = new TonometrDto(2L, MICROLIFE.name(), 234);
        String expected = "2L MICROLIFE 234";
        when(orderTonometrService.orderTonomert().thenReturn(expected));
        //When
        String actual = subject.makeOrder(tonometrDto);
        //Then
        Assertions.assertEquals(expected, actual);
    }
}