package Update;

import java.util.Scanner;
    public class Taxi extends CUSTOMER{

        private int nofrontpassenger;
        private int nobackpassenger;
        private double frontPrice;
        private double backPrice;

        public Taxi(String name, Scanner input, String gender, String destination, String currentAdd, String bustaxi, int nofrontpassenger, int nobackpassenger, double frontPrice, double backPrice) {
            super(name,gender, destination, currentAdd, bustaxi);
            this.nofrontpassenger = nofrontpassenger;
            this.nobackpassenger = nobackpassenger;
            this.frontPrice = frontPrice;
            this.backPrice = backPrice;
        }

        public int getNofrontpassenger() {
            return nofrontpassenger;
        }

        public void setNofrontpassenger(int nofrontpassenger) {
            this.nofrontpassenger = nofrontpassenger;
        }

        public int getNobackpassenger() {
            return nobackpassenger;
        }

        public void setNobackpassenger(int nobackpassenger) {
            this.nobackpassenger = nobackpassenger;
        }

        public double getFrontPrice() {
            return frontPrice;
        }

        public void setFrontPrice(double frontPrice) {
            this.frontPrice = frontPrice;
        }

        public double getBackPrice() {
            return backPrice;
        }

        public void setBackPrice(double backPrice) {
            this.backPrice = backPrice;
        }
        public void taxi() {

            //super.input();

            //System.out.println("How many passengers are there?");
            int pass = input.nextInt();

            System.out.println("do you want the front passenger seat?\n1-->yes\n2-->no");
            int p = input.nextInt();
            switch (p) {
                case 1:
                    if (super.getCurrentAdd().equals("slemani") && super.getDestination().equals("erbil") || super.getCurrentAdd().equals("erbil") && super.getDestination().equals("slemani")) {

                        frontPrice = 20;

                    } else if (super.getCurrentAdd().equals("slemani") && super.getDestination().equals("duhok") || super.getCurrentAdd().equals("duhok") && super.getDestination().equals("slemani")) {
                        frontPrice = 15;
                    } else if (super.getCurrentAdd().equals("erbil") && super.getDestination().equals("duhok") || super.getCurrentAdd().equals("duhok") && super.getDestination().equals("erbil")) {
                        frontPrice = 12;
                    }
                    break;
                case 2:

                    System.out.println("How many passengers sit in the back?");
                    nobackpassenger = input.nextInt();

                    if (super.getCurrentAdd().equals("slemani") && super.getDestination().equals("erbil") || super.getCurrentAdd().equals("erbil") && super.getDestination().equals("slemani")) {
                        backPrice = nobackpassenger * 15;
                    } else if (super.getCurrentAdd().equals("slemani") && super.getDestination().equals("duhok") || super.getCurrentAdd().equals("duhok") && super.getDestination().equals("slemani")) {
                        backPrice = nobackpassenger * 10;
                    } else if (super.getCurrentAdd().equals("erbil") && super.getDestination().equals("duhok") || super.getCurrentAdd().equals("duhok") && super.getDestination().equals("erbil")) {
                        backPrice = nobackpassenger * 9;
                        break;
                    }
            }
        }
        public void display(){
            System.out.println("Do you want to see the Taxi's Information?\nyes/no");
            String veh=input.next().toLowerCase();
            switch(veh){
                case "yes":

                    System.out.println("Name\tgender\tDeparture\tDestination\tnobackpassenger\tFrontPrice\tbackPrice\tCar\n"
                            + "-------\t------\t------------\t-------------\t--------------\t--------\t-----------\t---------\n"
                            + super.getName() + "\t" + super.getGender() + "\t" + super.getCurrentAdd() + "\t\t" + super.getDestination() + "\t\t" + getNobackpassenger() + "\t\t" + getFrontPrice() + "\t" + getBackPrice() + "\t" + getBustaxi());

                case "no":
                    break;
                default:
                    System.out.println("Invalid answer");
            }}
    }

