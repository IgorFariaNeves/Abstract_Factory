package br.com.fabricaveiculos.test;

import br.com.fabricaveiculos.CarroFactory;
import br.com.fabricaveiculos.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarroFactoryTest {

    @Test
    public void testCriarVeiculoLuxo() {
        CarroFactory factory = new CarroFactory();
        Veiculo veiculo = factory.criarVeiculoLuxo();
        assertTrue(veiculo instanceof br.com.fabricaveiculos.CarroLuxo);
    }

    @Test
    public void testCriarVeiculoPopular() {
        CarroFactory factory = new CarroFactory();
        Veiculo veiculo = factory.criarVeiculoPopular();
        assertTrue(veiculo instanceof br.com.fabricaveiculos.CarroPopular);
    }
}
