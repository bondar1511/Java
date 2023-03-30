
import java.util.Iterator;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.


public class task1_3 {

    

    public static void main(String[] args) { 
        LinkedList<Integer> Mylist = new LinkedList<Integer>();
          Mylist.add(45);
          Mylist.add(16);
          Mylist.add(1);
          Mylist.add(8);
       
          System.out.println(Mylist);
          
        Iterator<Integer> list1;
        list1 = Mylist.descendingIterator();
         while (list1.hasNext()) {
            System.out.println(list1.next());
         } 
              
}
}


        