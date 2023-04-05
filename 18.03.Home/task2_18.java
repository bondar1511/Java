
import java.util.*;
// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Петр Лыков
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.


public class task2_18 {
 
 
    public static void main(String[] args){

     ArrayList<Object> MyList = new ArrayList<>();
       MyList.add("Иван Иванов");
       MyList.add("Светлана Петрова");
       MyList.add("Кристина Белова"); 
       MyList.add("Анна Мусина");
       MyList.add("Анна Крутова");
       MyList.add("Иван Юрин"); 
       MyList.add("Мария Савина");
       MyList.add("Петр Лыков");
       MyList.add("Мария Рыкова"); 
       MyList.add("Иван Иванов");
       MyList.add("Анна Владимирова");
       MyList.add("Петр Петин"); 
       
       
       Map<String, String> newMap = new HashMap<>();         
        for (Object name: MyList) { 
        if (newMap.containsKey(name)) { 
            newMap.put(name,newMap.get(name) + 1);    
        } 
        else {
        newMap.put(name, 1); 
         }
        
        }
    private static void sorte(String value, int key, Map<String, ArrayList<Object>> newMap){
        List<Map.Entry> sorte = new ArrayList(newMap.entrySet());
        Collections.sorte(sorte, new Comparator<Map.Entry>() {
        public int compare(Map.Entry o1, Map.Entry o2) {
        return o2.getValue().compareTo(o1.getValue());   
        }
        });

         for (Map.Entry entry : sorte) { 
        System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
}
        }
        }
    }