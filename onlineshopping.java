public class Shopping {

    public static void main(String[] args) {

        boolean productAvailable = true;
        boolean paymentSuccess = true;

        if(productAvailable){

            if(paymentSuccess){

                System.out.println("Order Confirmed");
                System.out.println("Product Shipped");

            }else{

                System.out.println("Payment Failed");
            }

        }else{

            System.out.println("Out of Stock");
        }

    }

}
