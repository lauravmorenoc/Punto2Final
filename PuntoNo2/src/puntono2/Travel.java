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
public class Travel {
    private String start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbound=null;
    private BookedFlight return_=null;

    public Travel(String start, int duration, Hotel hotel) {
        this.start = start;
        this.duration = duration;
        this.hotel = hotel;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }

    public BookedFlight getReturn_() {
        return return_;
    }
    
    public boolean setOutbound(int flightNumber, String departure, String arrival, Airport from, Airport to){
        this.outbound=new BookedFlight(flightNumber, departure, arrival, from, to);
       if(outbound.getDeparture().equals(departure)){
           return true;
       } else return false;
    }
    
    public boolean setReturn_(int flightNumber, String departure, String arrival, Airport from, Airport to){
        this.return_=new BookedFlight(flightNumber, departure, arrival, from, to);
       if(return_.getDeparture().equals(departure)){
           return true;
       } else return false;
    }
    
    public void showTravelFlightInfo(){
        System.out.println("Outbound flight number: " + outbound.getFlightNumber());
        System.out.println("Outbound departure airport description: " + outbound.getFrom().getDescription());
        System.out.println("Return flight number: " + return_.getFlightNumber());
        System.out.println("Return departure airport description: " + return_.getFrom().getDescription());
    }
}
