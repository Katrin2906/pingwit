package project.cosmetology.service;

import org.springframework.stereotype.Component;
import project.cosmetology.dto.ProductDto;
import project.cosmetology.entity.Product;

import java.util.List;

@Component
public class ProductConverter {
    public Product toLocal(ProductDto dto) {
        if (dto == null) {
            return null;
        }

        Product product = new Product();

        product.setId(dto.id());
        product.setPrice(dto.price());
        product.setProductName(dto.productName());
        product.setProducer(dto.producer());
        product.setCompound(dto.compound());
        product.setVolume(dto.volume());

        return product;
    }

    public ProductDto toFront(Product product) {
        if (product == null) {
            return null;
        }

        return new ProductDto(product.getId(), product.getProductName(), product.getVolume(), product.getPrice(), product.getCompound(), product.getProducer());
    }

    public List<Product> toLocal(List<ProductDto> productDtos) {
        if (productDtos == null) {
            return null;
        }

        return productDtos.stream()
                .map(this::toLocal)
                .toList();
    }

    public List<ProductDto> toFront(List<Product> products) {
        if (products == null) {
            return null;
        }

        return products.stream()
                .map(this::toFront)
                .toList();
    }

}
