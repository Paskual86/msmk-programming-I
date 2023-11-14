package Exercise;

public class Exercise3 {

    public Exercise3(){
        System.out.println("Ejercicio3: Muestra los números del 0 al 100 pero avanzando de 10 en 10");
    }

    public void Execute(){
        execute(100,10);
    }
    private void execute(int cantidad, int incremento){
        execute(cantidad, incremento, true);
    }
    private void execute(int cantidad, int incremento, boolean skipfirstvalue){
        for (int i=(skipfirstvalue)?incremento:0;i<=cantidad;i=i+incremento){
            System.out.printf("Valor: %d\n", i);
        }
    }
}
