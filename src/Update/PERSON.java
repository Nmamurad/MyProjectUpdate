package Update;

import java.util.Scanner;

    public class PERSON {
        //superclass
        private String name;
        Scanner input = new Scanner(System.in);
        //for the location we have the address that the driver came from but for the costumer we want the location that the costumer wants to arrive
        public PERSON(String name, Scanner input) {
            this.name = name;
            this.input = input;
        }

        public PERSON(String name) {
        }

        public void setName(String name) {

            this.name = name;
        }
        public String getName() {

            return name;
        }
        public void input() {
            System.out.println("what is your name?");
            name = input.next();
        }
        public void setInput(Scanner input) {
            this.input = input;
        }

        public Scanner getInput() {
            return input;
        }


    }

}
