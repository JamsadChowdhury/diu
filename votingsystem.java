public class VotingSystem {
    public static void main(String[] args) {

        boolean correctStation = true;
        boolean validID = true;

        System.out.println("Elector Arrived");

        if (correctStation) {

            if (validID) {

                System.out.println("Ballot Paper Given");
                System.out.println("Waiting for Free Cabin");
                System.out.println("Pencil Given");
                System.out.println("Voting...");
                System.out.println("Ballot Inserted");
                System.out.println("Pencil Returned");
                System.out.println("ID Returned");

            } else {

                System.out.println("Invalid Identity");
            }

        } else {

            System.out.println("Wrong Polling Station");
        }

    }
}
