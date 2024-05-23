/* Q.14) Write Java programs that use both recursive and non-recursive functions for 
implementing the following searching methods:
(a) Linear search
(b) Binary search */

import java.util.*;

//Define class binary search(A2_Q14_BS)
public class A2_Q14_BS{

    //b) Non-recursive binary search
    public static int binarySearch(int[] arr, int key){
        int left = 0, right = arr.length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
         
            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1; //key not found
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int key = 50;
        int res = binarySearch(arr, key);
        
        if(res == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index: " +res);
        }
    }
}