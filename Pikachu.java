package com.example.admin.pokemongo;

/**
 * Created by admin on 30.08.2016.
 */


public class Pikachu {
    private String mName;
    private double mLatitude;
    private double mLongitude;


     public Pikachu(String newName, double newLatitude, double newLogitude)
     {
         this.mName = newName;
         this.mLatitude = newLatitude;
         this.mLongitude = newLogitude;

     }
    public String getPoiName()
    {
        return mName;
    }
   public double getPoiLatitude()
   {
    return mLatitude;
   }
    public double getPoiLongitude()
    {
        return mLongitude;
    }
}
