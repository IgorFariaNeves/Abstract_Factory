package br.com.fabricaveiculos;

public class Main {
    public static void main(String[] args) {
        VeiculoFactory carroFactory = new CarroFactory();
        VeiculoFactory motoFactory = new MotoFactory();

        Montadora montadoraCarros = new Montadora(carroFactory);
        Montadora montadoraMotos = new Montadora(motoFactory);

        System.out.println("Fabricação de Carros:");
        montadoraCarros.fabricarVeiculos();

        System.out.println("\nFabricação de Motos:");
        montadoraMotos.fabricarVeiculos();
    }
}
