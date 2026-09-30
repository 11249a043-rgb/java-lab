import java.io.*;
public class IOStreamExample {
    public static void main(String[] args) {
        String fileName = "data.txt";
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            String data = "Welcome to Java I/O Streams.";
            byte[] bytes = data.getBytes();
            fout.write(bytes);
            fout.close();
            System.out.println("Data written successfully.");
            FileInputStream fin = new FileInputStream(fileName);
            int ch;
            System.out.println("File contents:");
            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}