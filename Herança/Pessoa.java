package Herança.CursoEmVideo;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade++;
        System.out.println("Parabens, voce acaba de completar " + this.idade + " anos de idade!");
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

    
}
