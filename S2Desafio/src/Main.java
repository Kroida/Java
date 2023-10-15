public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Joao", 15, "A123", 6.0);
        Aluno aluno02 = new Aluno("Maria", 14, "A123", 5.0);
        Aluno aluno03 = new Aluno("Carlos", 15, "A123", 8.0);
        Aluno aluno04 = new Aluno("Joaquim", 16, "A123", 5.9);
        Aluno aluno05 = new Aluno("Fernanda", 15, "A123", 10.0);
        Aluno aluno06 = new Aluno("Joseani", 17, "A123", 9.0);
        Aluno aluno07 = new Aluno("Karla", 15, "A123", 7.0);
        Aluno aluno08 = new Aluno("Marcos", 18, "A123", 1.0);

        Turma turma01 = new Turma(1);
        Turma turma02 = new Turma(2);

        turma01.inserirAluno(aluno01);
        turma01.inserirAluno(aluno02);
        turma01.inserirAluno(aluno03);
        turma01.inserirAluno(aluno04);
        turma01.inserirAluno(aluno05);

        turma02.inserirAluno(aluno06);
        turma02.inserirAluno(aluno07);
        turma02.inserirAluno(aluno08);

        System.out.println(turma01);
        System.out.println(turma02);

        System.out.println("Quantidade de alunos da turma 1: " + turma01.quantidadeAlunos());
        System.out.println("Quantidade de alunos da turma 2: " + turma02.quantidadeAlunos());

        System.out.println("Média da turma 1: " + Math.round(turma01.mediaTurma()));
        System.out.println("Média da turma 2: " + Math.round(turma02.mediaTurma()));

    }
}
