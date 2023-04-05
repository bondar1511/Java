import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568


public class task1_18 {

    

public static void main(String[] args) {
  HashMap<ArrayList<Integer>, String> phonebook = new HashMap<>();
    Numberphone.put(1242353, "Иванова");
    Numberphone.put(547568, "Иванов");
    Numberphone.put(8022264, "Смирнова");
    Numberphone.put(524177, "Козлов");
    Numberphone.put(8022187, "Иванов ");
    System.out.println(phonebook); 
      }

public static void Numberphone(String value, int key, Map<String, ArrayList<Integer>> phonebook){
        Scanner input =  new Scanner("ВВедите 1 или 2: ");
        String in = input.nextLine();
        if (in.equals("1")){
            Scanner num =  new Scanner(System.in);
            System.out.println("Введите номер: ");
            int phone = num.nextInt() ;
            Scanner input =  new Scanner("Введите фамилию: ");
            String name = input.nextLine();
            input.close();
                if (!phonebook.containsKey(name)) {
                    phonebook.put(phone, new ArrayList<>());
                    
                } else {
                    System.out.println("Данное имя уже существует");
                }
            }
            if (in.equals("2")) {
                for (var item : phonebook.entrySet()) {
                    String phones = "";
                    for(int el: item.getValue()){
                        phones = phones + el + ", ";
                    }
                    System.out.printf("%s: %s \n", item.getKey(), phones);
                }
                
            }


      }

    
   } 

    



   
   
