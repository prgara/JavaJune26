package aug18;

public class App {

    void register(String name, String email)throws InvalidEmailException, NullPointerException{

        if(name.length() <3){
            throw new RuntimeException("Name should be greater than 3 characters");
        }
        if (!email.contains("@")){
            throw new InvalidEmailException("Email is not valid");
        }
    }

    void login() throws InvalidEmailException{
        register("","");
        System.out.println("Logged in successfully");
    }

    void shopping() throws InvalidEmailException{
        login();
        System.out.println("Shopping done");
    }

    void payment() throws InvalidEmailException{
        shopping();
        System.out.println("Payment done");
    }


}
