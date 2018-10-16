public class dayOfTheWeekChallenge {

    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(5);
        printDayOfTheWeek(7);

        System.out.println("------------------");

        printDayOfWeekTwo(0);
        printDayOfWeekTwo(5);
        printDayOfWeekTwo(7);

    }

    private static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

                default:
                    System.out.println("Invalid day");
        }
    }

    private static void printDayOfWeekTwo (int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if(day == 1 ) {
            System.out.println("Monday");
        } else if(day == 2 ) {
            System.out.println("Tuesday");
        } else if(day == 3 ) {
            System.out.println("Wednesday");
        } else if(day == 4 ) {
            System.out.println("Thursday");
        } else if(day == 5 ) {
            System.out.println("Friday");
        } else if(day == 6 ) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
