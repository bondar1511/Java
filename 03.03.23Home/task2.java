import java.util.Scanner;

// Вывести все простые числа от 1 до 1000

public class task2 {
    


public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Введите число больше или равно 2: ");
    int number = num.nextInt();
for (int i = 2; i <= number; i++) {
   boolean isPrime = true;
   for (int j = 2; j < i; j++) {
        if (i%j == 0){
         isPrime = false; 
         break;
        }
      }
       if(isPrime){
  
         System.out.print(i + ", "); 


       }
      }

   }
   }
       
        

  
   

