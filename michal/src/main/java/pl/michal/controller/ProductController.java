package pl.michal.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.michal.ProductFinder;
import pl.michal.service.ProductService;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    private final ProductFinder productFinder;

    @GetMapping("/get")
    ModelAndView getProducts(){
        ModelAndView modelAndView = new ModelAndView("products.html");
        modelAndView.addObject("products", productFinder.productList());
        return modelAndView;
    }

}
