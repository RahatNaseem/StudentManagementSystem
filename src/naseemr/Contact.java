/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naseemr;
import java.io.Serializable;

/**
 *
 * @author rahat_000
 */
public class Contact implements Serializable {
    
     
    private String name;
    private String address;
    private String phone;
    private String email;

    
     
    
    public String getName()
    {
        return name;
    }
     
    public void setName(String n)
    {
        name = n;
    }
     
    public String getAddress()
    {
        return address;
    }
     
    public void setAddress(String a)
    {
        address = a;
    }
     
    public String getPhone()
    {
        return phone;
    }
     
    public void setPhone(String p)
    {
        phone = p;
    }
     
    public String getEmail()
    {
        return email;
    }
     
    public void setEmail(String e)
    {
        email = e;
    }
     
    public String ToString()
    {
        return name + "\t" + address + "\t" + phone + "\t" + email;
    }
}
    