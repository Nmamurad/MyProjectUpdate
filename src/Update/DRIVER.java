package Update;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

    public class DRIVER extends PERSON {
        private Scanner input = new Scanner(System.in);
        private Random r = new Random();
        private ArrayList<DRIVER> dr = new ArrayList<>();
        private final int idcard = 0 + r.nextInt(9999);
        private VEHICLE vehicle;
        private int age;
        private long Ephoneno;
        private String taxiBus;
        private String location;

        public DRIVER(String name, int age, long ephoneno, String taxiBus, String location) {
            super(name);
            this.age = age;
            Ephoneno = ephoneno;
            this.taxiBus = taxiBus;
            this.location = location;
        }

        public void setVehicle(VEHICLE vehicle) {
            this.vehicle = vehicle;
        }

        @Override
        public void setInput(Scanner input) {
            this.input = input;
        }

        public void setR(Random r) {
            this.r = r;
        }

        public void setDr(ArrayList<DRIVER> dr) {
            this.dr = dr;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setEphoneno(long ephoneno) {
            Ephoneno = ephoneno;
        }

        public void setTaxiBus(String taxiBus) {
            this.taxiBus = taxiBus;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public VEHICLE getVehicle() {
            return vehicle;
        }

        public int getIdcard() {
            return idcard;
        }

        public int getAge() {
            return age;
        }

        public long getEphoneno() {
            return Ephoneno;
        }

        public String getTaxiBus() {
            return taxiBus;
        }

        public String getLocation() {
            return location;
        }

        public void setTaxiBus() {
            System.out.println("Do you have a taxi or bus?");
            taxiBus = input.next().toLowerCase();
            VEHICLE v = new VEHICLE(null, null, 0, 0, 0);

            switch (taxiBus) {
                case "taxi":
                case "bus":
                    v.input();
                    setVehicle(v);
                    break;
                default:
                    System.out.println("Invalid vehicle type entered.");
            }
        }

        @Override
        public void input() {
            super.input();
            System.out.println("What is your age?");
            age = input.nextInt();

            System.out.println("What is your phone number?");
            Ephoneno = input.nextLong();
            input.nextLine(); // Consume the newline character

            String phoneNumberString = Long.toString(Ephoneno);
            if (phoneNumberString.length() != 11) {
                System.out.println("Number of characters should be 11!");
                // You might want to handle this case further
            }

            System.out.println("In which city do you live?");
            location = input.next();
            setTaxiBus();
        }


        public void display() {
            System.out.println("Name\tIDcard\tAge\tPhone No.\tLocation\tCar Type");
            System.out.println("----\t------\t---\t---------\t--------\t--------");

            System.out.printf("%s\t%d\t%d\t%d\t\t%s\t\t%s%n",
                    super.getName(), getIdcard(), getAge(), getEphoneno(), getLocation(), getTaxiBus());

            if ("taxi".equalsIgnoreCase(getTaxiBus()) || "bus".equalsIgnoreCase(getTaxiBus())) {
                VEHICLE vehicle = getVehicle();
                if (vehicle != null) {
                    System.out.println("\nVehicle Information:");
                    System.out.println("Model\tBrand\tPlate Number\tYear\tNumber of Seats");
                    System.out.println("-----\t------\t-----------\t----\t---------");
                    System.out.printf("%s\t%s\t%d\t\t%d\t%d%n",
                            vehicle.getModel(), vehicle.getBrand(), vehicle.getPlateno(),
                            vehicle.getYear(), vehicle.getNoseat());
                }
            }
        }
        public void editDriverInformation() {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter new information:");
            System.out.println("What do you want to edit?");
            System.out.println("*name\n*age\n*phone number\n*car Type\n*location");

            String attributeChoice = input.nextLine().toLowerCase();
            switch (attributeChoice) {
                case "name":
                    System.out.println("Enter new driver name:");
                    String name = input.nextLine();
                    setName(name);
                    break;

                case "age":
                    System.out.println("Enter new driver age:");
                    int age = input.nextInt();
                    setAge(age);
                    break;

                case "phone number":
                    System.out.println("Enter new driver phone number:");
                    long Ephoneno = input.nextLong();
                    setEphoneno(Ephoneno);
                    break;

                case "car type":
                    System.out.println("Enter new option: Do you have a taxi or bus?");
                    setTaxiBus();
                    break;

                case "location":
                    System.out.println("Enter new driver location:");
                    String location = input.nextLine();
                    setLocation(location);
                    System.out.println("Driver information updated successfully.");
                    break;

                default:
                    System.out.println("Invalid option. No updates were made.");
            }
        }
    }


