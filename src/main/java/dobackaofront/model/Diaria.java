package dobackaofront.model;

public class Diaria {
    private String nome;
    final int diaria = 30;

    public Diaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaria() {
        return diaria;
    }

    @Override
    public String toString() {
        return "Diaria{" +
                "nome='" + nome + '\'' +
                ", diaria=" + diaria +
                '}';
    }
}
