package Transportation;

public class Bus extends Viechle{
    private int Seatno;
    private int Price;
    private int Cal;

    public void setPrice(int price) {
        this.Price=price;

    }

    public int getCal() {
        return Cal;
    }

    public void setCal() {

        do {
            System.out.println("How many Seat Numbers do you want to take?");
            Seatno = input.nextInt();
            if (Seatno > 0 && Seatno <= 21) {
                Cal = 5;
                this.Cal = Seatno * Cal;
            } else {
                System.out.println("The number you Assigned is Incoerrect we only have 21 seats");
            }

            break;


        } while (  Seatno>0 &&Seatno <= 21 );
    }

    public int getPrice() {

        return Price;
    }
    public void setSeatno(int seatno) {
        this.Seatno=seatno;

    }
    public int getSeatno() {

        return Seatno;
    }
    public void Display(){
        System.out.println("-You Choosed 'Bus' these are the available informations you need to know");
        System.out.println("-The Price for Bus (For Any Position) >>>>>> 5,000IQD\n" +
              "\n\t\tWe have 21 positions to Fill According to our customers who assigns sooner ");
        System.out.println("\t\tYour Price Is"+"  >>>>>  "+getCal() +",000IQD");

    }
}
