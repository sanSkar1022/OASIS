import java.util.Scanner;

 public class OnlineReservation {
    private static boolean[] seats = new boolean[30];
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\nplease select an option");
            System.out.println("1. View Seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
             
            switch(option) {
                case 1:
                   viewSeatMap();
                   break;
                   
                case 2:
                   reserveSeat();
                   break;
                   
                case 3:
                    cancelReservation();
                    break;
                    
                case 4:
                    System.exit(0);
                    
                default:
                System.out.println("Invalid option");    
                  
            }

        }
    }

    private static void viewSeatMap() {
        System.out.println("\nCurrent Seat Map:");
        for (int i=0; i<seats.length; i++) {
            if ( seats[i]) {
                System.out.print("X ");
            }
            else {
                System.out.print((i+1) +" "); 
            }
        }
        System.out.println();
    }

     private static void reserveSeat() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nEnter seat Number (1-30): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber <1 || seatNumber>30) {
            System.out.println(" Invalid seat number!");
        }
        else if (seats[seatNumber -1]){
            System.out.println("Seat already reserved!");
        }
        else {
            seats[seatNumber -1]= true;
            System.out.println("Seat reserved!");
        }
     }
    private static void cancelReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-30): ");
        int seatNumber = scanner.nextInt();
        if ( seatNumber <1 || seatNumber >30){
            System.out.println("Invalid seat number!");
        }
        else if (!seats[seatNumber - 1]){
            System.out.println("Seat not reserved!");
        }
        else {
            seats[seatNumber - 1] = false;
            System.out.println(" Reservation cancelled!");   
        }
    }
 }


