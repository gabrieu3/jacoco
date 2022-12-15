package com.balestech.jacoco.calculadora;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Subtracao implements Operacao {
    @Override
    public Double execute(List<Double> valores) {
        Double valorFinal = valores.get(0);
        for(int i = 1; i < valores.size(); i++) {
            valorFinal *= valores.get(i);
        }
        return valorFinal;
    }
}
