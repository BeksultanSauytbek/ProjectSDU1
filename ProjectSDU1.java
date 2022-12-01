import java.util.Scanner;

public class ProjectSDU1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        greeting();
        travelTimeBudget();
        timeDifference();
        countryArea();


        //part 5
        System.out.print("How many places you traveled to: ");
        String places = in.nextLine();
        Integer place = Integer.parseInt(places);

        for (int i = 0; i < place; i++) {
            System.out.println("Enter the name:");
            String name1 = in.nextLine();
        }

        String[] arr = {"Italy", "England", "Netherlands", "Germany", "France"};
        System.out.println("Next place you want to travel to : ");
        System.out.println("0: " + arr[0]);
        System.out.println("1: " + arr[1]);
        System.out.println("2: " + arr[2]);
        System.out.println("3: " + arr[3]);
        System.out.println("4: " + arr[4]);

        String inp = in.nextLine();
        Integer qinp = Integer.valueOf(inp);

        if (qinp == 0) System.out.println("Thank you, Your next location is : Italy");
        if (qinp == 1) System.out.println("Thank you, Your next location is : England");
        if (qinp == 2) System.out.println("Thank you, Your next location is : Netherlands");
        if (qinp == 3) System.out.println("Thank you, Your next location is : Germany");
        if (qinp == 4) System.out.println("Thank you, Your next location is : France");
        System.out.println();

    }

    //part 1
    public static boolean greeting() {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Vacation Planner");
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("Nice to meet you " + name + ", " + "where are you traveling to? ");
        String city = in.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");
        System.out.println();
        return false;
    }

    //part 2
    public static void travelTimeBudget() {
        Scanner in = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        String numberdays = in.nextLine();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        String money = in.nextLine();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = in.nextLine();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        String threeletter = in.nextLine();
        System.out.println();
        double Time = Double.valueOf(numberdays);
        double moneyperday = Double.valueOf(money);
        double currency = Double.valueOf(threeletter);

        System.out.println("If you are traveling for " + numberdays + " days that is same as " + Math.round(Time * 24) + " hours or " + Math.round(Time * 24 * 60) + " minutes or " + Math.round(Time * 24 * 60 * 60) + " seconds");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + Math.round((moneyperday / Time) * 100.0) / 100.0 + " USD");
        System.out.println("Your total budget in " + symbol + " is " + Math.round((moneyperday * currency) * 100.0) / 100.0 + " " + symbol + ", which per day is " + Math.round((moneyperday * currency / Time) * 100.0) / 100.0 + " " + symbol);
        System.out.println();

    }

    //part 3
    public static void timeDifference() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        String timediff = in.nextLine();
        int a = Integer.parseInt(timediff);
        int b = 12 + a;
        if (b == 24) b = 00;
        else if (b == 25) b = 01;
        // max =  +-13 hours in our world
        System.out.println("That means that when it is midnight at home it will be " + timediff + ":00 in your travel ");
        System.out.println("destination and when it's noon at home it will be " + b + ":00 ");
        System.out.println();
    }
    //part 4
    public static void countryArea() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");  // 1 km2 = 0.38610215854245 sq mi
        String Area = in.nextLine();
        double finArea = Double.valueOf(Area);
        System.out.println("In miles2 that is " + Math.round((finArea * 0.38610215854245) * 100.0) / 100.0);
        System.out.println();
    }
}


