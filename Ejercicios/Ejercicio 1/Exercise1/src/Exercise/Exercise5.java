package Exercise;

public class Exercise5 {

    private int prime;
    public Exercise5(){
        System.out.println("Crea una función que determine si un numero pasado por parámetro es primo. Utiliza el operador %");
    }

    public Exercise5(int primeValue) {
        this();
        prime=primeValue;
    }

    public void Execute(){
        boolean result = calculatePrime(prime);
        System.out.printf("%d es primo? %b", prime, result);
    }

    private boolean calculatePrime(int value){
        return calculatePrime(value, value-1);
    }

    private boolean calculatePrime(int value, int divisor){
        if (divisor<=1) return true;
        int result = value%divisor;
        if (result==0)return false;
        return calculatePrime(value, divisor-1);
    }

}
