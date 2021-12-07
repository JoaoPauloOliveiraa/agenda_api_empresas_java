
package com.desafio21diasmultiplasapis.empresas.controllers;

import java.util.ArrayList;
import java.util.List;

import com.desafio21diasmultiplasapis.empresas.models.Empresa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresasController {    
    @GetMapping("/empresas")
    public List<Empresa> index(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        return empresas;
    }

    @GetMapping("/empresas/{id}")
    public Empresa show(@PathVariable int id)
    {
        Empresa empresa = new Empresa();
        empresa.setId(id);
        return empresa;
    }

}
