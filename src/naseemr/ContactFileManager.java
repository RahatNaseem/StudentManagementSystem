/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naseemr;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author rahat_000
 */
public class ContactFileManager {
    public void writeContacts(String filename, Contact[] contacts)
    {   
        try (ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            for (Contact c : contacts)
            {
                fileOut.writeObject(c);
                File outputFile = new File(filename);
                System.out.println("Output successfully written to the file "  + outputFile.getAbsolutePath());
            }
        }
        
        catch(IOException e)
        {
            System.out.println("Error writing to the file.");
        }
        
    }
     
    public Contact[] readContacts(String filename)
    {
        Contact[] contacts = new Contact[1];        
        Contact c = new Contact();
        boolean first = true;
 
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream(filename));
        
            while (true)
            {
                c = (Contact) fileIn.readObject();
                if (!first)
                {
                    contacts = Arrays.copyOf(contacts, contacts.length + 1);
                    contacts[contacts.length - 1] = c;
                }
                else
                {            
                    contacts[0] = c;
                    first = false;
                }
            }
        }catch(IOException e)
        {
            System.out.println("IO error writing to the file.");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found error writing to the file.");
        }
        return contacts;
         
    }    
}

    

