package dabrowski.bartosz.springpetclinic.controllers;

import dabrowski.bartosz.springpetclinic.model.Vet;
import dabrowski.bartosz.springpetclinic.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@RequestMapping({"/vets", "/vets.html"})
@Controller
@AllArgsConstructor
public class VetController {

    private final VetService vetService;

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

    @GetMapping("/api")
    public @ResponseBody Set<Vet> getVetsJson(){
        return vetService.findAll();
    }
}
