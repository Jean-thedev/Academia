import java.util.ArrayList;

public class Academia {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private String nome;

    public Academia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void matricularAluno(Aluno al) {
        alunos.add(al);
    }

    public void listarAlunos(){

        for(Aluno al : alunos){
          System.out.println(al.getNome());
        }
    }

    public double calcularMediaIdade(){
        double media = 0;
        for(Aluno al : alunos){
            media += al.getIdade();
        }
        return media/alunos.size();
    }

    public void maiorQuantidadeTreinos(){
        Aluno maior = alunos.get(0);
        for(Aluno al : alunos){
            if(al.quantidadeTreinos()>maior.quantidadeTreinos()){
                maior = al;
            }
        }
        System.out.println(maior.getNome());
}

    public int quantidadeTreinoAcademia(){
        int cont = 0;
        for(Aluno al : alunos){
            cont += al.quantidadeTreinos();
        }
        return cont;
    }
}
