package aug08;

public class A {

    int x = 10;

    A(){
        System.out.println("Class A called");
    }

    public A(int x) {
        this.x = x;
        System.out.println(x);
    }
}
