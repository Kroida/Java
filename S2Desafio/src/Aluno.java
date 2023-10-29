public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private double nota;
    boolean inserir;

    public Aluno(String nomeC, int idadeC, String matriculaC, double notaC) {
        this.nome = nomeC;
        this.idade = idadeC;
        this.matricula = matriculaC;
        this.nota = notaC;
    }

    public void inserirAluno () {
        inserir = true;

    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", nota=" + nota +
                '}';
    }
}