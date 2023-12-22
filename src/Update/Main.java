package Update;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<DRIVER> drivers = new ArrayList<>();
            ArrayList<CUSTOMER> customers = new ArrayList<>();
            ArrayList<VEHICLE> vehicles = new ArrayList<>();
            Boolean isBreak = false;
            int option;
            String option1;
            do {
                Taxi t=new Taxi(null,null,null,null,null,null,0,0,0.0,0.0);
                VEHICLE vehicle=new VEHICLE(null,null,0,0,0);
                DRIVER d = new DRIVER(null, 0, 0, null, null);
                CUSTOMER c = new CUSTOMER(null, null, null, null, null);
                System.out.println("Driver or Customer or Exit");
                option1 = input.next();
                switch (option1.toLowerCase()) {
                    case "driver":
                        do {
                            System.out.println("1. Add Information\n2. Show Information\n3. Update Information\n4. Exit");
                            option = input.nextInt();
                            switch (option) {
                                case 1:
                                    d.input();
                                    System.out.println("Driver Added successfully");
                                    break;
                                case 2:
                                    System.out.println("This is the Information of Driver");
                                    //  DRIVER d = new DRIVER(null, 0, 0, null, null);
                                    d.display();
                                    drivers.add(d);


                                    d.setVehicle(vehicle);
                                    VEHICLE associatedVehicle = d.getVehicle();
                                    // System.out.println("Driver's Associated Vehicle:")
                                    break;
                                case 3:
                                    d.editDriverInformation();
                                    vehicle.editVehicleInformation();
                                    break;
                                case 4:
                                    System.out.println("Exiting the program.");
                                    isBreak = true;
                                    break;
                                default:
                                    System.out.println("Invalid option. Please enter 1, 2, 3, or 4.");
                                    break;
                            }
                        } while (!isBreak);
                        break;
                    case "customer":
                        do {

                            System.out.println("1. Add Information\n2. Show Information\n3. Update Information\n4. Exit");
                            option = input.nextInt();
                            switch (option) {
                                case 1:
                                    c.input();
                                    //if ("taxi".equals(c.getBustaxi())) {
                                    //  Taxi t = new Taxi(null, null, null, null, null, null, 0, 0, 0.0, 0.0);
                                    // t.input(); // Assuming you have an input method in Taxi class
                                    //t.display();
                                    //    vehicles.add(t);
                                    // } else if ("bus".equals(c.getBustaxi())) {
                                    //   Bus b = new Bus(null, null, null, null, null, null, 0, 0.0);
                                    // b.input(); // Assuming you have an input method in Bus class
                                    // b.display();
                                    // vehicles.add(vehicle);
                                    //  } else if ("bus".equals(c.getBustaxi())) {
                                    //   Bus b = new Bus(c.getName(), input, c.getGender(), c.getDestination(),
                                    //          c.getCurrentAdd(), c.getBustaxi(), 0, 0.0);
                                    //  b.bus();
                                    //  b.display();
                                    //  vehicles.add(vehicle);

                                    break;

                                case 2:
                                    System.out.println("This is the Information of the customer");
                                    for (CUSTOMER customer : customers) {
                                        customer.display();
                                    }

                                    // Show vehicle information
                                    System.out.println("This is the Information of the vehicles");
                                    for (VEHICLE v : vehicles) {
                                        v.display();
                                    }
                                    break;

                                case 3:
                                    c.updateCustomerInformation();

                                    break;

                                case 4:
                                    System.out.println("Exiting the program.");
                                    isBreak = true;
                                    break;

                                default:
                                    System.out.println("Invalid option. Please enter 1, 2, 3, or 4.");
                                    break;
                            }
                        } while (!isBreak);
                        break;

                    case "exit":
                        System.out.println("Exiting the program.");
                        isBreak = true;
                        break;

                    default:
                        System.out.println("Invalid option. Please enter 'Driver', 'Customer', or 'Exit'");
                        break;
                }
            } while (!isBreak);
        }}


