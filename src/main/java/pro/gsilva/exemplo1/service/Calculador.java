package pro.gsilva.exemplo1.service;

import org.springframework.stereotype.Service;

@Service
public class Calculador {
    public int calcular(int valor) {
        return valor * 2;
    }
}
