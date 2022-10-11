import java.util.Scanner;

public class ConstructorClass {

//    განსაზღვრეთ კლასი: მთელი ტიპის x ცვლადით. კონსტრუქტორით, 1 მეთოდით.

    int x;

    Scanner sc = new Scanner(System.in);


    public ConstructorClass () {
        System.out.println("Hello World");
    }


    public void evenOrOdd () {

        System.out.println("enter any number : ");

        x = sc.nextInt();

        if(x%2 == 0){
            System.out.println("your number is even ");
        }else{
            System.out.println("your number is odd ");
        }

    }

}
