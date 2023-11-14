package Exercise;

public class Exercise1 {
    private int[] arrayValue;
    public Exercise1(){
        System.out.println("Exercise 2");
    }

    public Exercise1(int [] array){
        this();
        arrayValue = array;
    }

    public void Execute(){
        System.out.printf("El mayor del array es: %d\n", getGreater(arrayValue));
    }

    private int getGreater(int [] array){
        int result = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]>result) result=array[i];
        }
        return result;
    }
}
