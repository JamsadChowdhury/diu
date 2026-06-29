public class ATM {

    public static void main(String[] args) {

        boolean validPin = true;
        boolean enoughBalance = true;

        System.out.println("Insert ATM Card");

        if(validPin){

            System.out.println("PIN Verified");

            if(enoughBalance){

                System.out.println("Cash Withdrawn");
                System.out.println("Transaction Complete");

            }else{

                System.out.println("Insufficient Balance");
            }

        }else{

            System.out.println("Invalid PIN");
        }

    }
}
