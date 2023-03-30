import java.util.Scanner;
import java.util.Stack;



public class task3_3 {
    



    public static void calculator(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = num.nextDouble();
        Scanner sign = new Scanner(System.in);
        System.out.print("Введите знак: ");
        char sign1 = sign.next().charAt(0);
        Scanner num2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number2 = num2.nextDouble();
        double result = 0;
    }
    public static void operation(char sign1, int result, int number, int number2) {
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
    
}
    public void undo( Object result) {
        Stack cancell = new Stack<Double>();
        Stack operationStack = new Stack<Double>();
      if (!cancell.isEmpty() && !operationStack.isEmpty()) {  
         cancell.pop(); 
         char sign1 = (char) operationStack.pop();
         switch (sign1) {
            case '+': result = cancell.pop(); break;
            case '-': result = cancell.pop(); break;
            case '*': result = cancell.pop(); break;
            case '/': result = cancell.pop(); break;
        default: break;
         }
        }else{
            System.out.println("Нет операции для отмены");
           }
        
      
}
public void result( int result, Stack cancell, Stack operationStack) {
   cancell.push(result); 
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < cancell.size(); i++) {
    sb.append(cancell.get(i));
    if (i < operationStack.size()) {
    sb.append(" ").append(operationStack.get(i)).append(" ");
    }
    }
    System.out.println(sb.toString());
    }

}

  
