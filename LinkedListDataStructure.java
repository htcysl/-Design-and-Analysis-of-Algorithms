/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

/**
 *
 * @author HP
 */
import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class LinkedListDataStructure {
     
     private LinkedList list ;
     private File file ; 
     private Scanner scan  ; 
    
     public LinkedListDataStructure(String fileName) {
         
         list = new LinkedList() ;
         
         // reading file to linked list obj. 
         try{
          file = new File(fileName) ;
          scan = new Scanner(file) ;
         
          while(scan.hasNext()) {
              list.add(scan.nextInt());
          }
          
          scan.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
     }
//---- 2b) Insert an integer into the head ---     
     public void insertHead(int num) {
        list.insertHead(num);
     }

//---- 2c) Insert an integer into the index 900 000 ---- 
     public void insert(int index , int num) {  
        list.insertAtIndex(index, num);
     }

//----- 2d and 2e  Read the integer from the index 900 000 
     public int readNumber(int index){
        return list.readNumber(index );
     }   
}