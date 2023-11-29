package Transportation;

import java.util.Random;
import java.util.Scanner;

public class Driver  extends Person {

        //employee
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        private final int idcard = 0 + r.nextInt(9999);
        private int age;
        private int Ephoneno;
        private String taxiBus;
        private String location;

        public void setInput(Scanner input) {
            this.input = input;
        }

        public void setR(Random r) {
            this.r = r;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setEphoneno(int Ephoneno) {
            this.Ephoneno = Ephoneno;
        }

        public void setLocation(String location) {
            this.location = location;
        }


        public int getIdcard() {
            return idcard;
        }

        public int getAge() {
            return age;
        }


        public int getEphoneno() {
            return Ephoneno;
        }


        public String getTaxiBus() {
            return taxiBus;
        }

        public void setTaxiBus(String taxiBus) {
            System.out.println("Do you have taxi or bus");
            taxiBus = input.next();
            switch (taxiBus) {
                case "taxi":
                    taxiBus.equalsIgnoreCase("taxi");
                    break;
                case "bus":
                    taxiBus.equalsIgnoreCase("bus");
                    this.taxiBus = taxiBus;

            }
        }

        public String getLocation() {
            return location;
        }


        public void input() {
            super.input();
            //System.out.println(getIdcard());
            System.out.println("what is your age?");
            age = input.nextInt();
            System.out.println("what is your phone number?");
            Ephoneno = input.nextInt();
            System.out.println("in which city do you live?");
            location = input.next();

        }

        public void display() {
            System.out.println("Name       IDcard      Age     Phone No.     Location       CarType\n"
                    + "-------     --------    -----   -----------    ----------     -----------\n"
                    + super.getname() + "       " + getIdcard() + "      " + getAge() + "     " + getEphoneno() + "     " + getLocation() + "       " + getTaxiBus());
        }
    }

