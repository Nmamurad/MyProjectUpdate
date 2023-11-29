package Transportation;
 import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            //String model, int plateno, int year, String brand, String name
            Scanner input=new Scanner(System.in);
            Driver d=new Driver();
            Customer c=new Customer();
            System.out.println("driver or customer");
            String option = input.next();

            switch (option) {
                case "driver":

                    option.equalsIgnoreCase("driver");
                    d.input();
                    System.out.println("This is the Information you assigned");
                    d.display();
                    break;
                case "customer":
                    option.equalsIgnoreCase("customer");
                    c.input();
                    System.out.println("This is the Information you assigned");
                    c.display();
                    break;
            }


        }}


    }
}