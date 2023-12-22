package Update;

import java.util.Scanner;

    public class Bus extends CUSTOMER {
        private int nopassenger;
        private double price;

        public Bus(String name, Scanner input, String gender, String destination, String currentAdd, String bustaxi, int nopassenger, double price) {
            super(name, gender, destination, currentAdd, bustaxi);
            this.nopassenger = nopassenger;
            this.price = price;
        }

        public int getNopassenger() {
            return nopassenger;
        }

        public void setNopassenger(int nopassenger) {
            this.nopassenger = nopassenger;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void bus() {
            System.out.println("How many passengers are there?");
            nopassenger = input.nextInt();
            if (super.getCurrentAdd().equals("slemani") && super.getDestination().equals("erbil") ||
                    super.getCurrentAdd().equals("erbil") && super.getDestination().equals("slemani")) {
                price = nopassenger * 10;
            } else if (super.getCurrentAdd().equals("slemani") && super.getDestination().equals("duhok") ||
                    super.getCurrentAdd().equals("duhok") && super.getDestination().equals("slemani")) {
                price = nopassenger * 5;
            } else if (super.getCurrentAdd().equals("erbil") && super.getDestination().equals("duhok") ||
                    super.getCurrentAdd().equals("duhok") && super.getDestination().equals("erbil")) {
                price = nopassenger * 7;
            }
        }

        public void display() {
            System.out.println("Do you want to see the Bus's Information?");
            String veh = input.next().toLowerCase();
            switch (veh) {
                case "yes":
                    System.out.println("Name\tgender\tDeparture\tDestination\tNoPassenger\tprice\tCar\n"
                            + "-------\t------\t------------\t-------------\t--------------\t--------\t-----------\t--------\n"
                            + super.getName() + "\t" + super.getGender() + "\t" + super.getCurrentAdd() + "\t\t" +
                            super.getDestination() + "\t\t" + getNopassenger() + "\t\t" + getPrice() + "\t" + getBustaxi());
                    break;
                case "no":
                    break;
                default:
                    System.out.println("Invalid answer");
            }
        }
    }


