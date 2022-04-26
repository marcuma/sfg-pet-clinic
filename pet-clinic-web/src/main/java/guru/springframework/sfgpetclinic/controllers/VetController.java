package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @GetMapping({"/vets", "/vets/index", "/vets/index.html", "vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        model.addAttribute("title", "Vets Index Page");
        return "vets/vetList";
    }
}
