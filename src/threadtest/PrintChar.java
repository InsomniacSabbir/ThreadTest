/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author insomniac
 */
class PrintChar implements Runnable {
    private char charToPrint;
    private int times;
    public PrintChar(char c,int n)
    {
        charToPrint=c;
        times=n;
    }
    @Override
    public void run() {
        
        for(int i=0;i<times;i++)
        {
            System.out.print(charToPrint);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
