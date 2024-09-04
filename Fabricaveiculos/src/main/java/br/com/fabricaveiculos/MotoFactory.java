package br.com.fabricaveiculos;

public class MotoFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculoLuxo() {
        return new MotoLuxo();
    }

    @Override
    public Veiculo criarVeiculoPopular() {
        return new MotoPopular();
    }
}
