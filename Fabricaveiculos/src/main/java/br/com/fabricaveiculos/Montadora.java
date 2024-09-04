package br.com.fabricaveiculos;

public class Montadora {
    private VeiculoFactory veiculoFactory;

    public Montadora(VeiculoFactory factory) {
        this.veiculoFactory = factory;
    }

    public void fabricarVeiculos() {
        Veiculo veiculoLuxo = veiculoFactory.criarVeiculoLuxo();
        Veiculo veiculoPopular = veiculoFactory.criarVeiculoPopular();

        veiculoLuxo.exibirInfo();
        veiculoPopular.exibirInfo();
    }
}
