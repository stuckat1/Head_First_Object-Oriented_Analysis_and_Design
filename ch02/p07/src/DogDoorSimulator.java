/*
 * O'Reilly Head First Object-Orientated Design and Analysis
 * Based on code from http://headfirstlabs.com/books/hfooad/
 * Chapter 2
 * Dog Door 3
 *
 * keweima @ gmail.com
 *
 */
public class DogDoorSimulator {

    public static void main( String[] args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside.");
        remote.pressButton();

        System.out.println("\nFido has gone outside.");
        System.out.println("\nFido is all done.");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("Fido scrathes at the door.");
        remote.pressButton();

        System.out.println("\nFido is back inside.");
    }
}
