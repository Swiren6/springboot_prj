package com.example.demo3.Controllers;


import com.example.demo3.Models.Provider;
import com.example.demo3.Services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/addProvider")
    public String addProvider(Model model) {
        Provider provider = new Provider();
        model.addAttribute("ProviderForm", provider);
        return "newProvider";
    }

    @RequestMapping(value = "/saveProvider", method = RequestMethod.POST)
    public String saveProvider(@ModelAttribute("ProviderForm") Provider provider) {
        providerService.createProvider(provider);
        return "redirect:/all";
    }
    @RequestMapping(value = "/updateProvider", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute("ProviderForm") Provider product) {
        providerService.updateProvider(product);
        return "redirect:/all";
    }

}
