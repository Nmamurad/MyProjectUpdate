package Transportation;
import java.util.Scanner;
public class Person {

    private String name;
        Scanner input=new Scanner(System.in);
        //for the location we have the address that the driver came from but for the costumer wewant the lovcation that the costumer want to arrive
        public Person (String name) {
            this.name = name;

        }

        public String getname(){
            return name;
        }




        public void input() {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");
            name = input.next();


        }


    }

