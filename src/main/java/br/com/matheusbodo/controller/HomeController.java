package br.com.matheusbodo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
    	int i = 0;
    	while (i == 0) {
    		System.out.println("Teste");
    	}
        return "Bem vindo, Matheus!";
    }

}
