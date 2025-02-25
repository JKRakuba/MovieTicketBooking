import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 1: Declare and initialize variables
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter the movie title: ");
        String movieTitle = scanner.nextLine();

        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();

        System.out.print("Enter the price per ticket: R");
        double pricePerTicket = scanner.nextDouble();

        // Step 2: Calculate the total cost
        double totalCost = numTickets * pricePerTicket;

        // Step 3: Apply string manipulations
        // Capitalize the first letter of each word in the movie title
        movieTitle = capitalizeTitle(movieTitle);

        // Capitalize the first letter of each word in the user's name
        userName = capitalizeName(userName);

        // Step 4: Format and display the output
        System.out.println("\nBooking Confirmation:");
        System.out.println("-----------------------");
        System.out.println("Name: " + userName);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.printf("Price per Ticket: R%.2f\n", pricePerTicket);
        System.out.printf("Total Cost: R%.2f\n", totalCost);
        System.out.println("\nThank you for booking with us, " + userName + "!");

        // Close the scanner
        scanner.close();
    }

    // Method to capitalize the first letter of each word in the movie title
    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();

        for (String word : words) {
            capitalizedTitle.append(word.substring(0, 1).toUpperCase())  // Capitalize first letter
                    .append(word.substring(1).toLowerCase())  // Make the rest lowercase
                    .append(" ");
        }

        return capitalizedTitle.toString().trim();
    }

    // Method to capitalize the first letter of each word in the user's name
    public static String capitalizeName(String name) {
        String[] nameParts = name.split(" ");
        StringBuilder capitalizedName = new StringBuilder();

        for (String part : nameParts) {
            capitalizedName.append(part.substring(0, 1).toUpperCase())  // Capitalize first letter
                    .append(part.substring(1).toLowerCase())  // Make the rest lowercase
                    .append(" ");
        }

        return capitalizedName.toString().trim();
    }
}
