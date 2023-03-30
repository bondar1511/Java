import java.util.LinkedList;


// // Реализуйте очередь с помощью LinkedList со следующими методами:
// // enqueue() - помещает элемент в конец очереди,
// // dequeue() - возвращает первый элемент из очереди и удаляет его,
// // first() - возвращает первый элемент из очереди, не удаляя.



  public class task2_3 {
  
    
  public static void main(String[] args) { 
  LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(25);
    list.add(0);
    list.add(14);
    list.add(21);
    list.add(20);
    list.add(2);
    list.add(5);
    System.out.println(list);
    
    enqueue(list, 10);
    System.out.println(list);
        
    dequeue(list, 0);
    System.out.println(list);
    
    first(list, 0);
    System.out.println(list);

   
}

public static void enqueue(LinkedList<Integer> list,int element) {
    list.addLast(element);
   
}
public static int dequeue(LinkedList<Integer> list,int element) {
    int numbers = 0;
   numbers = list.get(0);
   list.remove(0);
   return numbers;
   
}
public static int first(LinkedList<Integer> list,int element) {
    int numb = 0;
   numb = list.get(0);
   return numb;

}
}