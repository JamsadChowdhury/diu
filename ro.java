public class Restaurant {

    public static void main(String[] args) {

        boolean foodAvailable = true;
        boolean paymentDone = true;

        if(foodAvailable){

            System.out.println("Food Prepared");

            if(paymentDone){

                System.out.println("Food Served");
            }

        }else{

            System.out.println("Food Not Available");
        }

    }

}
