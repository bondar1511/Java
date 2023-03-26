// Реализовать алгоритм сортировки слиянием
import java.util.Arrays;

public class task1 {
    public static void main(String args[]) {
        int[] Array = {52, 12, 4, 7, 13, 63};
        int[] result = mergeSort(Array);
        System.out.println(Arrays.toString(result));
  
	}
    public static int[] mergeSort(int[] Array) {
         if (Array == null) {
                return null;
            }
            if (Array.length<2) {
                return Array;            
            }
         int[] left = Arrays.copyOf(Array, Array.length);
         int[] right = new int [Array.length];
         int[] res = mergeSortInner(left, right, 0, Array.length);
         return res;
    }

      public static int[] mergeSortInner(int[] left, int[] right, int startIndex, int endIndex) {
            if (startIndex >= endIndex - 1) {
                return left;
            }
    
            int middle = startIndex + (endIndex - startIndex) / 2;
            int[] sort1 = mergeSortInner(left, right, startIndex, middle);
            int[] sort2 = mergeSortInner(left, right, middle, endIndex);
              
            int index1 = startIndex;
            int index2 = middle;
            int destIndex = startIndex;
            int[] result = sort1 == left ? right : left;
            while (index1 < middle && index2 < endIndex) {
                result[destIndex++] = sort1[index1] < sort2[index2]
                        ? sort1[index1++] : sort2[index2++];
            }
            while (index1 < middle) {
                result[destIndex++] = sort1[index1++];
            }
            while (index2 < endIndex) {
                result[destIndex++] = sort2[index2++];
            }
            return result;
        }
    }


    
        
       
       
            
        
          
        
    