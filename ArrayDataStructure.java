/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

// Question 1 : using array data structure 

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;


public class ArrayDataStructure {
    
    private LocalTime timer ; 
    private int[] arr ;
    private File file ; 
    private Scanner scan  ; 
    
// ---- a) build an integer array that stores integer hold in 1Min.txt or 50Min.txt  
    public ArrayDataStructure(String fileName) {
        // timer = new LocalTime() ;
        
        //building an array with to read integers  form fileName given as a parameter 
        if(fileName.equals("1Mint.txt")) 
           arr = new int[1000000] ;   // array is created with length of one billion
        else   
           arr = new int[50000000] ; // array is created with lenght of fifty billion
    
        // reading integers from file to build array data structure
        try{
          file = new File(fileName) ;
          scan = new Scanner(file) ;
          int i = 0 ;   
          while(scan.hasNext()) {
              arr[i++] = scan.nextInt();
          }
          
          scan.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
//----b) Insert an integer into the first index ------
    public void insertFirst(int num) {
        
        //  newArr is created for insertion 
        int[] newArr = new int[arr.length+1]  ;
        int i = arr.length ;
        while(i>0) {
            newArr[i] = arr[i-1] ; // shifting all integers by one to insert num into first place of array
            i--; 
        }
        newArr[0] = num ;  
        arr = newArr ;
    }
    
 // -----c) Insert an integer into the last index ------
    public void insertLast(int num) {
        // newArr is created for insert last 
       int[] newArr = new int[arr.length+1] ;
       int i = 0 ;
       while(i<arr.length) {
           newArr[i] = arr[i] ;
           i++ ;
       }
       newArr[newArr.length-1] = num ;
       arr = newArr ;
    }
    
// ----1d-1e-4d) Read the integer from the index 900 000 
    public int readNumber(int index){
        
        return arr[index] ;
    }

    public int getSize() {
        return arr.length ;
    }
    public void display() {
       
        for(int i=0;i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    
    
}
