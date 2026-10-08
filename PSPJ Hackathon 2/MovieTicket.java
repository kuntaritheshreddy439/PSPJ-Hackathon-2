import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberofTickets;

    MovieTicket(String movieName, double ticketPrice, int numberofTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberofTickets = numberofTickets;
    }
    double calculateTotal() {
        return ticketPrice * numberofTickets;
    }

    double calculateDiscount() {
        if (numberofTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }
    void displayBill() {
        System.out.println("\n----- CINEMA TICKET BILL -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.printf("Ticket Price    : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberofTickets);
        System.out.printf("Total Amount    : %.2f%n", calculateTotal());
        System.out.printf("Discount        : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount    : %.2f%n", calculateFinalAmount());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberofTickets = sc.nextInt();

        MovieTicket ticket = new MovieTicket(
            movieName, ticketPrice, numberofTickets
        );

        ticket.displayBill();
    }
}