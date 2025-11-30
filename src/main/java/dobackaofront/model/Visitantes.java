package dobackaofront.model;

public class Visitantes {
    private String nome;
    private String sexo;
    private int cpf;


    public Visitantes(String nome,String sexo, int cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Visitantes{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
