package aug18;

public class AppMain {

    public static void main(String[] args)   {
        App app = new App();
        try{

            app.payment();
        } catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
