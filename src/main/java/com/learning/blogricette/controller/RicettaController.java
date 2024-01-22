package com.learning.blogricette.controller;
import com.learning.blogricette.model.Ricetta;
import com.learning.blogricette.repository.RicettaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
@RequestMapping("/ricetta")
public class RicettaController {

@Autowired
private RicettaRepository ricettaRepository;

@GetMapping
public String index(Model model) {
        model.addAttribute("ricettaList",ricettaRepository.findAll());
        return "show";
    }

@GetMapping("/create")
public String crea() {
    return "create";
}

@GetMapping("/detail/{id}")
public String dettaglio(@PathVariable Integer id,Model model) {
    Optional<Ricetta> result=ricettaRepository.findById(id);
        Ricetta ricetta= result.get();
        model.addAttribute("ricetta",ricetta);
        return "detail";
}




}
