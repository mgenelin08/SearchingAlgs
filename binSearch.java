/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structures;

/**
 *
 * @author MGenelin08
 */
public class binSearch {
    //iterative bin search method
    //returns -1 if not found
    //return index if found
    public int itBinSearch(int [] x, int t, int first, int last){
        //initialize mid and found
        int mid = 0;
        boolean found = false;
        // while in bounds and not found
        while(first <= last && found == false){
            mid = (first+last)/2;
            //if mid equals target
            if(t == x[mid]){
                found = true;
            }
            //mid does not equal target
            else{
                if(t < x[mid]){
                    last = mid - 1;
                }
                else{
                    first = mid + 1;
                }
            }
        }//end while
        //success, found
        if(found == true){
            return mid;
        }
        //failed, not found
        else{
            return -1;
        }
    }
    
    //recursive bin search method
    //returns -1 if not found
    //returns index if found
    public int recBinSearch(int [] x, int t, int first, int last){
        int mid = (first + last)/2;
        if(first > last){
            return -1;
        }
        else if(t == x[mid]){
            return mid;
        }
        else{
            if(t < x[mid]){
                return recBinSearch(x,t,first,mid-1);
            }
            else{
                return recBinSearch(x,t,mid+1,last);
            }
        }
    }
    public static void main(String [] args){
        int[] arr = {1,2,4,6,8,9,10,23,45};
        binSearch i = new binSearch();
        System.out.println(i.recBinSearch(arr, 45, 0, arr.length));
    }
}
