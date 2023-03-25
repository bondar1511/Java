import java.io.BufferedReader;
import java.io.FileReader;




// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


public class task2 {
 

    public static void main(String[] args) {

        String text = "04.03.23Home\\result.txt";
        String[] result;
        StringBuilder tx = new StringBuilder();
        try (BufferedReader res = new BufferedReader(new FileReader(text))) {       
            String line;
            while ((line = res.readLine()) != null) {
              String[] parts = line.split(",");
                for (String part : parts) {
                    result = line.split(":");
                    if (result[0].equals("фамилия")) {
                        tx.append("Студент ")
                                .append(result[1].replaceAll(" , ", part))
                                .append(" ");

                    } else if (result[0].equals("оценка")) {
                        tx.append("получил ")
                               .append(result[1].replaceAll((", "), part))
                               .append(" ");
                    } else if (result[0].equals("предмет")) {
                        tx.append("по предмету ")
                               .append(result[1].replaceAll(", ", part))
                               .append(".");

                    }

                }
                System.out.println(tx.toString());
           }
        } catch(Exception e)  {
            e.printStackTrace();
        }
    }
}
           
        
    


    


    

