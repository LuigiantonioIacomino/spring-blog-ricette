package com.learning.blogricette.controller;

import com.learning.blogricette.model.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/ricetta")
public class RicettaController {
  @Autowired
  private com.learning.blogricette.repository.ricettaRepository ricettaRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("ricettaList",ricettaRepository.findAll());
        return "show";
    }




}
