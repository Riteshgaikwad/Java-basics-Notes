//Nos we will study about searching an  element in array
/*
There are mainly two searching algorithms:-
1)Linear search
2)Binary search
*/
/*
1)Linear Searching:-
      In linear searching the elements are checked linearly and find the index of the element in the given array.

for example:-array=2,4,6,8,10,12,14,16
             key=10
  So, Linear search will find the index of element 10 in the given array arnd return its index as an output 
*/
//Code:-
import java.util.Scanner;

public class basics {
   public static int Linear_search(int arr[], int key) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      int array[] = { 2, 4, 6, 8, 10, 12, 14 };
      int index = Linear_search(array, 10);
      if (index > 0) {
         System.out.println("Element found at index:" + index);
      } else {
         System.out.println("Element not found");
      }
   }
}

/*
2)Binary Searching:-
       PREREQUEST:-Array must be sorted....
       In binary search the array is divided into to parts and check whether the mid element match the key if yes then return key,
       if the mis is less than key then start=mid+1 else if the condition is mid greater than key so, end=mid-1 it will continue untill we get key
 
 for example:-array=2,4,6,8,10,12,14,16
             key=10      
 So,binary search will first find the mid of given array which is 3 then compare with key and then conditions are executed accordingly...     
*/
//Code:-
import java.util.Scanner;

public class basics {
   public static int Linear_search(int arr[], int key) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            return i;
         }
      }
      return -1;
   }

   public static int Binary_search(int arr[], int key) {
      for (int i = 0; i < arr.length; i++) {
         int start = 0;
         int end = arr.length-1;
         while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
               return mid;
            } else if (arr[mid] < key) {
               start = mid + 1;
            } else {
               end = mid - 1;
            }
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      int array[] = { 2, 4, 6, 8, 10, 12, 14 };
      int index = Binary_search(array, 10);
      if (index > 0) {
         System.out.println("Element found at index:" + index);
      } else {
         System.out.println("Element not found");
      }
    
   }
}
