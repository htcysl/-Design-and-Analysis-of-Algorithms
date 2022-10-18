/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1;

/**
 *
 * @author HP
 */
public class HomeWork1 {

   
    public static void main(String[] args) {
        
        long start , end ;
       
// -----------------------   Question 1   -----------------------------------------  
        System.out.println("Ouestion 1 :\n\n ");
       
        
        // 1a time differece :                   
        start = System.currentTimeMillis() ;
        ArrayDataStructure obj_1 = new ArrayDataStructure("1Mint.txt") ;
        end = System.currentTimeMillis() ;
        System.out.println("1a) The integer array structure is built in "+(end-start)+" milliseconds. \n") ;
       
        // 1b time difference for insert an integer into the first index  
        start = System.currentTimeMillis() ;
        obj_1.insertFirst(100);
        end = System.currentTimeMillis() ;
        System.out.println("1b) An integer is inserted into the first index of the integer array in "+(end-start)+" milliseconds. \n") ;
       
        // 1c time differencce for insert an integer into the last index
        start = System.currentTimeMillis()  ;
        obj_1.insertLast(300);
        end = System.currentTimeMillis() ;
        System.out.println("1c) An integer is inserted into the last index of the integer array in "+(end-start)+" milliseconds. \n") ;
        
        // 1d time difference for reading the integer from the 900 000
        start = System.currentTimeMillis()  ;
        obj_1.readNumber(900000) ;
        end = System.currentTimeMillis()  ;
        System.out.println("1d) An integer, which is "+obj_1.readNumber(900000)+ ", is read from the index 900,000 of the integer array " +
"in "+(end-start)+" milliseconds. \n") ;
        
        // 1e time difference for reading the integer from the index 9
        start = System.currentTimeMillis()  ;
        obj_1.readNumber(9) ;
        end = System.currentTimeMillis()  ;
        System.out.println("1e) An integer, which is "+ obj_1.readNumber(9)+", is read from the index 9 of the integer array in "+(end-start)+" milliseconds. \n") ;
        
  
// -----------------------   Question 2   -----------------------------------------   
        System.out.println("\n\nOuestion 2 : ");
        
       // 2a time differece :                   
        start = System.currentTimeMillis() ;
        LinkedListDataStructure obj_2 = new LinkedListDataStructure("1Mint.txt") ;
        end = System.currentTimeMillis() ;
        System.out.println("2a) The integer list structure is built in "+(end-start)+" milliseconds. \n") ;
        
       //  2b time difference for inserting an integer into the head
       start = System.currentTimeMillis() ;
       obj_2.insertHead(100);
       end = System.currentTimeMillis() ;
       System.out.println("2b) An integer is inserted into the head of the integer list in "+(end-start)+" milliseconds. \n") ;
        
       //  2c time difference for inserting an integer into index 900 000
       start = System.currentTimeMillis() ;
       obj_2.insert(900000, 1000);
       end = System.currentTimeMillis() ;
       System.out.println("1c) An integer is inserted into the index 900 000  of the integer list in "+(end-start)+" milliseconds. \n") ;
        
       // 2d time difference for reading fron the index 900 000
       start = System.currentTimeMillis() ;
       obj_2.readNumber(900000) ; 
       end = System.currentTimeMillis() ;
       System.out.println("2d)  An integer, which is "+obj_2.readNumber(900000)+", is read from the index 900,000 of the integer list in " +(end-start)+" milliseconds. \n") ;
      
       // 2e time difference for reading from the index 9 
       start = System.currentTimeMillis() ;
       obj_2.readNumber(9) ; 
       end = System.currentTimeMillis() ;
       System.out.println("2e) An integer, which is "+obj_2.readNumber(9)+", is read from the index 9 of the integer array in " +(end-start)+" milliseconds. \n") ;
        
// -----------------------   Question 3   ----------------------------------------- 
       System.out.println("\n\nOuestion 3 : ");
      
       // 3a time differece : 
       start = System.currentTimeMillis() ;
       DynamicArrayStructure obj_3 = new DynamicArrayStructure("1Mint.txt") ;
       end = System.currentTimeMillis() ;
       System.out.println("3a) The integer dynamicarray structure is built in "+(end-start)+" milliseconds. \n") ;
        
       // 3b Insert an integer into the first index
       start = System.currentTimeMillis() ;
       obj_3.insertFirst(1000);
       end = System.currentTimeMillis() ;
       System.out.println("3b) An integer is inserted into the first index of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
            
       // 3c Insert an integer into the last index
       start = System.currentTimeMillis() ;
       obj_3.insertLast(1000);
       end = System.currentTimeMillis() ;
       System.out.println("3c) An integer is inserted into the last index of the integer array in "+(end-start)+" milliseconds. \n") ;
         
       //  3d Read the integer from the index 900,000
       start = System.currentTimeMillis() ;
       obj_3.readNumber(900000);
       end = System.currentTimeMillis() ;
       System.out.println("1d)An integer, which is "+obj_3.readNumber(900000)+", is read from the index 900,000 of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
         
       // 3e Read the integer from the index 9
       start = System.currentTimeMillis() ;
       obj_3.readNumber(9);
       end = System.currentTimeMillis() ;
       System.out.println("1e)An integer, which is "+obj_3.readNumber(9)+", is read from the index 9 of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
              
       
// -----------------------   Question 4-1   ----------------------------------------- 
       System.out.println("\n\nOuestion 4-1 : ");
       
       // 4-1a) time differece :                   
        start = System.currentTimeMillis() ;
        ArrayDataStructure obj_4 = new ArrayDataStructure("50Mint.txt") ;
        end = System.currentTimeMillis() ;
        System.out.println("4-1a) The integer array structure is built in "+(end-start)+" milliseconds. \n") ;
        
        // 4-1b) time difference for insert an integer into the first index  
        start = System.currentTimeMillis() ;
        obj_4.insertFirst(100);
        end = System.currentTimeMillis() ;
        System.out.println("4-1b) An integer is inserted into the first index of the integer array in "+(end-start)+" milliseconds. \n") ;
        
        // 4-1c) time differencce for insert an integer into the last index
        start = System.currentTimeMillis()  ;
        obj_4.insertLast(300);
        end = System.currentTimeMillis() ;
        System.out.println("4-1c) An integer is inserted into the last index of the integer array in "+(end-start)+" milliseconds. \n") ;
        
        // 4-1d) time difference for reading the integer from the 900 000
        start = System.currentTimeMillis()  ;
        obj_4.readNumber(45000000) ;
        end = System.currentTimeMillis()  ;
        System.out.println("4-1d) An integer, which is "+obj_4.readNumber(45000000)+ ", is read from the index 45,000,000 of the integer array in "+(end-start)+" milliseconds. \n") ;        
       
        // 4-1e) time difference for reading the integer from the index 9
        start = System.currentTimeMillis()  ;
        obj_4.readNumber(9) ;
        end = System.currentTimeMillis()  ;
        System.out.println("4-1e) An integer, which is "+ obj_4.readNumber(9)+", is read from the index 9 of the integer array in "+(end-start)+" milliseconds. \n") ;
        
// -----------------------   Question 4-2   -----------------------------------------
       System.out.println("\n\nOuestion 4-2 : ");
       
        // 4-2a) time differece :                   
        start = System.currentTimeMillis() ;
        LinkedListDataStructure obj_5 = new LinkedListDataStructure("50Mint.txt") ;
        end = System.currentTimeMillis() ;
        System.out.println("4-2a) The integer list structure is built in "+(end-start)+" milliseconds. \n") ; 
        
       //  4-2b) time difference for inserting an integer into the head
       start = System.currentTimeMillis() ;
       obj_5.insertHead(100);
       end = System.currentTimeMillis() ;
       System.out.println("4-2b) An integer is inserted into the head of the integer list in "+(end-start)+" milliseconds. \n") ;

       //  4-2c) time difference for inserting an integer into index 45 000 000
       start = System.currentTimeMillis() ;
       obj_5.insert(45000000, 1000);
       end = System.currentTimeMillis() ;
       System.out.println("4-2c) An integer is inserted into the index 45 000 000  of the integer list in "+(end-start)+" milliseconds. \n") ;          
      
       // 4-2d) time difference for reading fron the index 45 000 000
       start = System.currentTimeMillis() ;
       obj_5.readNumber(45000000) ; 
       end = System.currentTimeMillis() ;
       System.out.println("4-2d)  An integer, which is "+obj_5.readNumber(45000000)+", is read from the index 45,000,000 of the integer list in " +(end-start)+" milliseconds. \n") ;

       // 4-2e) time difference for reading from the index 9 
       start = System.currentTimeMillis() ;
       obj_5.readNumber(9) ; 
       end = System.currentTimeMillis() ;
       System.out.println("4-2e) An integer, which is "+obj_5.readNumber(9)+", is read from the index 9 of the integer array in " +(end-start)+" milliseconds. \n") ;
        
// -----------------------   Question 4-3   ----------------------------------------- 
       System.out.println("\n\nOuestion 4-3 : ");
       
       // 4-3a) time differece : 
       start = System.currentTimeMillis() ;
       DynamicArrayStructure obj_6 = new DynamicArrayStructure("50Mint.txt") ;
       end = System.currentTimeMillis() ;
       System.out.println("4-3a) The integer dynamicarray structure is built in "+(end-start)+" milliseconds. \n") ;         
       
       // 4-3b) Insert an integer into the first index
       start = System.currentTimeMillis() ;
       obj_6.insertFirst(1000);
       end = System.currentTimeMillis() ;
       System.out.println("4-3b) An integer is inserted into the first index of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
         
       // 4-3c) Insert an integer into the last index
       start = System.currentTimeMillis() ;
       obj_6.insertLast(1000);
       end = System.currentTimeMillis() ;
       System.out.println("4-3c) An integer is inserted into the last index of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
          
       //  4-3d) Read the integer from the index 45,000,000
       start = System.currentTimeMillis() ;
       obj_6.readNumber(45000000);
       end = System.currentTimeMillis() ;
       System.out.println("4-3d)An integer, which is "+obj_6.readNumber(45000000)+", is read from the index 45,000,000 of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
         
       // 4-3e) Read the integer from the index 9
       start = System.currentTimeMillis() ;
       obj_6.readNumber(9);
       end = System.currentTimeMillis() ;
       System.out.println("4-3e)An integer, which is "+obj_6.readNumber(9)+", is read from the index 9 of the integer dynamicarray in "+(end-start)+" milliseconds. \n") ;
        
    }
    
    
}
        
        
        
        
