package br.com.fabricaveiculos;

public class CarroFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculoLuxo() {
        return new CarroLuxo();
    }

    @Override
    public Veiculo criarVeiculoPopular() {
        return new CarroPopular();
    }
}
