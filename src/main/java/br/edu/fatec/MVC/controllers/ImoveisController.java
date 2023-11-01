package br.edu.fatec.MVC.controllers;

import br.edu.fatec.MVC.models.Imoveis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping ("/imoveis")

public class ImoveisController {

    private static final List <Imoveis>
            imoveis = new ArrayList<>();

    public ImoveisController() {
        imoveis.add(new Imoveis(01,"Ponta da Praia/ Santos",120,3000));
        imoveis.add(new Imoveis(02,"Pompeia/ Santos",35,1300));
        imoveis.add(new Imoveis(03,"Centro / Santos",2500,50000));
    }

    @GetMapping
    public String getImoveis(Model model)
    {
        model.addAttribute("imoveis",imoveis);
        return "imoveis";
    }
}

