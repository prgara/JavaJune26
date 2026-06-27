package jun27;

public class DecisionStmt {


    public static void main(String[] args) {
        boolean isRaining = false;
        boolean rainingHeavily = true;
        int a = 10;
        int b = 19;

        if(isRaining){
            if(rainingHeavily){
                System.out.println("I will carry raincoat");
            }
            System.out.println("I will carry umbrella");
        }  else {
            System.out.println("I will carry shades");
        }
    }
}
