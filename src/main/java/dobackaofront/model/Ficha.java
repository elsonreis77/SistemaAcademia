package dobackaofront.model;

import java.util.ArrayList;

public class Ficha {
    private Aluno aluno;
    private ArrayList<Exercicios> exercicios;

    public Ficha(Aluno aluno, ArrayList<Exercicios> exercicios) {
        this.aluno = aluno;
        this.exercicios = exercicios;
    }
}
