package co.edu.usco.pw.aplicacioncolegio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Asegúrate de que este nombre coincide con el nombre de tu archivo HTML
    }

    @GetMapping({"/home", "/"})
    public String home() {
        return "redirect:/events";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403"; // Asegúrate de tener 403.html en templates
    }
}
