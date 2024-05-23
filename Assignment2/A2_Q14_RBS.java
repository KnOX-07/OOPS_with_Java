/* Q.14) Write Java programs that use both recursive and non-recursive functions for 
implementing the following searching methods:
(a) Linear search
(b) Binary search */

import java.util.*;

//Define class binary search(A2_Q14_RBS)
public class A2_Q14_RBS{

    //b) Recursive binary search
    public static int binarySearch(int[] arr, int key, int left, int right){
        if(left <= right){
            int mid = left + (right - left)/2;
            
            //Check if key is present at mid
            if(arr[mid] == key){
                return mid;
            }
            
            //If key is greater, ignore left half or right half
            if(arr[mid] < key){
                return binarySearch(arr, key, mid+1, right);
            }else{
                return binarySearch(arr, key, left, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;
        int res = binarySearch(arr, key, 0, arr.length-1);
        
        if(res == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index: " +res);
        }
    }
}