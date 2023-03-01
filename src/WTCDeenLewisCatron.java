import java.util.Scanner;
public class WTCDeenLewisCatron {
    public static void main(String [] args){
        Scanner input =  new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter the type of transportation: ");
        String userType = input.next();
        switch (userType.toLowerCase()) {
            case "land" -> {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Automobile", "$150.00", "No", "Yes", "60mph", "5");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Bus", "$10.00", "Yes", "No", "45mph", "40");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Bike", "$2.50", "No", "Yes", "10mph", "1");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Train", "$5.50", "Yes", "No", "35mph", "100");
            }
            case "air" -> {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Plane", "$735.00", "Yes", "No", "675mph", "350");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Helicopter", "$2500.00", "No", "Yes", "160mph", "8");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Hot Air Balloon", "$170.00", "Yes", "No","10mph","5");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Dirigible", "$230.00", "Yes", "No","73mph","36");
            }
            case "water" -> {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Type", "Cost", "Ticket", "Rental","Speed", "Capacity");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Boat", "$460.00", "No", "Yes", "70mph", "10");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Ship", "$120.00", "Yes", "No", "23mph", "500");
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "Submarine", "$5600.00", "No", "Yes", "35mph","2");
            }
            default -> System.out.println("Invalid transportation type.");
        }
        System.out.print("Enter the mode of transportation: ");
        String userMode = input.next();
        Transportation [] transport = new Transportation [] {
                new Automobile("land", 150, false, true, 60, 5, 4, "gas"),
                new Bus("land", 10, true, false, 45, 40, 20, false),
                new Bike("land", 2.50, false, true, 10, 1, 2, 4),
                new Train("land", 5.50, true, false, 35, 100, 56, 7),

                new Plane("air", 735, true, false, 675, 350, 162, 1500, "American"),
                new Helicopter("air", 2500, false, true, 160, 8, 54, 800,5),
                new HotAirBalloon("air", 170, true, false, 10, 5, 30,3000, 7700),
                new Dirigible("air", 230, true, false, 73, 36, 2300, 2000, 8900),

                new Boat("water", 460, false, true, 70, 10, 14, 132, 4),
                new Ship("water", 120, true, false, 23, 500, 11, 534, 5),
                new Submarine("water", 5600, false, true, 35, 2, 0, 145, true)

        };
        for (Transportation item : transport){
            if (item.getType().equalsIgnoreCase(userType) & item.getClass().getSimpleName().equalsIgnoreCase(userMode)){
                System.out.println(item);
                break;

            }

        }









    }}

