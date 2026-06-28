public class FuelPump {
    public static void main(String[] args) {

        boolean validCard = true;

        System.out.println("Waiting for Customer");

        if(validCard){

            System.out.println("Card Accepted");
            System.out.println("Hose Removed");
            System.out.println("Fuel Started");
            System.out.println("Fuel Stopped");
            System.out.println("Credit Card Charged");

        }else{

            System.out.println("Invalid Card");
            System.out.println("Return to Waiting State");

        }

    }
}
