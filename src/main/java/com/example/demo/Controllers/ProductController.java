package com.example.demo3.Controllers;

import com.example.demo3.Models.Product;
import com.example.demo3.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/addProduct")
    public String addProduct(Model model) {
        Product product = new Product();
        model.addAttribute("ProductForm", product);
        return "new_product";
    }

    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("ProductForm") Product product) {
        productService.createProduct(product);
        return "redirect:/all";
    }
    @RequestMapping("/all")
    public String listProducts (Model model) {
        List<Product> listproducts = productService.getAllProducts();
        model.addAttribute("liste_products", listproducts);
        return "liste_products";
    }
    @RequestMapping("delete/{id}")
    public String deleteProduct(@PathVariable ("id") long id ) {
        productService.deleteProduct(id);
        return "redirect:/all";
    }
    @RequestMapping("edit/{id}")
    public String showUpdateProduct(@PathVariable ("id") long id ,Model model) {
        Optional<Product> product =productService.getProductById(id);
        model.addAttribute("Product", product);
        return "update_product";
    }
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute("ProductForm") Product product) {
        productService.updateProduct(product);
        return "redirect:/all";
    }
}
