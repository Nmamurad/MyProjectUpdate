package Update;

import java.util.Scanner;


    public class CUSTOMER extends PERSON {

        private String gender;
        private String destination;
        private String currentAdd;
        private String bustaxi;

        public CUSTOMER(String name, String gender, String destination, String currentAdd, String bustaxi) {
            super(name);
            this.gender = gender;
            this.destination = destination;
            this.currentAdd = currentAdd;
            this.bustaxi = bustaxi;
        }
        Taxi t=new Taxi(null,null,null,null,null,null,0,0,0.0,0.0);
        public String getBustaxi() {
            return bustaxi;
        }

        public void setBustaxi(String bustaxi) {
            this.bustaxi = bustaxi;
        }

        public String getCurrentAdd() {
            return currentAdd;
        }

        public void setCurrentAdd(String currentAdd) {
            this.currentAdd = currentAdd;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public void input() {
            super.input();
            Scanner input = new Scanner(System.in);

            System.out.println("What is your gender?\n*female\n*male");
            gender = input.next().toLowerCase();

            System.out.println("Your current address: ");
            currentAdd = input.next().toLowerCase();

            System.out.println("Where do you want to go?");
            destination = input.next().toLowerCase();

            System.out.println("Do you want to go by bus or taxi?");
            bustaxi = input.next().toLowerCase();
            if (bustaxi.equals("taxi")) {
                //Taxi taxi = new Taxi(getName(), input, gender, destination, currentAdd, bustaxi, 0, 0, 0, 0);
                t.taxi();
                //t.display();
            }
        }

        public void updateCustomerInformation() {
            System.out.println("What do you want to update?");
            System.out.println("*name\n*gender\n*destination\n*currentAdd\n*bustaxi");
            String edit = input.next();
            switch (edit) {
                case "name":
                    System.out.println("Enter new customer name:");
                    setName(input.next());
                    break;
                case "gender":
                    System.out.println("Enter new customer gender:");
                    setGender(input.next());
                    break;
                case "destination":
                    System.out.println("Enter new customer destination:");
                    setDestination(input.next());
                    break;
                case "currentAdd":
                    System.out.println("Enter new current address");
                    setCurrentAdd(input.next());
                    break;
                case "bustaxi":
                    System.out.println("Enter new customer choice\ntaxi or bus");
                    setBustaxi(input.next());
                    break;
            }
        }

        public void display() {
            System.out.println("Name\tGender\tDeparture\tDestination\tVehicle Type");
            System.out.println(super.getName() + "\t" + getGender() + "\t" + getCurrentAdd() + "\t" + getDestination() + "\t" + getBustaxi());
        }
    }

