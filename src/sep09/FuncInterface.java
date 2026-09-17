package sep09;


@FunctionalInterface
public interface FuncInterface {

    void display (int a);


  default void count(){
      System.out.println("this is a default method");
    }

    static void abc(){
        System.out.println("Static Method");
    }
}
