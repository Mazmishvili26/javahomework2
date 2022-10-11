public class B {
    int a,b,c;

    public void firstMethod () {

        a = 2;
        b = 3;
        c = 5;

    }

    public void maximumMethod () {

        int maximum = Math.max(a, Math.max(b,c));

        System.out.println("Maximum " + maximum);

    }

    public void minimumMethod () {

        int smallest = Math.min(a, Math.min(b,c));

        System.out.println("Minimum " +smallest);


    }
}
