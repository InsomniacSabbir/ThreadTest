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
public class PrintNum implements Runnable{
    private int lastNum;
    public PrintNum(int i) {
        lastNum=i;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        for(int i=1;i<=lastNum;i++)
        {
            System.out.print(""+i);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
