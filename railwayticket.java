public class Railway {

    public static void main(String[] args) {

        boolean seatAvailable = true;
        boolean paymentDone = true;

        if(seatAvailable){

            if(paymentDone){

                System.out.println("Ticket Booked");

            }else{

                System.out.println("Payment Pending");
            }

        }else{

            System.out.println("No Seat Available");
        }

    }

}
