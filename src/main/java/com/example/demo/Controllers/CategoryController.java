package com.example.demo3.Controllers;


import com.example.demo3.Models.Category;
import com.example.demo3.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/addCategory")
    public String addCategory(Model model) {
        Category category = new Category();
        model.addAttribute("CategoryForm", category);
        return "new";
    }

    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public String saveCategory(@ModelAttribute("CategoryForm") Category category) {
        categoryService.createCategory(category);
        return "redirect:/all";
    }
    @RequestMapping(value = "/updateCategory", method = RequestMethod.POST)
    public String updateCategory(@ModelAttribute("CategoryForm") Category category) {
        categoryService.updateUser(category);
        return "redirect:/all";
    }

}

