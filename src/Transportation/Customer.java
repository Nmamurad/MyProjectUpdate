package Transportation;

import java.util.ArrayList;
import java.util.Scanner;
public class Customer extends Person {
    Scanner input = new Scanner(System.in);
    ArrayList<Customer> customers = new ArrayList<Customer>();
    Taxi t=new Taxi();
    Bus b=new Bus();
        private String gender;
        private String address;
        private String TaxiBus;


    public Customer(String name, String gender, String address, String TaxiBus) {
        super(name);
        this.gender=gender;
        this.address=address;
        this.TaxiBus=TaxiBus;
        t.setCal();

    }


    public void setTaxiBus() {
        Boolean isBreak=false;
do{
        System.out.println("Do you Want Taxi or Bus?");
        TaxiBus = input.next();


            switch (TaxiBus.toLowerCase()) {
                case "taxi":

                    t.setCal();

                    isBreak =true;
                    break;
                case "bus":

                    b.setCal();
                    b.Display();
                    isBreak =true;
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Sorry, what you Assigned Is Incorrect, Assign 'Taxi','Bus' or 'Exit'");
                    break;
            }
        } while (!TaxiBus.equalsIgnoreCase("Exit")&& !isBreak);
    }
    public String getTaxiBus() {
        return TaxiBus;
    }

        public void setCostumer(String gender, String address, String name) {

            this.gender = gender;
            this.address = address;

        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String Adress) {
this.address=Adress;
    }

        public void input() {
            super.input();
            Boolean isBreak = false;
            do {
                System.out.println("What is your gender?");
                gender = input.next();

                switch (gender) {
                    case "female":

                        isBreak = true;
                        break;
                    case "male":
                        isBreak = true;
                        break;
                    case "Exit":
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Sorry, what you Assigned Is Incorrect, Assign 'Female','Male' or 'Exit'");
                        break;
                }
            } while (!gender.equalsIgnoreCase("Exit") && !isBreak);

            System.out.println("Where do you want to go?");
            address = input.next();
        }

        public void display() {
            System.out.println("Name      Gender       Address\n"
                    +"-------   ------      ----------  \n"
                    + super.getname() + "       " + getGender() + "         " +getAddress());

        }
    }


