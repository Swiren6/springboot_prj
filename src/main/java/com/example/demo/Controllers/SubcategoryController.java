package com.example.demo3.Controllers;


import com.example.demo3.Models.Provider;
import com.example.demo3.Models.Subcategory;
import com.example.demo3.Services.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubcategoryController {

    @Autowired
    private SubcategoryService subcategoryService;

    @RequestMapping("/addSubcategory")
    public String addSubcategory(Model model) {
        Subcategory subcategory = new Subcategory();
        model.addAttribute("SubcategoryForm", subcategory);
        return "newSubcategory";
    }

    @RequestMapping(value = "/saveSubcategory", method = RequestMethod.POST)
    public String saveSubcategory(@ModelAttribute("SubcategoryForm") Subcategory subcategory) {
        subcategoryService.createSubcategory(subcategory);
        return "redirect:/all";
    }

    @RequestMapping(value = "/updateSubcategory", method = RequestMethod.POST)
    public String updateSubcategory(@ModelAttribute("SubcategoryForm") Subcategory subcategory) {
        subcategoryService.updateSubcategory(subcategory);
        return "redirect:/all";
    }
}
