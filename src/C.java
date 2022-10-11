public class C {

    int a,b,c,firstDigit;


    public void firstMethod () {
        a = 12;
        b = 2;
        c = 11;
    }


    public void lastDigit () {


        int lastDigit = a % 10;
        System.out.println("lastDigit : " + lastDigit);

    }

    public void firstDigit () {
        while(a!=0){
            firstDigit = a % 10;
            a = a / 10;
        }
        System.out.println("firstDigit : " +firstDigit);
    }

    public void sumOfDigit () {
        int sum = 0;
        while (c > 0) {
            int digit = c % 10;
            sum = sum + digit;
            c =  c / 10;
        }
        System.out.println("sumOfDigits :  " +sum);
    }

}
