
package n23_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExceptionDemo {
    public static void main(String[] args) {
//        int x,y;
//        x=8;
//        y=0;
//        try{
//           int z=x/y;
//           System.out.println("z="+z);
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("Viec 1");
//        System.out.println("Viec 2");
         try{
         String d="hh/10/2019";
         SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
         
           Date dd=f.parse(d);
             System.out.println(dd);
             String snum="jhfdjjf";
         int num=Integer.parseInt(snum);
         
         
         }catch(ParseException e){
             System.out.println(e);
         }catch(NumberFormatException e){
             System.out.println(e);
         }finally{
             System.out.println("luon luon thuc hien");
         }
         
    }
    
}
