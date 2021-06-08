package com.example.fitnessClub.controllers;

import com.example.fitnessClub.models.Person;
import com.example.fitnessClub.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class LoginController {

    private final PersonService personService;

    @PostMapping("/authorization")
    public String login(Person person) {
        String resultView = "views/login";
        if(personService.loginAndPasswordAreCorrect(person)) {
            switch (person.getRole().getName()) {
                case "USER": resultView = "views/mainPage"; break;
                case "COACH": resultView = "views/coachPage"; break;
                case "ADMIN": resultView = "views/adminPage"; break;
            }
        }
        return resultView;
    }
}
