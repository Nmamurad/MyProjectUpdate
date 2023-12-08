package Transportation;

import java.util.Random;
import java.util.Scanner;

public class Driver  extends Person {

       Viechle v=new Viechle();
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        private final int idcard = 0 + r.nextInt(9999);
        private int age;
        private int Ephoneno;
        private String taxiBus;
        private String location;

         public Driver (String name,int Ephoneno,String taxiBus,String location,int age){
             super(name);
             this.Ephoneno=Ephoneno;
             this.taxiBus=taxiBus;
             this.location=location;
             this.age=age;
         }
         public void setEphoneno(int Ephoneno) {
         this.Ephoneno = Ephoneno;
           }
          public void setTaxiBus( ) {
          Boolean isBreak=false;
          do{
            System.out.println("Do you have Taxi or Bus?");
            taxiBus = input.next();

            switch (taxiBus.toLowerCase()) {
                case "taxi":
                    v.Input();
                    isBreak=true;
                    break;
                case "bus":
                    v.Input();
                    isBreak=true;
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Sorry, what you Assigned Is Incorrect, Assign 'Taxi','Bus' or 'Exit'");
                    break;
            }
           } while (!taxiBus.equalsIgnoreCase("Exit")&& !isBreak);
         }
         public void setLocation(String location) {
           this.location = location;
                    }

            public void setAge(int age) {
            this.age = age;
                }
             public int getEphoneno() {
                 return Ephoneno;
             }
             public String getTaxiBus() {
               return taxiBus;
                 }
                public String getLocation() {
               return location;
                }

                public int getAge() {
                 return age;
                      }
                  public int getIdcard() {
                    return idcard;
                      }

                      public void input1() {
            super.input();
            System.out.println("What is your age?");
            age = input.nextInt();
            System.out.println("What is your phone number?");
            Ephoneno = input.nextInt();
            System.out.println("In which city do you live?");
            location = input.next();
            setTaxiBus();
        }

        public void display() {

            System.out.println("Name         IDcard      Age     Phone No.      Location        CarType\n"
                    + "-------     --------    -----   -----------    ----------     -----------\n"
                    + super.getname() + "         " + getIdcard() + "        " + getAge() + "         " + getEphoneno() + "              " + getLocation() + "            " + getTaxiBus());
       v.Display();

        }
    }

