public class Turma {
    private final int IDENTIFICADOR;
    private Aluno aluno01;
    private Aluno aluno02;
    private Aluno aluno03;
    private Aluno aluno04;
    private Aluno aluno05;

    public Turma (int identificadorC) {
        this.IDENTIFICADOR = identificadorC;
    }

    public void inserirAluno (Aluno aluno) {
        if (aluno01 == null) {
            aluno01 = aluno;
        } else if (aluno02 == null) {
            aluno02 = aluno;
        } else if (aluno03 == null) {
            aluno03 = aluno;
        } else if (aluno04 == null) {
            aluno04 = aluno;
        } else if (aluno05 == null) {
            aluno05 = aluno;
        }
    }

    public int quantidadeAlunos() {
        int count = 0;
        if(aluno01 != null) count++;
        if(aluno02 != null) count++;
        if(aluno03 != null) count++;
        if(aluno04 != null) count++;
        if(aluno05 != null) count++;
        return count;
    }

    public double mediaTurma () {
        double soma = 0;
        int count = quantidadeAlunos();

        if (aluno01 != null) soma += aluno01.getNota();
        if (aluno02 != null) soma += aluno02.getNota();
        if (aluno03 != null) soma += aluno03.getNota();
        if (aluno04 != null) soma += aluno04.getNota();
        if (aluno05 != null) soma += aluno05.getNota();

        if (count == 0) return 0.0;
        return soma / count;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "identificador=" + IDENTIFICADOR +
                ", aluno01=" + aluno01 +
                ", aluno02=" + aluno02 +
                ", aluno03=" + aluno03 +
                ", aluno04=" + aluno04 +
                ", aluno05=" + aluno05 +
                '}';
    }


}
