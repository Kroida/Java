public class Main {
    public static void main(String[] args) {
        Carro carro01 = new Carro("ABC-1234", "Toyota", "Corolla", 2018, 30000, 4);
        Carro carro02 = new Carro("XYZ-5678", "Honda", "Civic", 2020, 22500, 4);
        Carro carro03 = new Carro("MNO-2468", "Volkswagen", "Golf", 2017, 18200, 2);
        Moto moto01 = new Moto("PWR-246", "Kawasaki", "Ninja 300", 2017, 4900, "Tambor");
        Moto moto02 = new Moto("LKZ-456", "Yamaha", "MT-07", 2020, 7200, "ABS");

        Revenda revenda = new Revenda();

        revenda.adicionarVeiculo(carro01);
        revenda.adicionarVeiculo(moto01);
        revenda.listarVeiculos();

        System.out.println(carro01.exibirDetalhes());

        revenda.aplicarDesconto("ABC-1234", 5000);
        System.out.println(carro01.preco);

        revenda.listarVeiculos();
        System.out.println(moto01.preco);
        revenda.aplicarDesconto("PWR-246",245);
        System.out.println(moto01.preco);

        revenda.removerVeiculo(moto01);
        revenda.listarVeiculos();

    }
}