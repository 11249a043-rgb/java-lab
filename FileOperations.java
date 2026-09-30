import java.io.*;
public class FileOperations {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(fileName);
            writer.write("Welcome to Java File Operations.\n");
            writer.write("This is the first line of the file.\n");
            writer.close();
            System.out.println("Data written successfully.");
            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("This line is appended to the file.\n");
            appendWriter.close();
            System.out.println("Data appended successfully.");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nFile Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
