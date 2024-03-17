package vehical.rental;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ra1435
 */
class Vehicle {

    String vehicleType;
    int priceOfPack;
    String color;
    String typeOfPack;

    public Vehicle() {
        vehicleType = "";
        priceOfPack = 0;
        color = "black";
        typeOfPack = "";
    } //vehicle initial end

    public Vehicle(String transportType,
            int monthlyPriceOfPack,
            String transportColor,
            String rentalPack) {
        vehicleType = transportType;
        priceOfPack = monthlyPriceOfPack;
        color = transportColor;
        typeOfPack = rentalPack;
    } // end of Vehicle constructor

    public void printing() {
        System.out.println(
                "Here is the\n" + vehicleType + "\nhere is the price of pack £"
                + priceOfPack + "\nhere is the color " + color + "\nhere is the pack type\n"
                + typeOfPack);

    }

} //end of Vehicle class

