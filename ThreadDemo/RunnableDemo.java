/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadDemo;

/**
 *
 * @author aatal
 */
public class RunnableDemo implements Runnable{
    private int index;

    @Override
    public void run() {
        System.out.println("Start Runnable");
        for(int i = 0; i< 6; i++){
            System.out.println("Inside Runnable " + index++);
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
    
    
}
