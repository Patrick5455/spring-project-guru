package guru.springframework.services;

import guru.springframework.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements  ProductService{

    Map <Integer, Product> productMap;

    @Override
    public List<Product> listProduct(){
        return new ArrayList<>(productMap.values());
    }

    public ProductServiceImpl (){
        listAllProducts();
    }

    private void listAllProducts() {

        productMap = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product Name");
        product1.setPrice(new BigDecimal("10.10"));
        product1.setImageUrl("https://www.example.com/product1");

        productMap.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product 2");
        product2.setPrice(new BigDecimal("20.20"));
        product2.setImageUrl("https://www.example.com/product2");

        productMap.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Product 3");
        product3.setPrice(new BigDecimal("30.30"));
        product3.setImageUrl("https://www.example.com/product3");

        productMap.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setName("Product 4");
        product4.setPrice(new BigDecimal("40.40"));
        product4.setImageUrl("https://www.example.com/product4");

        productMap.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setName("Product 5");
        product5.setPrice(new BigDecimal("50.50"));
        product5.setImageUrl("https://www.example.com/product5");

        productMap.put(5, product5);

    }

}
