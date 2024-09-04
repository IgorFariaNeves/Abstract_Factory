package br.com.fabricaveiculos.test;

import br.com.fabricaveiculos.MotoFactory;
import br.com.fabricaveiculos.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotoFactoryTest {

    @Test
    public void testCriarVeiculoLuxo() {
        MotoFactory factory = new MotoFactory();
        Veiculo veiculo = factory.criarVeiculoLuxo();
        assertTrue(veiculo instanceof br.com.fabricaveiculos.MotoLuxo);
    }

    @Test
    public void testCriarVeiculoPopular() {
        MotoFactory factory = new MotoFactory();
        Veiculo veiculo = factory.criarVeiculoPopular();
        assertTrue(veiculo instanceof br.com.fabricaveiculos.MotoPopular);
    }
}
