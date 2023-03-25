import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.


public class task1 {
   
  
    private static final Logger logger = Logger.getLogger(bubbleSorter.class.getName());

    public static void main(String args[]) {
        int[] arg = {25,12,8,27,35,1,11};
        try {
            FileWriter file = new FileWriter("array.txt", false);
            bubbleSorter(arg);
               file.write(0);
               file.close();
            }catch (Exception e) {
            System.out.println("Ошибка");
            
        }    
        Logger logger = Logger.getLogger(bubbleSorter.class.getName());
        FileHandler fh;  
        try {
            fh = new FileHandler("04.03.23Home\\array.txt");
            logger.addHandler(fh);   
            logger.info("Исходный масссив: " + Arrays.toString(arg));
            bubbleSorter(arg);
            logger.info("Отсортированный массив: " + Arrays.toString(arg));
        } catch (SecurityException e) {
             e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }   
         
         } 
        

     public static void bubbleSorter(int [] arg){  
        for (int i = 0; i < arg.length-1; i++){  
            for (int j = 0; j < arg.length-i-1; j++){    
                if (arg[j+1] < arg[j] ) {
                 int result = arg[j];
                 arg[j] = arg [j+1];
                 arg[j+1] = result;  
              
                }                           
        }
        logger.info("Промежуточный результат на " + (i+1) + "-й итерации: " + Arrays.toString(arg));
     }
                  
            System.out.println(arg);  
    

    }
}

  