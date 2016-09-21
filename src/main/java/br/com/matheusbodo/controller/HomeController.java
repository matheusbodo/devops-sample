package br.com.matheusbodo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	public static String TESTE = "Teste";
	
    @RequestMapping("/")
    public String index() {
        return "Bem vindo, Matheus!";
    }

}
