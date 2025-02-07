
import java.io.*;

public class Practical31 {

    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "output.txt";
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter text (type 'exit' to finish):");
            String input;
            while (!(input = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input);
                fileWriter.newLine();
            }
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("23DCS075 Isha Patel");
    }
}
