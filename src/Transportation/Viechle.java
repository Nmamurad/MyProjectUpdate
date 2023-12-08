package Transportation;
import java.util.Scanner;
public class Viechle {
    Scanner input= new Scanner(System.in);
    private String Model;
    private String Brand;
    private int Year;
    private int Plateno;
    public String getModel() {
        return Model;
    }

    public int getPlateno() {
        return Plateno;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void setPlateno(int plateno) {
        Plateno = plateno;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
    public void Input(){
        System.out.println("What Veichle Brand do u have?");
        Brand=input.next();
        setBrand(Brand);
        System.out.println("What Veichle Model do u have?");
        Model=input.next();
        setModel(Model);
        System.out.println("What is the Year does your viechle Produced?");
        Year= input.nextInt();
        if (Year>=2009)
        setYear(Year);
        else
            System.out.println("Sorry, Your Car  Model is not Acceptable, It have to be Above 2008");
        System.out.println("What is the PLate Number of Your Viechle?");
        Plateno= input.nextInt();
        setPlateno(Plateno);
    }
public void Display(){
    System.out.println("This is the Information about the Viechle you assigned \n");
    System.out.print("Brand         Model         Year        Plate No.      \n"
            +       "--------     --------      ------      -----------   \n "
            + getBrand() + "         " +getModel() + "          " +getYear() + "           " +getPlateno());
}



}
