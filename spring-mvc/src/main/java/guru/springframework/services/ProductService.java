package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

public interface ProductService {


    List<Product> listProduct ();

    Product getProductId (Integer id);
}
