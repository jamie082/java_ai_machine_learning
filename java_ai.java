import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class loop{
    public static void main(String[] args) {
        int i = 0;
        String String_1 = "Should there be lower taxes for Democrats";
        String String_2 = "Should there be higher taxes for Republicans who make over $450,000 yearly?";
        String String_3 = "Do you think there should be free health insurance for American Citizens every month?";
        String String_4 = "Which political party are you affilitated with?";

        do {
            try {
                // Creates a FileWriter
                FileWriter output_1 = new FileWriter("data_1.txt", true);
                Scanner myObj = new Scanner(System.in);
                System.out.println("Should there be lower taxes for democrats?"); // write to data file
                String input_1 = myObj.nextLine(); // get input
                output_1.write(String_3 + "|" + input_1 + "\n"); // concentate string and output it to data_1 file
                output_1.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
 /* 
            System.out.println("Should there be higher taxes for republcians who make over $450,000 yearly?"); // write to data file
            String input_2 = myObj.nextLine();

            System.out.println("Do you think there should be free health insurance for US Citizens?"); // write to data file
            String input_3 = myObj.nextLine();
        
            System.out.println("Which political party are you affiliated with?"); // write to data file
            String input_4 = myObj.nextLine();*/
            i++;
        } while (i < 1);
        // load data file at the end
    }
}