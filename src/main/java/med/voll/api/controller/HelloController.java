package med.voll.api.controller; //<- O .controller cria uma subclass para organizar melhor o projeto

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController            //Anotação para RestController
@RequestMapping("/hello") //Anotação para mapeamento da requisição
public class HelloController {
    @GetMapping             //se for uma requisição do tipo GET chama o metodo olaMundo()
    public String olaMundo(){
        //retorna o Hello World no end: localhost:8080/hello
        return "Hello World! GETONIO CASTRO";
    }

}
