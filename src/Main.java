public class Main {

    public static void main(String[] args) {

//        1)პროექტი - Project1, თითოეული კლასი ჩაწერეთ ცალ-ცალკე ფაილში.





//        first A class

        A firstClass = new A();

        firstClass.firstMethod();
        firstClass.sumMethod();
        firstClass.multiplyMethod();

        first A class


//        -----------------------------------------------------------------------------------------




//        Second B class



        B secondClass = new B();

        secondClass.firstMethod();
        secondClass.maximumMethod();
        secondClass.minimumMethod();



//        Second B class


//        -----------------------------------------------------------------------------------------





//        Third C class



        C thirdClass = new C();

        thirdClass.firstMethod();
        thirdClass.lastDigit();
        thirdClass.firstDigit();
        thirdClass.sumOfDigit();




//        Third C class


//        -----------------------------------------------------------------------------------------




//        2. პროექტი - Project3, თითოეული კლასი ჩაწერეთ ცალ-ცალკე ფაილში.



        SecondA project2 = new SecondA();


        project2.arrGenerator();
        project2.randomArr();



//        -----------------------------------------------------------------------------------------




//3. პროექტი - Project4, თითოეული კლასი ჩაწერეთ ცალ-ცალკე ფაილში.


        ThirdA project3 = new ThirdA();

        int result = project3.firstMethod();

        System.out.println("2x-7 = " + result);


        int result2 = project3.secondMethod();

        System.out.println("3y+z = " +result2);


        SecondB proj3 = new SecondB();

        int result3 = proj3.firstMethod();

        System.out.println(" 2 + 1 = " +result3);



//        -----------------------------------------------------------------------------------------


//        ამოცანები კონსტრუქტორების გამოყენებით.



        ConstructorClass cs = new ConstructorClass();

        cs.evenOrOdd();




    }

}
