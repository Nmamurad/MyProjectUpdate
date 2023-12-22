package Update;

import java.util.Scanner;

public class VEHICLE {
    Scanner input=new Scanner(System.in);
    private String model;
    private int plateno;
    private int year;
    private String brand;
    private int noseat;

    public VEHICLE(  String model,  String brand,int plateno, int year, int noseat) {

        this.model = model;
        this.plateno = plateno;
        this.year = year;
        this.brand = brand;
        this.noseat = noseat;
    }

    public int getNoseat() {
        return noseat;
    }
    public void setNoseat(int noseat) {
        this.noseat = noseat;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPlateno() {
        return plateno;
    }
    public void setPlateno(int plateno) {
        this.plateno = plateno;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your car model?");
        model = input.next();
        setModel(model);
        System.out.println("what is your Brand car?");
        brand = input.next();
        setBrand(brand);
        System.out.println("What is your car plate number");
        int x= input.nextInt();
        setPlateno(x);
        System.out.println("What  year your car produced?");
        int y = input.nextInt();
        setYear(y);

        if(year<2009){
            System.out.println("To be hired in our company your car must be greater than 2009");
        }
        System.out.println("How many seats does your car have?");
        int z= input.nextInt();
        setNoseat(z);
    }
    public void display() {
        System.out.println("Model\tBrand\tPlate Number\tYear\tNumber of Seats");
        System.out.println("-----\t------\t-----------\t----\t---------\n");
        System.out.println(getModel() + "\t" + getBrand() + "\t" + getPlateno() + "\t\t" +getYear() + "\t" + getNoseat());


    }
    public void editVehicleInformation() {
        System.out.println("Enter new information:");
        System.out.println("What do you want to edit?");
        System.out.println("*model\n*brand\n*plate number\n*year\n*number of seats");

        String attributeChoice = input.next().toLowerCase();
        switch (attributeChoice) {
            case "model":
                System.out.println("Enter new car model:");
                setModel(input.next());
                break;

            case "brand":
                System.out.println("Enter new car brand:");
                setBrand(input.next());
                break;

            case "plate number":
                System.out.println("Enter new car plate number:");
                setPlateno(input.nextInt());
                break;

            case "year":
                System.out.println("Enter new car production year:");
                setYear(input.nextInt());
                break;

            case "number of seats":
                System.out.println("Enter new number of seats:");
                setNoseat(input.nextInt());
                break;

            default:
                System.out.println("Invalid option. No updates were made.");
        }
    }
    public void VEHdisplay() {
        System.out.println("Model\tBrand\tPlate Number\tYear\tNumber of Seats");
        System.out.println("-----\t------\t-----------\t----\t---------");

        System.out.printf("%s\t%s\t%d\t\t%d\t%d%n",
                getModel(), getBrand(), getPlateno(), getYear(), getNoseat());
    }









}

