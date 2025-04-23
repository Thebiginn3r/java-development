package plurasight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone firstPhone = new CellPhone();

        System.out.println("What is your serial number?");
        int SerialNumber = scanner.nextInt();
        scanner.nextLine();
        firstPhone.setSerialNumber(SerialNumber);

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();
        firstPhone.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
        firstPhone.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();
        firstPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        firstPhone.setOwner(owner);

        scanner.close();

        System.out.println("\nCellphone Details:");
        System.out.println("Serial Number: " + firstPhone.getSerialNumber());
        System.out.println("Model: " + firstPhone.getModel());
        System.out.println("Carrier: " + firstPhone.getCarrier());
        System.out.println("Phone Number: " + firstPhone.getPhoneNumber());
        System.out.println("Owner: " + firstPhone.getOwner());

        System.out.println(firstPhone);
    }
    public static void display(CellPhone phone){

    }
}
