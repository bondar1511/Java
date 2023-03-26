
import java.util.ArrayList;
import java.util.Arrays;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class task3 {

private static final String srs = null;

public static void main(String[] args) {
      
     ArrayList<Integer> list1 =  new ArrayList<>(Arrays.asList(1,15,60,5,21,99,0,127));
    int min = list1.get(0);
    int max = list1.get(0);
    float srs = 0;
    int sum = 0;

    for (int item: list1) {
        if (item < min) {
            min = item;     
        } 
        if (item > max) {
             max = item;
    }
        sum +=item;
     }
    srs = sum/list1.size();
    System.out.println("Минимальное значение: "+min);
    System.out.println("Максимальное значение: "+max);
    System.out.println("Среднее значение: "+srs);    

}   
}





