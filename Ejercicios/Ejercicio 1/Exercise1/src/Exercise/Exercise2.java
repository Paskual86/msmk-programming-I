package Exercise;

public class Exercise2 {

    public Exercise2(){
        System.out.println("Ejercicio 2: \"Muestra por consola (System.out.println) todos los números múltiplos de 3 hasta 100\"");
    }

    public void Execute(){
        for (int i=0; i<=100; i++){
            if((i%3)==0){
                System.out.printf("Multiplo de 3: %d\n", i);
            }
        }
    }
}
