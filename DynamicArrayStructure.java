/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

import java.io.File;
import java.util.Scanner;

public class DynamicArrayStructure {
   
  private int[] arr ;
  private int size ;
  private File file ; 
  private Scanner scan  ; 
  private int power ;
  
  public DynamicArrayStructure(String fileName) {
      
      arr = new int[0] ; // initial array size is defined as 0 
      size = 0 ; // holding the number of integer in the arr 
      power = 0 ; // is used to double the array size 
      
      // reading file to linked list obj. 
         try{
          file = new File(fileName) ;
          scan = new Scanner(file) ;
         
          while(scan.hasNext()) {
              
              // if current arr size is equal to  arr.length, call reallocation helper function to double length of arr
              if(size==arr.length)     
                  reallocateArray() ;
              
              arr[size++] =  scan.nextInt();      
          }      
          scan.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
       // remove zeros in arr array 
       removeZeros() ;
      
      
  }
  
// -------  helper function for reallocation array --------------    
  private void reallocateArray() {
      
      // (int)Math.pow(2,0) --> 1, (int)Math.pow(2,1) -- > 2 ,... (int)Math.pow(2,4) --> 16 ...  
      int[] newArr = new int[(int)Math.pow(2, power)] ; 
      power++ ;
      
      int i = 0 ;
      while(i<arr.length) {
          newArr[i] = arr[i] ;
          i++;
      }
      arr = newArr ;
  } 
   
// --------helper function remove extra space in arr -----------------
  private void removeZeros() {
      
      int[] newArr = new int[size] ;
      int i=0;
      while(i<size) {
          newArr[i] = arr[i] ;
          i++;
      }
      arr = newArr ;      
  }
// -------- insert an integer into the first index --------------------
  public void insertFirst(int num) {
      int[] newArr = new int[arr.length+1] ;
      int i = arr.length ; // or size 
      while(i>0) {
          newArr[i] = arr[i-1] ;
          i--;
      }
      newArr[0] = num ; // adding number into first place ---------------
      arr = newArr ;
      size++;
  }
 // ----- insert an integer into the last index ----------------------- 
  public void insertLast(int num) {
      int[] newArr = new int[arr.length+1] ;
      int i = 0 ;
      while(i<arr.length) {
          newArr[i] = arr[i] ;
          i++;
      }
      newArr[i] = num ;
      arr = newArr ;
      size++;
  }
// ---------- read the integer from the index 900 000 -------------
  public int readNumber(int index) {
      return arr[index] ;
  }
   
  public void display() {
      for(int i=0;i<arr.length;i++) 
          System.out.print(arr[i]+" ");      
  }
  public int size() {
      return size ;
  }
  
}