package project.cosmetology.service;

import org.springframework.stereotype.Component;
import project.cosmetology.dto.OrderDto;
import project.cosmetology.dto.ProductDto;
import project.cosmetology.entity.Order;

import java.util.List;

@Component
public class OrderConverter {

    private final ProductConverter productConverter;

    public OrderConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }

    public Order toLocal(OrderDto dto) {
        if (dto == null) {
            return null;
        }

        Order order = new Order();

        order.setId(dto.id());
        // order.setPerson(person);
        order.setOrderStatus(dto.orderStatus());

        return order;
    }

    public OrderDto toFront(Order order) {
        if (order == null) {
            return null;
        }
        List<ProductDto> productDtos = productConverter.toFront(order.getProducts());
        return new OrderDto(order.getId(), order.getOrderStatus(), productDtos);
    }

    public List<Order> toLocal(List<OrderDto> orderDtos) {
        if (orderDtos == null) {
            return null;
        }

        return orderDtos.stream()
                .map(this::toLocal)
                .toList();
    }

    public List<OrderDto> toFront(List<Order> orders) {
        if (orders == null) {
            return null;
        }

        return orders.stream()
                .map(this::toFront)
                .toList();
    }
}
