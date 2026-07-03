public class Elevator {

    public static void main(String[] args) {

        int currentFloor = 1;
        int destination = 5;

        while(currentFloor < destination){

            currentFloor++;

            System.out.println("Floor : " + currentFloor);

        }

        System.out.println("Destination Reached");

    }

}
