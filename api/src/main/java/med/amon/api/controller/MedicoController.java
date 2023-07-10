package med.amon.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MedicoController {
    

    @PostMapping("medicos")
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }
}
