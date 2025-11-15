package dobackaofront.model;

public class Exercicios {
    private String nome;
    private int quantidadeDeRepeticoes;
    private int carga;

    public Exercicios(String nome, int quantidadeDeRepeticoes, int carga) {
        this.nome = nome;
        this.quantidadeDeRepeticoes = quantidadeDeRepeticoes;
        this.carga = carga;
    }

    public Exercicios(String nome, int carga, String quantidadeDeRepeticoes) {
        this.nome = nome;
        this.carga = 0;
        this.quantidadeDeRepeticoes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeRepeticoes() {
        return quantidadeDeRepeticoes;
    }

    public void setQuantidadeDeRepeticoes(int quantidadeDeRepeticoes) {
        this.quantidadeDeRepeticoes = quantidadeDeRepeticoes;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Exercicios{" +
                "nome='" + nome + '\'' +
                ", quantidadeDeRepeticoes=" + quantidadeDeRepeticoes +
                ", carga=" + carga +
                '}';
    }
}
