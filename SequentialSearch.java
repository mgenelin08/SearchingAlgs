package structures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;


/**
 *
 * @author MGenelin08
 */
public class SequentialSearch {
    
    /*
    ** Sequential search and array of integers
    ** returns index if found, or -1 if not
    */
    
    public int seqSearch(int[] x, int n){
        int i = 1;
        boolean found = false;
        
        //loops through array while not found
        while(found == false && i < x.length){
            //found
            if (x[i] == n){
                found = true;
            }
            //otherwise increment 
            else {
                i++;
            }
        }
        //if found returns index
        if(found == true){
           return i;
        }
        else{
           return -1;
        }
    }
    
    // sample main method to run seqSearch method
    public static void main(String [] args){
        int [] arr = {12, 13, 11, 1, 5, 3, 8, 78, 67};
        SequentialSearch s = new SequentialSearch();
        System.out.println(s.seqSearch(arr, 78));
    }
    
}
