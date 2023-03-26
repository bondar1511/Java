import java.util.ArrayList;


// Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class task2 {

     public static void main(String[] args) {
    
      ArrayList<Integer> mList =  new ArrayList<>();
      for (int i = 0; i < 10; i++) {
           mList.add((int)(Math.random()*25));
      }
      System.out.println(mList);
    //  for (int i = 0; i < mList.size(); i++) {
    //     if (mList.get(i)%2 == 0){
    //          mList.remove(i);
    //  } пробовала сначала сделать через for, но почему-то он не все четные числа удаляет 
      int i = 0;
     while (i < mList.size()) {
          if (mList.get(i)%2 == 0){
              mList.remove(i);
      }
    else{
        i++;
    }
    
}
System.out.println(mList); 
}

}


