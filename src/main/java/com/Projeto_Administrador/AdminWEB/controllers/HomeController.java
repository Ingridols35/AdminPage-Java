package com.Projeto_Administrador.AdminWEB.controllers;
        import java.io.UnsupportedEncodingException;
        import jakarta.servlet.http.HttpServletRequest;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model, HttpServletRequest request) throws UnsupportedEncodingException{
        return "home/index";
    }
}