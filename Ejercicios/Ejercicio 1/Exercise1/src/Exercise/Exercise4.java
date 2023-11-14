package Exercise;

public class Exercise4 {
    private String strCadena;
    public Exercise4(){
        System.out.println("Muestra en mayúsculas por consola un texto pasado por parámetro a una función");
    }

    public Exercise4(String cadena){
        this();
        strCadena = cadena;
    }

    public void Execute(){
        execute(strCadena);
    }
    private void execute(String cadena){
        System.out.print("Cadena Original: ");
        System.out.println(cadena);
        System.out.print("Cadena en Mayusculas: ");
        System.out.println(cadena.toUpperCase());
    }
}
