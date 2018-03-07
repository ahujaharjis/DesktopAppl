package MyFrames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMEER
 */
public class Cash {

    private int id;
    private String name;
    private String mno;
    private String address;
    private String street;
    private String city;
    private String email;
    private String password;
    
    public Cash(int id,String name,String mno,String address,String street,String city,String email, String password)
    {
        this.id=id;
        this.name=name;
        this.mno=mno;
        this.address=address;
        this.street = street;
        this.city = city;
        this.email=email;
        this.password=password;
        
    }
            
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getmno()
    {
        return mno;
    }
    public String getaddress()
    {
        return address;
    }
    public String getstreet()
    {
        return street;
    }
    public String getcity()
    {
        return city;
    }

    public String getemail()
    {
        return email;
    }
    public String getpassword()
    {
        return password;
    }
}
