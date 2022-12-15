package com.balestech.jacoco.calculadora;

import java.util.List;

public class Soma implements Operacao{
    @Override
    public Double execute(List<Double> valores) {
        Double valorFinal = valores.get(0);
        for(int i = 1; i < valores.size(); i++) {
            valorFinal += valores.get(i);
        }
        return valorFinal;
    }
}
