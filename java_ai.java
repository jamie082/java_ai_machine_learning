import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

 class loop {
    void machine_learning_method()
    { // machine learning method to guess what party you belong to
        System.out.println("I just got executed!");  // input_1, input_2, input_3  and 001, 002, 003 
    }

    public static void main(String[] args) {
        int i = 0;
        String String_1 = "Should there be lower taxes for Democrats";
        String String_2 = "Should there be higher taxes for Republicans who make over $450,000 yearly?";
        String String_3 = "Do you think there should be free health insurance for American Citizens every month?";
        String String_4 = "Which political party are you affilitated with?";
                        
        int right_wing = 0;
        int republican = 0;
        int democrat = 0;
        int left_wing = 0;
                
        Scanner myObj = new Scanner(System.in);  
        
        System.out.println("Machine Learning Artificial Intelligence program written by Jamie morrissey\nFor WGU December . Insert Left-Wing, Right-Wing, Democrat, or Republican for choices");
        String string_1 = "Left-Wing";
        String string_2 = "Right-Wing";
        String string_3 = "Democrat";
        String string_4 = "Republican";

        do {
            try {
                // Creates a FileWriter
                FileWriter output_1 = new FileWriter("data_1.txt", true);
                System.out.println("Should there be lower taxes for democrats?"); // write to data file
                String input_1 = myObj.nextLine(); // get input (input_1)
                output_1.write(String_3 + "|" + input_1 + "\n"); // concentate string and output it to data_1 file
                output_1.close();

                if (string_1.equals("Left-Wing"))
                {
                    left_wing = 100;
                }
                else if (string_2.equals("Right-Wing"))
                {
                    right_wing = 101;
                }
                else if (string_3.equals("Democrat"))
                {
                    democrat = 102;
                }
                else if (string_4.equals("Republican"))
                {
                    republican = 103;
                }
                System.out.println(input_1);
            }

            catch (Exception e) {
                e.getStackTrace();
            }

            try {
                FileWriter output_2 = new FileWriter("data_2.txt",true);
                System.out.println("Should there be higher taxes for republicans who make over $450,000 yearly?"); // write to data file
                String input_2 = myObj.nextLine(); // get input (input_2)
                output_2.write(String_2 + "|" + input_2 + "\n");
                output_2.close();
                if (input_2 == "Left-Wing")
                {
                   left_wing++;
                }
                else if (input_2 == "Right-Wing")
                {
                    right_wing++;
                }
                else if (input_2 == "Democrat")
                {
                    democrat++;
                }
                else if (input_2 == "Republican")
                {
                    republican++;
                }
                System.out.println(input_2);
            }

            catch(Exception e) {
                e.getStackTrace();
            }
    
            try {
                FileWriter output_3 = new FileWriter("data_3.txt",true);
                System.out.println("Do you think the government should make it easier to apply for assistance?");
                String input_3 = myObj.nextLine(); // get input (input_3)
                output_3.write(String_3 + "|" + input_3 + "\n");
                output_3.close();
                if (input_3 == "Left-Wing")
                {
                    left_wing++;
                }
                else if (input_3 == "Right-Wing")
                {
                    right_wing++;
                }
                else if (input_3 == "Democrat")
                {
                    democrat++;
                }
                else if (input_3 == "Republican")
                {
                    republican++;
                }
            }
            
            catch(Exception e) {
                e.getStackTrace();
            }

            try {
                System.out.println("What do you affiliate with? Democrat, Left-Wing, Right-Wing, or Republican?:");
                String input_final = myObj.nextLine();
            }

            catch(Exception e) {
                e.getStackTrace();
            }
        
            i++;
        } while (i < 1);
    }
}