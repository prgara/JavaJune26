package aug08;

public class B extends A{
    int x = 20;

    B(){
        System.out.println("Class B called");
    }

    B(int x ){
        super(25);
        this.x = x;
        System.out.println(x);
    }
}
