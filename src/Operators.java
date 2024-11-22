import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Operators {
    public static void main(String[]args)  {
        try {
            ReadFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка");
        }

    }
    public static void ReadFile() throws FileNotFoundException {
        File file = new File("232");
        Scanner scanner = new Scanner(file);


    }

    }

