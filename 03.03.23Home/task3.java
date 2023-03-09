import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->


public class task3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = num.nextDouble();
        Scanner sign = new Scanner(System.in);
        System.out.print("Введите знак: ");
        char sign1 = sign.next().charAt(0);
        Scanner num2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number2 = num2.nextDouble();
        double result;
        switch(sign1){
            case '+': result = number+number2;
            break;
            case '-': result = number-number2;
            break;
            case '/': result = number/number2;
            break;
            case '*': result = number*number2;
            break;
            default:
            System.out.printf("Ошибка, введено неверное значение. Введите  знак +,-,/,* ");
            return;
        }
        System.out.print("Результат: " +result); 
        
}
          
}
