public class OrderSystem {

    public static void main(String[] args) {

        boolean creditOK = true;
        boolean productAvailable = false;
        boolean internallyProduced = true;

        System.out.println("Order Received");
        System.out.println("Checking Client Data");

        if(creditOK){

            if(productAvailable){

                System.out.println("Waiting for Payment");

            }else{

                if(internallyProduced){

                    System.out.println("Production Started");

                }else{

                    System.out.println("Purchase Order Sent");

                }

                System.out.println("Inventory Updated");
            }

            System.out.println("Payment Received");
            System.out.println("Receipt Sent");
            System.out.println("Payment Registered");
            System.out.println("Customer Notified");
            System.out.println("Product Shipped");

        }else{

            System.out.println("Credit Card Rejected");

        }

    }

}
