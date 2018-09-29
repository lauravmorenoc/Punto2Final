/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntono2;

/**
 *
 * @author Laura M
 */
public class TravelAgency {
    private Hotel knownHotels[]=null;
    private Travel offeredTravels[]=null;
    private Airport airports[];
    private String name;

    public TravelAgency(String name){
        this.name = name;
        this.knownHotels=new Hotel[5];
        this.offeredTravels= new Travel[10];
        this.airports=new Airport[4];
    }

    public Hotel[] getKnownHotels() {
        return knownHotels;
    }


    public Travel[] getOfferedTravels() {
        return offeredTravels;
    }

    public Airport[] getAirports() {
        return airports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean addHotel(String name, String address){
        boolean agregado=false;
        for (int i = 0; i < knownHotels.length; i++) {
            if (knownHotels[i] == null){
                knownHotels[i]=new Hotel(name, address);
                agregado=true;
                i=knownHotels.length;
            }
        }
        return agregado;
    }
    
    public int addTravel(String start, int duration, Hotel hotel){
        int travelNumber=-1;
        for (int i = 0; i < offeredTravels.length; i++) {
            if (offeredTravels[i]==null){
                travelNumber=i;
                offeredTravels[i]=new Travel(start, duration, hotel);
                i=offeredTravels.length;
            }
            
        }
        return travelNumber;
    }
    
    public boolean addAirport(String name){
        boolean agregado=false;
        for (int i = 0; i < airports.length; i++) {
            if(airports[i]==null){
                airports[i]=new Airport(name);
                agregado=true;
                i=airports.length;
            }
            
        }
        return agregado;
    }
    
    public Hotel getHotel(String nombre){
        for (int i = 0; i < knownHotels.length; i++) {
            if(knownHotels[i].getName().equals(nombre)){
                return knownHotels[i];
            }
            
        }
        return null;
    }
    
    public Airport getAirport(String description){
        for (int i = 0; i < knownHotels.length; i++) {
            if(airports[i].getDescription().equals(description)){
                return airports[i];
            }
        }
        return null;
    }
    
    public void showTravelsInfo(){
        for (int i = 0; i < offeredTravels.length; i++) {
            if(offeredTravels[i]!=null) {
            System.out.println("Travel number: " + (i+1));
            offeredTravels[i].showTravelFlightInfo();
            System.out.println("\n");
            }
        }
    }
}
