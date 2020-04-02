package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String productList(Model model){

        model.addAttribute("products", productService.listProduct());

        return "products";
    }

    @RequestMapping("/product/{id}")
    public String getProduct (@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProductId(id));

        return "product";

    }
}
