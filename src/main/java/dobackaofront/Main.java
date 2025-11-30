package dobackaofront;

import dobackaofront.model.Academia;
import dobackaofront.model.Exercicios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia("Ferro com aço");

        Exercicios exercicio01 = new Exercicios("Pneus", 10, 10);
        academia.addExercicio(exercicio01);

        Exercicios exercicio02 = new Exercicios("Tronco", 10, 10);
        academia.addExercicio(exercicio02);

        Exercicios exercicio03 = new Exercicios("Tronco", 10, 10);
        academia.addExercicio(exercicio02);

    }
}