
    import java.io.IOException;
    import java.util.Scanner;
    import java.util.logging.FileHandler;
    import java.util.logging.Logger;
    
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
            Logger logger = Logger.getLogger(bubbleSorter.class.getName());
            FileHandler fh;  
            try {
                fh = new FileHandler("04.03.23Home\\calculator.txt");
                logger.addHandler(fh);   
                } catch (SecurityException e) {
                 e.printStackTrace();
            } catch (IOException e) {
              e.printStackTrace();
            }   
    
            switch(sign1){
                case '+': result = number+number2;
                logger.info("результат: " + result);
                break;
                case '-': result = number-number2;
                logger.info("результат: " + result);
                break;
                case '/': result = number/number2;
                logger.info("результат: " + result);
                break;
                case '*': result = number*number2;
                logger.info("результат: " + result);
                break;
                default:
                System.out.printf("Ошибка, введено неверное значение. Введите  знак +,-,/,* ");
                return;
            }
            System.out.print("Результат: " +result); 
            
    }
          
    }
    





    
