import Exercise.Exercise1;
import Exercise.Exercise2;
import Exercise.Exercise3;
import Exercise.Exercise4;
import Exercise.Exercise5;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicios de programacion:");
        var ex1 = new Exercise1(new int[]{12,56,45,151,88,90,255});
        ex1.Execute();

        var ex2 = new Exercise2();
        ex2.Execute();

        var ex3 = new Exercise3();
        ex3.Execute();

        var ex4 = new Exercise4("hola mundo programador");
        ex4.Execute();

        var ex5 = new Exercise5(73);
        ex5.Execute();
    }
}