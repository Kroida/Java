public class Moto extends Veiculo implements  Promocao{
    public String tipoFreio;

    public Moto (String placa, String marca, String modelo, int ano, double preco, String tipoFreio) {
        super(placa, marca, modelo, ano, preco);
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String exibirDetalhes() {
        return "\n--- Detalhes da Moto ---" + "\nPlaca: " + super.placa + "\nMarca: " + super.marca + "\nModelo: " + super.modelo + "\nAno: " + super.ano + "\nPreco: " + super.preco + "\nTipo de freio: " + this.tipoFreio + "\n";
    }

    @Override
    public double aplicarDesconto(double valor) {
        if(valor > 0.05*preco) {
            System.out.println("Valor inválido. O desconto só é aplícavel até 5% do valor total do produto.");
        } else {
            System.out.println("Desconto aplicado com sucesso!");
            preco = preco - valor;
        }

        return preco;
    }

    public String toString() {
        return "Moto: " + this.getModelo();
    }
}
