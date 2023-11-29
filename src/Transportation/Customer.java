package Transportation;

import java.util.Scanner;
public class Customer extends Person {
    Scanner input = new Scanner(System.in);
        private String gender;
        private String address;

        //customer behaivior
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

        public void setAddress(String address) {
            this.address = address;
        }

        public void input() {
            super.input();
            System.out.println("what is your gender");
            gender = input.next();
            switch (gender) {
                case "female":
                    gender.equalsIgnoreCase("female");
                    break;
                case "male":
                    gender.equalsIgnoreCase("male");
                    this.gender = gender;
                    System.out.println("Where do you want to go?");
                    address = super.input.next();

            }
        }

        public void display() {
            System.out.println("Name      gender       Address\n"
                    +"-------    ------       ----------  \n"
                    + super.getname() + "      " + getGender() + "       " +getAddress());

        }
    }


