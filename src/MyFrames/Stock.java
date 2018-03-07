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
public class Stock {

    private String id;
    private String pname;
    private int available;
    private float mrp;
    private int gst;
    private int hsn;
    private String per;
    
    public Stock(String id, String pname,int available, float mrp, int gst, int hsn, String per)
    {
        this.id=id;
        this.pname=pname;
        this.available=available;
        this.mrp=mrp;
        this.gst=gst;
        this.hsn = hsn;
        this.per = per;
        
    }
            
    public String getid()
    {
        return id;
    }
    public String getpname()
    {
        return pname;
    }
    public int getavailable()
    {
        return available;
    }
    public float getmrp()
    {
        return mrp;
    }
    public int getgst()
    {
        return gst;
    }
    public int gethsn()
    {
          return hsn;  
            }
    public String getper()
    {
        return per;
    }            
  }
