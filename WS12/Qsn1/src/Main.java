
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    // Define file paths
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

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

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
                writer.write(name + " " + price + " " + priceToFill + " " +  initialKm + " " + finalKm);
                writer.newLine();
            }

            // Close the reader and writer
           // reader.close();
            writer.close();
            System.out.println("File reading and writing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            Scanner scanner;

            String line;

            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Split the line by the delimiter (e.g., comma)
                String[] parts = line.split(",");

                // Extract the values
                String productName = parts[0].trim();
                double price = Double.parseDouble(parts[1].trim());
                double totalPrice = Double.parseDouble(parts[2].trim());
                int initialKm = Integer.parseInt(parts[3].trim());

                // Now you have the values in variables, you can use them as needed
                System.out.println("Product Name: " + productName);
                System.out.println("Price: " + price);
                System.out.println("Total Price: " + totalPrice);
                System.out.println("Initial Kilometers: " + initialKm);
            }

            // Close the reader
            reader.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    static void pr(String msg){
        System.out.println("Hello world!");
    }

}
