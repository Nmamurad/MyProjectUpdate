package Transportation;
 import java.util.Scanner;
 import java.util.ArrayList;
public class Main {
        public static void main(String[] args) {
            ArrayList<Driver> drivers = new ArrayList<Driver>();
            ArrayList<Customer> customers = new ArrayList<Customer>();
            Scanner input = new Scanner(System.in);
            Driver d = new Driver();
            Customer c = new Customer();
            Taxi t = c.t;

            Boolean isBreak7 = false;
            String option;
            int option1;
            do {
                System.out.println("1.Add Information \n2.Show Information \n3.Update Information \n4.Remove Information\n5.Exitting the program");
                option1 = input.nextInt();

                switch (option1) {


                    case 1:

                        Boolean isBreak1 = false;
                        do {
                            System.out.println("Are you a Driver or Customer");
                            option = input.next();

                            switch (option.toLowerCase()) {
                                case "driver":
                                    System.out.println("What is your name?");
                                   String name = input.next();
                                    System.out.println("What is your age?");
                                   int age = input.nextInt();
                                    System.out.println("What is your phone number?");
                                    int Ephoneno = input.nextInt();
                                    System.out.println("In which city do you live?");
                                    String location = input.next();



                                Boolean isBreak2=false;
                                    String taxiBus;
                                    do{
                                    System.out.println("Do you have Taxi or Bus?");
                                    taxiBus = input.next();

                                    switch (taxiBus.toLowerCase()) {
                                        case "taxi":
                                            System.out.println("What Veichle Brand do u have?");
                                            String Brand=input.next();
                                            System.out.println("What Veichle Model do u have?");
                                            String Model=input.next();
                                            System.out.println("What is the Year does your viechle Produced?");
                                            int Year= input.nextInt();
                                            if (Year>=2009)
                                            Year=Year;
                                            else
                                                System.out.println("Sorry, Your Car  Model is not Acceptable, It have to be Above 2008");
                                            System.out.println("What is the PLate Number of Your Viechle?");
                                            int Plateno= input.nextInt();
                                            isBreak2=true;
                                            break;
                                        case "bus":
                                            System.out.println("What Veichle Brand do u have?");
                                            Brand=input.next();
                                            System.out.println("What Veichle Model do u have?");
                                            Model=input.next();
                                            System.out.println("What is the Year does your viechle Produced?");
                                            Year= input.nextInt();
                                            if (Year>=2009)
                                            Year=Year;
                                            else
                                                System.out.println("Sorry, Your Car  Model is not Acceptable, It have to be Above 2008");
                                            System.out.println("What is the PLate Number of Your Viechle?");
                                            Plateno= input.nextInt();

                                            isBreak2=true;
                                            break;
                                        case "exit":
                                            System.out.println("Exiting the program.");
                                            break;
                                        default:
                                            System.out.println("Sorry, what you Assigned Is Incorrect, Assign 'Taxi','Bus' or 'Exit'");
                                            break;
                                    }
                                } while (!taxiBus.equalsIgnoreCase("Exit")&& !isBreak2);
                                 isBreak1=true;
                                 break;


                                case "customer":
                                    int cal;
                                    System.out.println("What is your name?");
                                    name = input.next();

                                    Boolean isBreak3 = false;
                                    String gender;
                                    do {
                                        System.out.println("What is your gender?");
                                        gender = input.next();

                                        switch (gender) {
                                            case "female":

                                                isBreak3 = true;
                                                break;
                                            case "male":
                                                isBreak3 = true;
                                                break;
                                            case "Exit":
                                                System.out.println("Exiting the program.");
                                                break;
                                            default:
                                                System.out.println("Sorry, what you Assigned Is Incorrect, Assign 'Female','Male' or 'Exit'");
                                                break;
                                        }
                                    } while (!gender.equalsIgnoreCase("Exit") && !isBreak3);

                                    System.out.println("Where do you want to go?");
                                    String address = input.next();

                                    Boolean isBreak4=false;
                                    int Seatno;
                                    do{
                                        System.out.println("Do you Want Taxi or Bus?");
                                       String TaxiBus = input.next();


                                        switch (TaxiBus.toLowerCase()) {
                                            case "taxi":
                                               Boolean isBreak5 = false;
                                                do{
                                                    System.out.println("Which Position do you want to choose 1.Front? or 2.Back?   (-The Price for Taxi (Front Position) >>>>>> 20,000IQD)\n" + "                                                           " + "(-The Price for Taxi (Back Position) >>>>>> 15,000IQD)");
                                                    int call = input.nextInt();
                                                    System.out.println("How many Seat Numbers do you want to take?");
                                                     Seatno = input.nextInt();
                                                    switch (call) {
                                                        case 1:
                                                            if (Seatno > 0 && Seatno <= 1) {
                                                                cal = 20;
                                                                cal = Seatno * cal;
                                                            } else {
                                                                System.out.println("For 'Front Position' you can only Assign for ONE Person");
                                                            }
                                                            isBreak5= true;
                                                            break;
                                                        case 2:
                                                            if (Seatno > 0 && Seatno <= 3) {
                                                                cal = 15;
                                                                 cal = Seatno * cal;
                                                            } else {
                                                                System.out.println("For 'Back Position' you can only Assign for THREE Person");
                                                            } isBreak5 = true;
                                                            break;
                                                        default:
                                                            System.out.println("The option you Choosed is Incorrect Please Try Again");
                                                    }}while(Seatno > 0 && Seatno <= 3&&!isBreak5);
                                                isBreak4 =true;
                                                break;

                                            case "bus":
                                                do {
                                                    System.out.println("How many Seat Numbers do you want to take?");
                                                     Seatno = input.nextInt();
                                                    if (Seatno > 0 && Seatno <= 21) {
                                                        cal = 5;
                                                        cal = Seatno * cal;
                                                    } else {
                                                        System.out.println("The number you Assigned is Incoerrect we only have 21 seats");
                                                    }

                                                    break;


                                                } while (  Seatno>0 &&Seatno <= 21 );
                                        }

                                                isBreak4 =true;
                                                break;
                                            case "exit":
                                                System.out.println("Exiting the program.");
                                                break;
                                            default:
                                                System.out.println("Sorry, what you Assigned Is Incorrect, Assign 'Taxi','Bus' or 'Exit'");
                                                break;
                                        }
                                    } while (!TaxiBus.equalsIgnoreCase("Exit")&& !isBreak4);
                            }
                                    isBreak = true;
                                    break;
                                case "exit":
                                    System.out.println("Exiting the program.");
                                    break;
                                default:
                                    System.out.println("Invalid option. Please enter 'Driver', 'Customer', or 'exit'.");
                                    break;
                            }
                        } while (!option.equalsIgnoreCase("exit") && !isBreak7);






                    case 2:
                        Boolean isBreak1 = false;
                        do {
                            System.out.println("Have you Choosed a Driver or Customer");
                            option = input.next();

                            switch (option.toLowerCase()) {
                                case "driver":
                                    System.out.println("This is the Information you assigned");
                                    System.out.println("Name         IDcard      Age     Phone No.      Location        CarType\n"
                                            + "-------     --------    -----   -----------    ----------     -----------\n"
                                            + super.getname() + "         " + getIdcard() + "        " + getAge() + "         " + getEphoneno() + "              " + getLocation() + "            " + getTaxiBus());
                                    System.out.println("This is the Information about the Viechle you assigned \n");
                                    System.out.print("Brand         Model         Year        Plate No.      \n"
                                            +       "--------     --------      ------      -----------   \n "
                                            + getBrand() + "         " +getModel() + "          " +getYear() + "           " +getPlateno());

                                    isBreak1 = true;
                                    break;
                                case "customer":

                                    System.out.println("This is the Information you assigned");
                                    System.out.println("Name      Gender       Address\n"
                                            +"-------   ------      ----------  \n"
                                            + super.getname() + "       " + getGender() + "         " +getAddress());
                                    System.out.println("-You Choosed 'Taxi'");
                                    System.out.println("We have 4 positions to Fill According to our customers who assigns sooner ");
                                    System.out.println("\t\tYour Price Is"+"  >>>>>  "+getCal() +",000IQD");
                                    isBreak1 = true;
                                    break;
                                case "exit":
                                    System.out.println("Exiting the program.");
                                    break;
                                default:
                                    System.out.println("Invalid option. Please enter 'Driver', 'Customer', or 'exit'.");
                                    break;
                            }
                        } while (!option.equalsIgnoreCase("exit") && !isBreak1);
                        break;
                    case 3:
                    case 5:
                        System.out.println("Exiting the program.");
                        break;
                }

                }while (option1 != (5) && !isBreak);

            }


        }



