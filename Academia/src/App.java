public class App {
    public static void main(String[] args) throws Exception {
    Treino t1 = new Treino("Musculação", 3, 3);
    Treino t2 = new Treino("Aerobico", 3, 3);
    Treino t3 = new Treino("Pilates", 3, 3);
    Treino t4 = new Treino("Yoga", 3, 3);

    Aluno a1 = new Aluno("Benji", 24, 60);
    a1.adicionarTreino(t1);
    a1.adicionarTreino(t2);
    a1.adicionarTreino(t3);
    Aluno a2 = new Aluno("Jay", 30, 70);
    a2.adicionarTreino(t1);
    a2.adicionarTreino(t4);
    a2.adicionarTreino(t3);
    Aluno a3 = new Aluno("Kali", 40, 75);
    a3.adicionarTreino(t1);
    a3.adicionarTreino(t2);
    a3.adicionarTreino(t4);
    Aluno a4 = new Aluno("Gab", 18, 65);
    a4.adicionarTreino(t1);
    a4.adicionarTreino(t2);
    a4.adicionarTreino(t3);
    a4.adicionarTreino(t4);
    
    Academia acad = new Academia("Eya");

    acad.matricularAluno(a1);
    acad.matricularAluno(a2);
    acad.matricularAluno(a3);
    acad.matricularAluno(a4);
   
    acad.listarAlunos();
    System.out.println();

    System.out.println(acad.calcularMediaIdade());
    System.out.println();

    acad.maiorQuantidadeTreinos();
    System.out.println();

    System.out.println(acad.quantidadeTreinoAcademia());


    }
}
