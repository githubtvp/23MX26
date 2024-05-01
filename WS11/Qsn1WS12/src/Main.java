package Qsn1WS12.src;

import java.io.*;
import java.util.Scanner;

class CarDetails implements Serializable {
    String name;
    double price = 0.0;
    double priceToFill = 0.0;
    int initialKm = 0;
    int finalKm = 0;

    double mileage = 0.0;

    public CarDetails() {
    }

    public CarDetails(String name, double price, double priceToFill, int initialKm, int finalKm) {
        this.name = name;
        this.price = price;
        this.priceToFill = priceToFill;
        this.initialKm = initialKm;
        this.finalKm = finalKm;
        computeCarMileage();
    }

    public String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceToFill() {
        return priceToFill;
    }

    public void setPriceToFill(double priceToFill) {
        this.priceToFill = priceToFill;
    }

    public int getInitialKm() {
        return initialKm;
    }

    public void setInitialKm(int initialKm) {
        this.initialKm = initialKm;
    }

    public int getFinalKm() {
        return finalKm;
    }

    public void setFinalKm(int finalKm) {
        this.finalKm = finalKm;
    }

    private void computeCarMileage() {
        int kmRun = finalKm - initialKm;
        double noOfGallonsUsed = priceToFill / price;
        mileage = kmRun / noOfGallonsUsed;
    }
}

public class Main {
    public static void main(String[] args) {
        writeToFile();
        readFile();
    }
    private static void writeToFile() {
        Scanner kb = new Scanner(System.in);
       // String outputFile = "output.txt";
        File outputFile = new File ("output.txt");
        String name;
        double price = 0.0;
        double priceToFill = 0.0;
        int initialKm = 0;
        int finalKm = 0;
        CarDetails myCar;        
        try {
            // Open the output file for writing
            //   BufferedWriter wr = new BufferedWriter(new FileWriter(outputFile));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile));
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
                myCar = new CarDetails(name, price, priceToFill, initialKm, finalKm);
                // Write product details to the output file
                //  wr.write(name + " " + price + " " + priceToFill + " " + initialKm + " " + finalKm);
                //  wr.newLine();
                // Writing object to file
                oos.writeObject(myCar);
              //  System.out.println("Object has been written to file.");
             //   System.out.println("Car mileage : " + myCar.mileage);
            }
            // Close the reader and writer
            oos.close();
            kb.close();
            System.out.println("File writing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void readFile() {
      //  String inputFile = "output.txt";
        File inputFile = new File ("output.txt");
//        String name;
//        double price = 0.0;
//        double priceToFill = 0.0;
//        int initialKm = 0;
//        int finalKm = 0;
  //   BufferReader rdr = new BufferReader(new FileReader(inputFile));
          
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
            Object obj;
            while (true) {
                try {
                    obj = ois.readObject();
                    if (obj == null) {
                        break; // Exit the loop when end of file is reached
                    }
                    // Cast obj to your object type and process it
                    CarDetails theCar = (CarDetails) obj;
                    // Process newObj as needed
                  //  System.out.println("Object read from file: " + theCar);
                    System.out.println("Car Name : " + theCar.getName());
                    System.out.println("Car mileage : " + theCar.mileage);
                } catch (ClassNotFoundException e) {
                    // Handle the ClassNotFoundException
                    e.printStackTrace(); // Or handle it in another appropriate way
                }
            }
            // Close the reader
            ois.close();
        } catch (EOFException e) {
            // End of file reached, do nothing
        } catch (IOException e) {
            e.printStackTrace();
        }


//
//            String line;
//            // Read each line from the input file
//            while ((line = reader.readLine()) != null) {
//                // Split the line by the delimiter (e.g., comma)
//                String[] parts = line.split(" ");
//                // Extract the values
//                name = parts[0].trim();
//                price = Double.parseDouble(parts[1].trim());
//                priceToFill = Double.parseDouble(parts[2].trim());
//                initialKm = Integer.parseInt(parts[3].trim());
//                finalKm = Integer.parseInt(parts[4].trim());
//                // Now you have the values in variables, you can use them as needed
//                System.out.println("Name: " + name);
//                System.out.println("Price: " + price);
//                System.out.println("Price to fill: " + priceToFill);
//                System.out.println("Initial Kilometers: " + initialKm);
//                System.out.println("Final Kilometers: " + finalKm);
    }

}
