package com.example.nba.controllers;

import com.example.nba.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")            //  this will add users to the start of all URL endpoints
public class DemoController {

    @RequestMapping("/nba")                                    //  this code will be reached by /users/
    public String nba(Model model) {

        //  the the userList page will be happy to display it
        return "nbaTeams";
    }

    @RequestMapping("/homes")                                    //  this code will be reached by /users/
    public String homes(Model model) {

        //  the the userList page will be happy to display it
        return "homes";
    }

    @RequestMapping("/mlb")                                    //  this code will be reached by /users/
    public String mlb(Model model) {

        //  the the userList page will be happy to display it
        return "MLBTeams";
    }
}
