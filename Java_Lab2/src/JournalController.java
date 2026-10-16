import Entity.Address;
import Entity.CuratorJournalEntry;

import java.util.Scanner;

public class JournalController {
    private final JournalModel model;
    private final JournalView view;

    public JournalController(JournalModel model, JournalView view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent(Scanner scanner) {
        String lastName = validInput("Enter last name: ","^[A-Za-z]+$");
        String firstName = validInput("Enter first name: ","^[A-Za-z]+$");
        String birthDate = validInput("Enter birth date (DD-MM-YYYY): ","^\\d{2}-\\d{2}-\\d{4}$");
        String phoneNumber = validInput("Enter phone number (e.g., +380XXXXXXXXX): ","^\\+?\\d{10,15}$");
        String street = validInput("Enter street: ","^[A-Za-z0-9\\s]+$");
        String houseNumber = validInput("Enter house number: ","^[A-Za-z0-9]+$");
        String apartmentNumber = validInput("Enter apartment number: ","^[A-Za-z0-9]+$");

        Address address = new Address(street, houseNumber, apartmentNumber);
        CuratorJournalEntry newStudent = new CuratorJournalEntry(lastName, firstName, birthDate, phoneNumber, address);
        model.addStudent(newStudent);
        IO.println("Student added successfully.");
    }

    private String validInput(String s, String regex) {
        while (true){
            String in = IO.readln(s);
            if(in.matches(regex)){
                return in;
            } else {
                IO.println("Invalid input. Please try again.");
            }
        }
    }
}

