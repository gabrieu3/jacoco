package com.balestech.jacoco.calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomaTest {

    @InjectMocks
    Soma somaMock;

    @Test
    public void validaSomaUm(){
        final Double expected = new Double("10");
        assertEquals(expected, somaMock.execute(getListaUmElementoMock()));
    }

    @Test
    public void validaSomaVarios(){
        final Double expected = new Double("20.511325");
        assertEquals(expected, somaMock.execute(getListaVariosElementosMock()));
    }

    private List<Double> getListaUmElementoMock(){
        List<Double> lista = new ArrayList<>();
        lista.add(10.0);
        return lista;
    }

    private List<Double> getListaVariosElementosMock(){
        List<Double> lista = new ArrayList<>();
        lista.add(10.0);
        lista.add(3.0);
        lista.add(7.0);
        lista.add(0.511325);
        return lista;
    }
}
