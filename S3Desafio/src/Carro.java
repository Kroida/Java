public class Carro extends Veiculo implements Promocao {
    public int qtdPortas;
    public Carro(String placa, String marca, String modelo, int ano, double preco, int qtdPortas) {
        super(placa, marca, modelo, ano, preco);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String exibirDetalhes() {
        return "\n--- Detalhes do Carro ---" + "\nPlaca: " + super.placa + "\nMarca: " + super.marca + "\nModelo: " + super.modelo + "\nAno: " + super.ano + "\nPreco: " + super.preco + "\nQuantidade de portas: " + this.qtdPortas + "\n";
    }

    @Override
    public double aplicarDesconto(double valor) {
        if(valor > 0.10*preco) {
            System.out.println("Valor inválido. O desconto só é aplícavel até 10% do valor total do produto.");
        } else {
            System.out.println("Desconto aplicado com sucesso!");
            preco = preco - valor;
        }

        return preco;
    }

    public String toString() {
        return "Carro: " + this.getModelo();
    }
}

