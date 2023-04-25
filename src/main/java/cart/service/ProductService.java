package cart.service;

import cart.dto.ProductCreateDto;
import cart.entity.ProductEntity;
import cart.repository.ProductDao;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductDao productDao;

    public ProductService(final ProductDao productDao) {
        this.productDao = productDao;
    }

    public int create(final ProductCreateDto productCreateDto) {
        return productDao.create(dtoToEntity(productCreateDto));
    }

    private ProductEntity dtoToEntity(final ProductCreateDto productCreateDto) {
        return new ProductEntity(productCreateDto.getName(),
                productCreateDto.getImage(),
                productCreateDto.getPrice());
    }
}
