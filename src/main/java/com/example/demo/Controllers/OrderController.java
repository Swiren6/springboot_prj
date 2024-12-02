package com.example.demo3.Controllers;


import com.example.demo3.Models.Order;
import com.example.demo3.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/addOrder")
    public String addOrder(Model model) {
        Order order = new Order();
        model.addAttribute("OrderForm", order);
        return "newOrder";
    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("OrderForm") Order order) {
        orderService.createOrder(order);
        return "redirect:/all";
    }
    @RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
    public String updateOrder(@ModelAttribute("OrderForm") Order order) {
        orderService.updateOrder(order);
        return "redirect:/all";
    }

}
