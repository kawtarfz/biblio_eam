package com.example.demo.web;

import com.example.demo.dto.EmpruntDto;
import com.example.demo.dto.EmpruntDtoNew;
import com.example.demo.service.IEmpruntService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpruntController {
    @Autowired
    private IEmpruntService iEmpruntService;

    @GetMapping("/Emprunts")
    public String listRSV(Model model,
                          @RequestParam(name = "id" , defaultValue = "1") Long id,
                          @RequestParam(name = "page", defaultValue = "0") int page,
                          @RequestParam(name = "size", defaultValue = "5") int size){
        Page<EmpruntDto> emprunts = iEmpruntService.getAllEmprunts(id, PageRequest.of(page, size));
        model.addAttribute("listEmprunts", emprunts.getContent());
        model.addAttribute("pages",new int[emprunts.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("id", id);
        return "Emplist";

    }

    @GetMapping("/formEmprunts")
    public String showForm(Model model) {
        model.addAttribute("emprunt", new EmpruntDtoNew());
        return "ajouterEmp";
    }


    @PostMapping("/save")
    public String saveReservation(@Valid @ModelAttribute("emprunt") EmpruntDtoNew empruntDtoNew, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ajouterEmp";
        }
        iEmpruntService.addEmprunt(empruntDtoNew);
        return "redirect:/Emprunts";
    }

}
