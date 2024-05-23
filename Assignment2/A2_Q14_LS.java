/* Q.14) Write Java programs that use both recursive and non-recursive functions for 
implementing the following searching methods:
(a) Linear search
(b) Binary search */

import java.util.*;

//Define class linear search(A2_Q14_LS)
public class A2_Q14_LS{

    //a) Non-recursive linear search
    public static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int res = linearSearch(arr, key);
        
        if(res == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index: " +res);
        }
    }
}