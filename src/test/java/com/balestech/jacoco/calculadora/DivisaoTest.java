package com.balestech.jacoco.calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DivisaoTest {

    @InjectMocks
    Divisao divisaoMock;

    @Test(expected = RuntimeException.class)
    public void validaDivisaoPorZero() {
        divisaoMock.execute(getListaDivisaoZeroMock());
    }

    @Test
    public void validaDivisaoPorEleMesmo() {
        Double expectedValue = new Double("5");
        assertEquals(expectedValue, divisaoMock.execute(getListaDivisaoEleMesmoMock()));
    }

    @Test
    public void validaDivisaoPorDoisElementos() {
        Double expectedValue = new Double("2");
        assertEquals(expectedValue, divisaoMock.execute(getListaDivisaoPorDoisElementosMock()));
    }

    private List<Double> getListaDivisaoZeroMock() {
        List<Double> valoresList = new ArrayList<>();
        valoresList.add(5.0);
        valoresList.add(3.0);
        valoresList.add(0.0);
        valoresList.add(5.0);
        return valoresList;
    }

    private List<Double> getListaDivisaoEleMesmoMock() {
        List<Double> valoresList = new ArrayList<>();
        valoresList.add(5.0);
        return valoresList;
    }

    private List<Double> getListaDivisaoPorDoisElementosMock() {
        List<Double> valoresList = new ArrayList<>();
        valoresList.add(6.0);
        valoresList.add(3.0);
        return valoresList;
    }
}
