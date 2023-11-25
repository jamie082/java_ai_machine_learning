import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class loop{
    public static void main(String[] args) {
        int i = 0;
        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Should there be lower taxes for democrats?");
            String input_1 = myObj.nextLine();

            System.out.println("Should there be higher taxes for republcians who make over $450,000 yearly?");
            String input_2 = myObj.nextLine();

            System.out.println("Do you think there should be free health insurance for US Citizens?");
            String input_3 = myObj.nextLine();
        
            System.out.println("Which political party are you affiliated with?");
            String input_4 = myObj.nextLine();
            i++;
        } while (i < 1);
    }
}