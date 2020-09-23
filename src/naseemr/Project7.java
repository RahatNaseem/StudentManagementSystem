/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naseemr;

import java.util.Scanner;

/**
 *
 * @author rahat_000
 */
public class Project7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         
        Scanner s = new Scanner(System.in);
        int choice;
        boolean done = false;
        ContactBook book = new ContactBook();
        String[] data;
        String buffer;
        String filename;
       
         
        do
        {
            System.out.println("1) List All Contacts");
            System.out.println("2) Add a Contact");
            System.out.println("3) Update a Contact");
            System.out.println("4) Remove a Contact");
            System.out.println("5) Save Contact Book");
            System.out.println("6) Load Contact Book");
            System.out.println("7) Exit");
            choice = s.nextInt();
            buffer = s.nextLine();
 
            switch(choice)
            {
                case 1:
                    // List all contacts
                    System.out.println(book.toString()); 
                     
                    break;
                case 2:
                    // Add a contact
                    data = new String[4];
                    System.out.print("Enter a name: ");
                    data[0] = s.nextLine();
                    System.out.print("Enter an address: ");
                    data[1] = s.nextLine();
                    System.out.print("Enter a phone: ");
                    data[2] = s.nextLine();
                    System.out.print("Enter a email: ");
                    data[3] = s.nextLine();
                    System.out.print("");
                    book.addContact(data);
                    break;
                case 3:
                    // Update a contact
                    System.out.println(book.toString());
                    data = new String[5];
                    System.out.print("Select a contact number: ");
                    data[0] = s.nextLine();
                    System.out.print("Enter a new name: ");
                    data[1] = s.nextLine();
                    System.out.print("Enter an new address: ");
                    data[2] = s.nextLine();
                    System.out.print("Enter a new phone: ");
                    data[3] = s.nextLine();
                    System.out.print("Enter a new email: ");
                    data[4] = s.nextLine();
                    System.out.print("");
                   // book.update(data);
                    break;
                case 4:
                    // Remove a contact
                    System.out.println(book.toString());
                    System.out.print("Select a contact number: ");
                    int position = s.nextInt();
                    buffer = s.nextLine();
                    System.out.print("");
                   // book.remove(position);
                    break;
                case 5:
                    System.out.print("Enter the filename to save the data to: ");
                    filename = s.nextLine();
                   // book.save(filename);
                    break;
                case 6:
                    System.out.print("Enter the filename to load: ");
                    filename = s.nextLine();
                   // book.load(filename);
                    break;
                case 7:
                    done = true;
                    System.out.print("Done");
                    System.out.print("");
                    break;
                default:
                    System.out.print("Invalid choice.");
            }
        }
        while(!done);
    }
}

        
}
