package dabrowski.bartosz.springpetclinic.controllers;

import dabrowski.bartosz.springpetclinic.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets", "/vets.html"})
@Controller
@AllArgsConstructor
public class VetController {

    private final VetService vetService;

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
