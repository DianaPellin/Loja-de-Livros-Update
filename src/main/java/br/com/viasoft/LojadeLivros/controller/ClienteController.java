package br.com.viasoft.LojadeLivros.controller;


import br.com.viasoft.LojadeLivros.model.Cliente;
import br.com.viasoft.LojadeLivros.model.Produto;
import br.com.viasoft.LojadeLivros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/cliente")
    public String getCliente(Model model) {
        List<Cliente> listaDeClientes = clienteRepository.findAll();
        model.addAttribute("lista", listaDeClientes);

        return "pagclientes";
    }
}

