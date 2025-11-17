package dobackaofront.model;

import java.util.ArrayList;

public class Ficha {
    private Aluno aluno;
    private Personal personal;
    private ArrayList<Exercicios> exercicios;
    private String dataFim;

    public Ficha(Aluno aluno, Personal personal, ArrayList<Exercicios> exercicios, String dataFim) {
        this.aluno = aluno;
        this.personal = personal;
        this.exercicios = new ArrayList<>();
        this.dataFim = dataFim;
    }

    public Ficha(Aluno aluno) {
        this.aluno = aluno;
        this.personal = null;
        this.exercicios = new ArrayList<>();
        this.dataFim = "";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public ArrayList<Exercicios> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicios> exercicios) {
        this.exercicios = exercicios;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void addExercicio(Exercicios exercicio) {
        this.exercicios.add(exercicio);
    }

    public void removerExercicio(Exercicios exercicio) {
        this.exercicios.remove(exercicio);
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "aluno=" + aluno +
                ", personal=" + personal +
                ", exercicios=" + exercicios +
                ", dataFim='" + dataFim + '\'' +
                '}';
    }
}
