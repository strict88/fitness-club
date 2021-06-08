package com.example.fitnessClub.controllers;

import com.example.fitnessClub.models.Person;
import com.example.fitnessClub.models.Role;
import com.example.fitnessClub.services.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private final PersonServiceImpl personService;

    @Autowired
    public RegistrationController (PersonServiceImpl personService) {
        this.personService = personService;
    }

    @GetMapping("/prepRegister")
    public String preRegister(Model model) {
        model.addAttribute("person", new Person());
        return "views/registration";
    }

    @PostMapping
    public String register(@ModelAttribute Person person, Model model) {
        personService.personExists(person.getLogin());
        model.addAttribute("personLogin", person.getLogin());
        personService.createPerson(person);
        return "views/successful";
    }

}
