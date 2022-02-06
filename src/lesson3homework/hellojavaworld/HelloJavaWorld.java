package lesson3homework.hellojavaworld;

import lesson3homework.showa.ShowA;
import lesson3homework.showb.ShowB;

public class HelloJavaWorld {
   public static void main(String[] args){
       System.out.println("Hello Java World");

       ShowA showA = new ShowA();
       showA.showClassName();
       ShowB showB = new ShowB();
       showB.showMethodName();
   }
}
