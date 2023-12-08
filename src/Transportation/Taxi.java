package Transportation;

import javax.swing.*;

public class Taxi extends Viechle{

private int Seatno;
private int Price;
private int cal;

    public int getCal() {
        return cal;
    }

    public void setCal() {
        Boolean isBreak=false;
        do{
        System.out.println("Which Position do you want to choose 1.Front? or 2.Back?   (-The Price for Taxi (Front Position) >>>>>> 20,000IQD)\n" + "                                                           " + "(-The Price for Taxi (Back Position) >>>>>> 15,000IQD)");
        int call = input.nextInt();
        System.out.println("How many Seat Numbers do you want to take?");
        Seatno = input.nextInt();
        switch (call) {
            case 1:
                if (Seatno > 0 && Seatno <= 1) {
                    cal = 20;
                    this.cal = Seatno * cal;
                } else {
                    System.out.println("For 'Front Position' you can only Assign for ONE Person");
                }
                isBreak = true;
                break;
            case 2:
                if (Seatno > 0 && Seatno <= 3) {
                    cal = 15;
                    this.cal = Seatno * cal;
                } else {
                    System.out.println("For 'Back Position' you can only Assign for THREE Person");
                } isBreak = true;
                break;
            default:
                System.out.println("The option you Choosed is Incorrect Please Try Again");
        }}while(Seatno > 0 && Seatno <= 3&&!isBreak);

}


    public int getSeatno() {
        return Seatno;
    }

    public void setSeatno() {

    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
        public void Displayc(){
        System.out.println("-You Choosed 'Taxi'");
        System.out.println("We have 4 positions to Fill According to our customers who assigns sooner ");
        System.out.println("\t\tYour Price Is"+"  >>>>>  "+getCal() +",000IQD");
    }
}