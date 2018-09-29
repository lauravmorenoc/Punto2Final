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
public class Main {

    
    public static void main(String[] args) {
        TravelAgency agencia1= new TravelAgency("Aviatur");
        agencia1.addHotel("Fontanar", "Cra. 21a #159a-28");
        agencia1.addAirport("Jose Maria Cordoba");
        agencia1.addAirport("El dorado"); //
        int firstTravel= agencia1.addTravel("22/03/2017", 30, agencia1.getHotel("Fontanar"));
        agencia1.getOfferedTravels()[firstTravel].setOutbound(1345, "22/03/2017", "22/03/2017", agencia1.getAirport("Jose Maria Cordoba"), agencia1.getAirport("El dorado"));
        agencia1.getOfferedTravels()[firstTravel].setReturn_(1345, "22/03/2017", "22/03/2017", agencia1.getAirport("El dorado"), agencia1.getAirport("Jose Maria Cordoba"));
        
        //NOTA: Se está suponiendo que el número se vuelo de ida es igual al numero de vuelo de vuelta,
             // para cambiarlo se asigna en la linea 22
        
        agencia1.showTravelsInfo();
       
    }
    
}
