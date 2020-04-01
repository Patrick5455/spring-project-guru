package guru.springframework.services;

import guru.springframework.domains.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductbyId (Integer id);
}
