import java.util.*;

public class nestedif {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        int goingOut;
        Boolean groceriesEmpty;
        

        System.out.println("Can you go out due to lockdown?, Enter 1 for yes and any other integer for no");
        goingOut = input.nextInt();

        if(goingOut == 1){
            System.out.println("Are the groceries empty?");
            groceriesEmpty = input.nextBoolean();
            if(groceriesEmpty   == true){
                System.out.println("Go out and get groceries");
            }else{
                System.out.println("You have sufficient groceries, stay in and stay safe");
            }
        }else{
            System.out.println("You are under lockdown. Please stay home and follow the rules");
        }
    }
}
