import java.util.ArrayList;
import java.util.List;

public class Revenda {
    public String placa;
    public String marca;
    public String modelo;
    public int ano;
    public double preco;
    private List<Veiculo> listaVeiculos; //Criação da lista array

    public Revenda () {
        listaVeiculos = new ArrayList<>(); //instanciando a lista
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo); //adicionar à lista
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo); //remover da lista
    }

    public void listarVeiculos() {
        System.out.println("--- Veiculos na Revenda ---");
        for(Veiculo veiculos : listaVeiculos) {
            System.out.println(veiculos);
        }
        System.out.println("Quantidade de Veículos: " + listaVeiculos.size());
    } //exibir a lista

    public void aplicarDesconto(String placa, double valorDesconto) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculo.aplicarDesconto(valorDesconto);
                return; // Saia do loop após aplicar o desconto
            }
        }
        System.out.println("Veículo com placa " + placa + " não encontrado."); //caso não encontre a placa
    }

}
