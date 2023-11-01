package br.edu.fatec.MVC.controllers;

import br.edu.fatec.MVC.models.Imoveis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/imoveis")
public class DadosController {
    private static final List<Imoveis>
            imoveis = new ArrayList<Imoveis>();

    public DadosController() {
        imoveis.add(new Imoveis(01,"Ponta da Praia/ Santos",120,3000));
        imoveis.add(new Imoveis(02,"Pompeia/ Santos",35,1300));
        imoveis.add(new Imoveis(03,"Centro / Santos",2500,50000));
    }

    @GetMapping
    public List<Imoveis> getImoveis()
    {
        return imoveis;
    }
}