import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

/**
 * task1
 */
public class task1 {
    
public static void main(String[] args) {
   Scanner num = new Scanner(System.in);
   System.out.print("Введите число: ");
   int n = num.nextInt();
   int sum = 0;
   int f = 1;
for (int i = 0; i <=n; i++) {
    sum = sum + i;
   }
   for (int j = 1; j<=n; j++) {
    f = f*j;
    num.close();
}

   System.out.printf("Треугольник числа: %d\n", sum);
   System.out.printf("Произведение чисел: %d\n", f);

}
}