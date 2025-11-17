package dobackaofront.model;

import java.util.ArrayList;

public class Academia {
    private String nome;
    private String endereco;
    private String telefone;
    private String instagram;
    private ArrayList<Personal> personals;
    private ArrayList<Aluno> alunos;
    private ArrayList<Exercicios> exercicios;
    private ArrayList<Ficha> fichas;

    public Academia(String nome) {
        this.nome = nome;
        this.endereco = "";
        this.telefone = "";
        this.instagram = "";
        this.personals = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.exercicios = new ArrayList<>();
        this.fichas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public ArrayList<Personal> getPersonals() {
        return personals;
    }

    public void setPersonals(ArrayList<Personal> personals) {
        this.personals = personals;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Exercicios> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicios> exercicios) {
        this.exercicios = exercicios;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public void addPersonal(Personal personal) {
        this.personals.add(personal);
    }

    public void removePersonal(Personal personal) {
        this.personals.remove(personal);
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void addExercicio(Exercicios exercicio) {
        this.exercicios.add(exercicio);
    }

    public void removeExercicio(Exercicios exercicio) {
        this.exercicios.remove(exercicio);
    }

    public void addFicha(Ficha ficha) {
        this.fichas.add(ficha);
    }

    public void removeFicha(Ficha ficha) {
        this.fichas.remove(ficha);
    }

}
