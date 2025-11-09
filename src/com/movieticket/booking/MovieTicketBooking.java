package com.movieticket.booking;
import java.util.*;
public class MovieTicketBooking {
    private static Map<Integer, Boolean> seats = new HashMap<>();

    // initialize seats (for example, seat numbers 1 to 10)
    static {
        for (int i = 1; i <= 10; i++) {
            seats.put(i, false);  // false = available
        }
    }

    public static void bookSeat(int seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException(" Seat number " + seatNumber + " doesn’t exist!");
        }
        if (seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("️ Seat " + seatNumber + " is already booked!");
        }

        // Book the seat
        seats.put(seatNumber, true);
        System.out.println(" Seat " + seatNumber + " booked successfully!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎬 Welcome to BookMySeat!");
        System.out.println("Available seats: " + seats.keySet());

        while (true) {
            try {
                System.out.print("\nEnter seat number to book (0 to exit): ");
                int seat = sc.nextInt();
                if (seat == 0) break;

                bookSeat(seat);
            }
            catch (InvalidSeatException | SeatAlreadyBookedException e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println(" Invalid input! Please enter a seat number.");
                sc.next(); // clear invalid input
            }
        }

        System.out.println("\n Final Seat Status:");
        for (Map.Entry<Integer, Boolean> entry : seats.entrySet()) {
            System.out.println("Seat " + entry.getKey() + ": " + (entry.getValue() ? "Booked" : "Available"));
        }

        sc.close();
    }
}
