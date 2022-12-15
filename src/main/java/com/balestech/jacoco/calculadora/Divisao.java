package com.balestech.jacoco.calculadora;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Divisao implements Operacao{


    @Override
    public Double execute(List<Double> valores) {
        Double valorFinal = null;
        for(Double valor: valores){
            if(valorFinal == null){
                valorFinal = valor;
            }else{
                if(ehZero(valor)) throw new RuntimeException("Valor da lista não pode ser Zero!");
                valorFinal /= valor;
            }
        }
        return valorFinal;
    }

    public Boolean ehZero(Double valor){
        return valor == 0 ? true : false;
    }
}
