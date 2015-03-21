/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author insomniac
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable printA=new PrintChar('a',100);
        Runnable printB=new PrintChar('b',100);
        Runnable print100=new PrintNum(100);
        
        Thread thread1=new Thread(printA);
        Thread thread2=new Thread(printB);
        Thread thread3=new Thread(print100);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
    }
    
}
