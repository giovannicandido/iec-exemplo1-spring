package pro.gsilva.exemplo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import pro.gsilva.exemplo1.dto.Resultado;
import pro.gsilva.exemplo1.service.Calculador;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculadoraController {
    @Autowired
    private Calculador calculador;

    @RequestMapping(value="/calcular", method=RequestMethod.GET)
    public Resultado calcular(@RequestParam(required = true) Integer valor) {
        int resultado = calculador.calcular(valor);
        return new Resultado(resultado);
    }
    
}
