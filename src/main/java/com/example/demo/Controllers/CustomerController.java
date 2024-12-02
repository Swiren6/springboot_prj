package com.example.demo3.Controllers;


import com.example.demo3.Models.Category;
import com.example.demo3.Models.Customer;
import com.example.demo3.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/addCustomer")
    public String addCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("CustomerForm", customer);
        return "newCustomer";
    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("CustomerForm") Customer customer) {
        customerService.createCustomer(customer);
        return "redirect:/all";
    }
    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("CustomerForm") Customer customer) {
        customerService.updateCustomer(customer);
        return "redirect:/all";
    }

}
