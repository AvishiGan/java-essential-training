package exceptions;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {

        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry, an error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) { //Super class of IOException
            System.out.println("Sorry, an error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        //Super class of IOException
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Sorry, an error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
