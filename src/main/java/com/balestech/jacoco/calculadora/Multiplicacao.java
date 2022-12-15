package com.balestech.jacoco.calculadora;

import java.util.List;

public class Multiplicacao implements Operacao{
    @Override
    public Double execute(List<Double> valores) {
        Double valorFinal = null;
        for(Double valor: valores){
            if(valorFinal == null){
                valorFinal = valor;
            }else{
                valorFinal *= valor;
            }
        }
        return valorFinal;
    }
}
