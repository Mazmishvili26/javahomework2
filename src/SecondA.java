import java.util.Random;
import java.util.Scanner;

public class SecondA {

    Double[] m = new Double[10];

    Random r = new Random();

    public void arrGenerator () {

//        მეთოდი 1: ანიჭებს m მასივის ელემენტებს მნიშვნელობებს  კლავიატურიდან.

        for(int i = 0 ; i < 10; i++){

            m[i] = (Math.random());
            System.out.println(m[i]);
        }


    }


    public void randomArr () {


//        მეთოდი 2: ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს  [0; 15] შუალედუდან.


        System.out.println(r.nextInt(0,15));

    }

}
