/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naseemr;
import java.util.ArrayList;
/**
 *
 * @author rahat_000
 */
public class ContactBook {
    private  ArrayList<Contact> entries = new ArrayList<>();
    private ContactFileManager fileMan = new ContactFileManager() ;
            
    public void addContact(Contact c  ){
                 //add email at index-3 in the list
        entries.add(c);
    }
    public void updateContact(Contact c){
        int i;
        entries.set(i, c);
    }      
    public void removeContact(int index){
        entries.remove(index);
    }
     public void save(String filename)
    {
       
        int dotIndex = filename.lastIndexOf(".");
         
        if(dotIndex == -1)
        {
            filename += ".txt";
        }
        else
        {
            filename = filename.substring(0, dotIndex) + ".txt";
        }
        
        fileMan.writeContacts(filename, entries);
        System.out.println("contact saved.");
    }
     public void load(String filename)
    {
        //Contact c = new Contact();
        int dotIndex = filename.lastIndexOf(".");
         
        if(dotIndex == -1)
        {
            filename += ".txt";
        }
        else
        {
            filename = filename.substring(0, dotIndex) + ".txt";
        }
        
        Contact[] loadedContacts;
        loadedContacts = fileMan.readContacts(filename);
        System.out.println("Object deserialized.\n");
        for (Contact c : loadedContacts) 
            System.out.println(c.toString());
        
    }
     /*public void add(Contact )
    {
        Contact c = new Contact();  //initailize the new object
        c.setName(s[0]);            // add name at 0 index in the list
        c.setAddress(s[1]);         //add address at index-1 in the list
        c.setPhone(s[2]);           //add phone at index-2 in the list
        c.setEmail(s[3]);           //add email at index-3 in the list
         
       
            
            Contact [] entries2 = new Contact[entries.length+1];
            System.arraycopy(entries, 0, entries2, 0, entries.length);
            entries = entries2;
            entries[entries.length-1] = c;
            System.out.println("entry made");
    }
     
    public void update(String[] s)
    {
        int position = Integer.parseInt(s[0]);
        entries[position].setName(s[1]);        
        entries[position].setAddress(s[2]);        
        entries[position].setPhone(s[3]);        
        entries[position].setEmail(s[4]);
    }
     
    public void remove(int index)
    {
        /*Contact[] temp = new Contact[entries.length - 1];//creating a contact list one element smaller
        // for(int i = 0; i < entries.length; i++){
         if (index == 0)
        {
            temp = Arrays.copyOfRange(entries, 1, entries.length);
            System.out.println("Entry at index 0 removed");
            
            
        }
        else
        {
          //  temp = Arrays.copyOfRange(entries, 0, index - 1);
            temp = Arrays.copyOfRange(entries, index + 1, entries.length);
            System.out.println("Entry at "+index+"removed");
            
            
        }
         System.arraycopy(temp, 0, entries, 0, temp.length);
          entries = temp;
                 
        
    }
     
    @Override
    public String toString()
    {
        String contacts = "";
         
        for (int i = 0; i < entries.length; i++)
        {
            contacts += i + "\t" + entries[i].ToString() + "\n";
        }
        return contacts;
    }
    public void save(String filename)
    {
       
        int dotIndex = filename.lastIndexOf(".");
         
        if(dotIndex == -1)
        {
            filename += ".txt";
        }
        else
        {
            filename = filename.substring(0, dotIndex) + ".txt";
        }
        
        fileMan.writeContacts(filename, entries);
        System.out.println("contact saved.");
    }
     
    public void load(String filename)
    {
        //Contact c = new Contact();
        int dotIndex = filename.lastIndexOf(".");
         
        if(dotIndex == -1)
        {
            filename += ".txt";
        }
        else
        {
            filename = filename.substring(0, dotIndex) + ".txt";
        }
        
        Contact[] loadedContacts;
        loadedContacts = fileMan.readContacts(filename);
        System.out.println("Object deserialized.\n");
        for (Contact c : loadedContacts) 
            System.out.println(c.toString());
        
    }
}*/
    
}
