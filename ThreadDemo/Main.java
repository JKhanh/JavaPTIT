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
public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main:");
        for(int i = 0;i < 4; i++){
            System.out.println("Inside main ");
            try{
                Thread.sleep(400);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        ThreadDemo td = new ThreadDemo("PTIT cl");
        td.start();
        try{
            td.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        RunnableDemo rd = new RunnableDemo();
        Thread t1 = new Thread(rd);
        t1.start();
        System.out.println("Stop main");
    }
}
