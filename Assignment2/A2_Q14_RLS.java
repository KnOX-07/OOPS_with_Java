/* Q.14) Write Java programs that use both recursive and non-recursive functions for 
implementing the following searching methods:
(a) Linear search
(b) Binary search */

import java.util.*;

//Define class linear search(A2_Q14_RLS)
public class A2_Q14_RLS{

    //a) Recursive linear search
    public static int linearSearch(int[] arr, int key, int index){
        if(index >= arr.length){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }
        return linearSearch(arr, key, index+1);
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int key = 20;
        int res = linearSearch(arr, key, 0);
        
        if(res == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index: " +res);
        }
    }
}