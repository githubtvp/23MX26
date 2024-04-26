import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        writeToFile();
        readFile();
    }

    private static void writeToFile()
    {
        Scanner kb = new Scanner(System.in);
        String inputFile = "output.txt";
        String outputFile = "output.txt";
        String name;
        double price = 0.0;
        double priceToFill = 0.0;
        int initialKm = 0;
        int finalKm = 0;
        try {
            // Open the output file for writing
            BufferedWriter wr = new BufferedWriter(new FileWriter(outputFile));
            while (true) {
                System.out.print("Enter your name (or type 'exit' to finish): ");
                name = kb.nextLine();
                // Check if user wants to exit
                if (name.equalsIgnoreCase("exit")) {
                    break; // Exit the loop
                }
                System.out.print("Enter fuel price: ");
                price = kb.nextDouble();
                System.out.print("Enter price to fill: ");
                priceToFill = kb.nextDouble();
                System.out.print("Enter initial km: ");
                initialKm = kb.nextInt();
                System.out.print("Enter final km: ");
                finalKm = kb.nextInt();
                kb.nextLine(); // Consume newline left by nextDouble()
                // Write product details to the output file
                wr.write(name + " " + price + " " + priceToFill + " " + initialKm + " " + finalKm);
                wr.newLine();
            }
            // Close the reader and writer
            wr.close();
            kb.close();
            System.out.println("File writing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void readFile()
    {
        Scanner kb = new Scanner(System.in);
        String inputFile = "output.txt";
        String outputFile = "output.txt";
        String name;
        double price = 0.0;
        double priceToFill = 0.0;
        int initialKm = 0;
        int finalKm = 0;
        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Split the line by the delimiter (e.g., comma)
                String[] parts = line.split(" ");
                // Extract the values
                name = parts[0].trim();
                price = Double.parseDouble(parts[1].trim());
                priceToFill = Double.parseDouble(parts[2].trim());
                initialKm = Integer.parseInt(parts[3].trim());
                finalKm = Integer.parseInt(parts[4].trim());
                // Now you have the values in variables, you can use them as needed
                System.out.println("Name: " + name);
                System.out.println("Price: " + price);
                System.out.println("Price to fill: " + priceToFill);
                System.out.println("Initial Kilometers: " + initialKm);
                System.out.println("Final Kilometers: " + finalKm);
            }
            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void process(int iniKm, int finKm, double price, double toFillPr)
    {
        int stKm = iniKm;
        int endKm = finKm;
        int totKm = finKm - stKm;

    }


}
