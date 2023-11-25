import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class loop{
    public static void main(String[] args) {
        int i = 0;
        String = "Should there be lower taxes for Democrats";
        String = "Should there be higher taxes for Republicans who make over $450,000 yearly?";
        String = "Do you think there should be free health insurance for American Citizens every month?";
        String = "Which political party are you affilitated with?";
        
        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Should there be lower taxes for democrats?"); // write to data file
            String input_1 = myObj.nextLine();

            System.out.println("Should there be higher taxes for republcians who make over $450,000 yearly?"); // write to data file
            String input_2 = myObj.nextLine();

            System.out.println("Do you think there should be free health insurance for US Citizens?"); // write to data file
            String input_3 = myObj.nextLine();
        
            System.out.println("Which political party are you affiliated with?"); // write to data file
            String input_4 = myObj.nextLine();
            i++;
        } while (i < 1);
        // load data file at the end
    }
}