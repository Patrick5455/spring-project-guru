package guru.springframework.services;

import guru.springframework.domains.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductServiceImpl implements ProductService{

    Map<Integer, Product> products;

    @Override
    public List<Product> listAllProducts(){

        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProductbyId(Integer id){

        return products.get(id);
    }

    public ProductServiceImpl(){
        loadProducts();
    }

    public void loadProducts (){

        products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("11.10"));
        product1.setImageURL("http://www.example.com/product1");

        products.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("21.20"));
        product2.setImageURL("http://www.example.com/product2");

        products.put(2,product2);


        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("31.30"));
        product3.setImageURL("http://www.example.com/product3");

        products.put(3,product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("41.40"));
        product4.setImageURL("http://www.example.com/product4");

        products.put(4, product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product 5");
        product5.setPrice(new BigDecimal("51.40"));
        product5.setImageURL("http://www.example.com/product5");

        products.put(5, product5);


    }

}
