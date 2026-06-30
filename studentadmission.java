public class Admission {

    public static void main(String[] args) {

        boolean documentsOK = true;
        boolean feePaid = true;

        System.out.println("Application Submitted");

        if(documentsOK){

            if(feePaid){

                System.out.println("Admission Confirmed");

            }else{

                System.out.println("Pay Admission Fee");
            }

        }else{

            System.out.println("Documents Missing");
        }

    }

}
