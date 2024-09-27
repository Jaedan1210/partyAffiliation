import java.util.Scanner;
public class partyAffiliation {
    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number [1-4} to determine your party affiliation: ");
        if (in.hasNextInt()) {
            num = in.nextInt();
            in.nextLine();
        }
        if (num == 1) {
            System.out.println("You're a democrat!");
        }
        else if (num==2){
        System.out.println("You're a republican!");
        }
        else if (num==3) {
            System.out.println("You are independent!");
        }
        else if (num==4) {
            System.out.println("You are other!");
        }
        else{
            System.out.println("You have entered a Invalid Number, please try again");
        }




    }
}