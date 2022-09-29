//Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.

/**
 * Bubble_sort
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Bubble_sort { 
    public static void bubbleSort(int[] ar) { 
        boolean sort = false;
        int temp;
        while(!sort) {
            sort = true;
            for (int i = 0; i < ar.length - 1; i++) {
                if (ar[i] > ar[i+1]) {
                    temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                    sort = false;
                }
            }
        }
     }


    public static void loggirovanie(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Bubble_sort.class.getName());
        FileHandler ar = new FileHandler("log.txt");
        logger.addHandler(ar);
        SimpleFormatter sFormatter = new SimpleFormatter();
        ar.setFormatter(sFormatter);
        logger.info("log");
        }   

    public static void main(String[] args) throws SecurityException, IOException{
        int[] ar2 = new int [] {10, 20, 5, 9, 3};
        for(int i = 0; i < ar2.length; i++){
            System.out.print(ar2[i] + " ");
            loggirovanie(args);
        }  
        bubbleSort(ar2);
        System.out.println();
        for(int i = 0; i < ar2.length; i++){
            System.out.print(ar2[i] + " ");
            loggirovanie(args);
        } 
    }    
}




