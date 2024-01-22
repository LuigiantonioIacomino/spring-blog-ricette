package com.learning.blogricette.controller;
import com.learning.blogricette.model.Ricetta;
import com.learning.blogricette.repository.RicettaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
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



@GetMapping("/detail/{id}")
public String dettaglio(@PathVariable Integer id,Model model) {
    Optional<Ricetta> result=ricettaRepository.findById(id);
        Ricetta ricetta= result.get();
        model.addAttribute("ricetta",ricetta);
        return "detail";
}

@GetMapping("/create")
public String view(Model model) {
        Ricetta ricetta=new Ricetta();
        model.addAttribute("ricetta",ricetta);
        return "create";
    }


@PostMapping("/create")
public String store(@Valid @ModelAttribute("ricetta") Ricetta formRicetta, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
        return "/create";
    }
    Optional<Ricetta> ricetta=ricettaRepository.findByNome(formRicetta.getNome());
    if(ricetta.isPresent()) {
        bindingResult.addError(new FieldError("ricetta", "nome", formRicetta.getNome(), false, null, null,
                "Non puoi mettere un altra pizza"));
        return "create";
    }
    else {
        Ricetta savedRicetta = ricettaRepository.save(formRicetta);
        return "redirect:/ricetta/detail/" + savedRicetta.getId();
    }

}


@PostMapping("/delete/{id}")
    public String cancella(@PathVariable Integer id,Model model) {
    Optional<Ricetta> result=ricettaRepository.findById(id);
    if(result.isPresent()) {
        ricettaRepository.deleteById(id);
        model.addAttribute("ricettaList",ricettaRepository.findAll());
        return "show";
    }
    else {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book with di " + id + " not found");
    }

}

@GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id,Model model) {
    Optional<Ricetta> result=ricettaRepository.findById(id);
    Ricetta ricetta= result.get();
    Ricetta ricettaTem=new Ricetta();
    ricettaTem.setId(ricetta.getId());
    ricettaTem.setNome(ricetta.getNome());
    ricettaTem.setIngredienti(ricetta.getIngredienti());
    ricettaTem.setFoto(ricetta.getFoto());
    ricettaTem.setTempo_preparazione(ricetta.getTempo_preparazione());
    ricettaTem.setNumero_porzioni(ricetta.getNumero_porzioni());
    ricettaTem.setTesto(ricetta.getTesto());
    model.addAttribute("ricetta",ricettaTem);
    return "edit";
}

@PostMapping("/edit/{id}")
    public String edit_due(@PathVariable Integer id,@Valid @ModelAttribute("ricetta") Ricetta formRicetta) {
    Ricetta savedRicetta = ricettaRepository.save(formRicetta);
    return "detail";
}







}
