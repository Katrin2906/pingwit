package project.cosmetology.dto;

import project.cosmetology.entity.OrderStatus;

import java.util.List;

public record OrderDto(Long id, OrderStatus orderStatus, List<ProductDto> productDtos) {
}
