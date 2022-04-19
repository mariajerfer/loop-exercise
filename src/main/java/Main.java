import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5};
        System.out.println("input " + Arrays.toString(numbers));
        // primera forma
        /*int aux;
        for(int i=0; i<numbers.length/2;i++){
            aux= numbers[i];
            numbers[i]=numbers[numbers.length -1 -i];
            numbers[numbers.length -1 -i]= aux;
            //System.out.println(numbers[i]);
        }
        System.out.println("output " + Arrays.toString(numbers));*/

        // segunda forma
        int[] inverseArray= new int[numbers.length];
        for(int i=0;i< numbers.length;i++){
            int index = numbers.length-1;
            inverseArray[i]= numbers[index-i];
        }
        for(int number:inverseArray){
            System.out.println(number);
        }

    }

}
