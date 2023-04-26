package cart.controller;


import cart.entity.ProductEntity;
import cart.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    private final ProductService productService;

    public MainController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/admin")
    public String adminPage(final Model model){
        final List<ProductEntity> all = productService.findAll();
        model.addAttribute("products", all);
        return "admin";
    }

//    @GetMapping
//    public String rootPage(Model model){
//        final List<ProductEntity>
//        return "index";
//    }
}
