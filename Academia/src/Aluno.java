import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    ArrayList<Treino> treinos = new ArrayList<Treino>();

    public Aluno(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
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
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void adicionarTreino(Treino t){
        treinos.add(t);
    }
    public void listarTreinos(){
        for(Treino t : treinos){
            System.out.println(t.getNomeExercicio());
            System.out.println(t.getQuantidadeSeries());
            System.out.println(t.getRepeticoes());
        }

    }

    public int quantidadeTreinos(){
        int cont = 0;
        for(Treino t : treinos){
            cont+=1;
        }
        return cont;
    }
    









}
