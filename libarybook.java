public class Library {

    public static void main(String[] args) {

        boolean member = true;
        boolean bookAvailable = true;

        if(member){

            if(bookAvailable){

                System.out.println("Book Issued");
                System.out.println("Return Date Generated");

            }else{

                System.out.println("Book Not Available");
            }

        }else{

            System.out.println("Membership Required");
        }

    }

}
