
package com.desafio21diasmultiplasapis.empresas.controllers;
import com.desafio21diasmultiplasapis.model_views.Home;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {    
    @GetMapping("/")
    public Home index(){
        return new Home();
    }

}
