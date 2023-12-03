import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String arrayStr = "Array : [ ";
        int array1[] = arrayGen(11);
        for (int z: array1
        ) {
            arrayStr += z + " ";
        }
        System.out.println(arrayStr + "].");
    }
    private static int[] arrayGen(int x){
        int array[] = new int[x];
        Random rnd = new Random();
        for (int i=0; i < (array.length) ; i+=2){
            int num = rnd.nextInt(100) + 1;
            while(!areThereRepeats(array, num)){
                num = rnd.nextInt(100) + 1;
            }
            try{
                array[i] = num;
                array[i+1]= -num;
            } catch(IndexOutOfBoundsException e){
                if(x%2 == 1) array[i] = 0;
            }
        }
        return array;
    }
    private static Boolean areThereRepeats(int[] array, int randomNum){
        Boolean anyRepeats = true;
        for(int i=0; i<array.length && anyRepeats; i++){
            if (randomNum==array[i]) {
                anyRepeats = false;
            }
        }
        return anyRepeats;
    }
}