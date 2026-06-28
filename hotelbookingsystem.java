public class HotelBooking {
    public static void main(String[] args) {

        boolean roomAvailable = true;
        boolean validCard = true;
        boolean customerArrived = true;

        System.out.println("Room Requested");

        if (roomAvailable) {
            System.out.println("Room Available");
            System.out.println("Customer Data Entered");

            if (validCard) {
                System.out.println("Booking Confirmed");

                if (customerArrived) {
                    System.out.println("Customer Using Room");
                    System.out.println("Payment Completed");
                } else {
                    System.out.println("No Show");
                    System.out.println("Penalty Charged");
                    System.out.println("Booking Cancelled");
                }

            } else {
                System.out.println("Invalid Credit Card");
            }

        } else {
            System.out.println("No Room Available");
        }

    }
}
