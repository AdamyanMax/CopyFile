import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("b.txt");

            FileReader in = new FileReader("a.txt");
            FileWriter out = new FileWriter("b " + f.length() + " .txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File open error: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("File read/write error: " + e.getMessage());
        }
    }
}