package vehical.rental;
import javax.swing.JOptionPane;
/**
 *
 * @author ra1435
 */
public class VehicalRentalMiniProject {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to the vehicle rental application");

//      calling the method
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Car", 59, "Blue", "monthly");

        System.out.println("here is the vehicle 2 details" + vehicle2);

        VehicleMethod(vehicle1);
        search(vehicle2);

    } //end of main
// =================================================

//    starting the vehicle method
    public static void VehicleMethod(Vehicle vehicle1) {

        for (int i = 0; i < 2; i++) {

            String transportType = JOptionPane.showInputDialog("Enter the vehicle type car or bike or bicycle for vehicle " + (i + 1));
            int monthlyPriceOfPack = Integer.parseInt(JOptionPane.showInputDialog("Enter the monthly price" + (i + 1)));
            String transportColor = JOptionPane.showInputDialog("Enter the vehicle color" + (i + 1));
            String rentalPack = JOptionPane.showInputDialog("Enter the vehicle rental pack is this monthly or yearly or weekly" + (i + 1));

            Vehicle vehicle2 = new Vehicle(transportType, monthlyPriceOfPack, transportColor, rentalPack); //new vehicle class
            vehicle2.printing();
        }

    } // end of VehicleMethod

//    starting the search method
    public static void search(Vehicle vehicle2) {

        String searchingName = JOptionPane.showInputDialog("Enter name to search");

        if (vehicle2.vehicleType.equals(searchingName)) {
            JOptionPane.showMessageDialog(null, "name found of the car \t" + "color is \t" + vehicle2.color + "type of the pack is \t" + vehicle2.typeOfPack + "\t" + vehicle2.vehicleType + "\t" + vehicle2.priceOfPack);

        } else {
            JOptionPane.showMessageDialog(null, "name not found");
        }
        JOptionPane.showMessageDialog(null, "Back to menu");

    }// end of search method
}//end of class
//=======================================================

