/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclases;
import java.util.Scanner;

/**
 *
 * @author Laura M
 */
public class EjercicioClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado lista[]= new Empleado[5];
        lista[0]= new Empleado(1, 160, "Alfonso");
        lista[1]=new Empleado(2, 80, "Marielo");
        lista[2]=new Empleado(3, 120, "Angela");
        for(int s=0; s<3; s++){
            lista[s].setSalario(lista[s].calcularSalario());
        }
        Empleado.start();
        Scanner lectura=new Scanner(System.in);
        int m=lectura.nextInt();
        if(m==1){
            System.out.println("Digite nombre: ");
            String nombre=lectura.next();
            System.out.println("Digite identificador: ");
            int ide=lectura.nextInt();
            System.out.println("Digite horas de trabajo: ");
            double horas=lectura.nextDouble();
            lista[3]=new Empleado(ide, horas, nombre);
            lista[3].setSalario(lista[3].calcularSalario());
            lista[3].mostrarDatos();
        }
        boolean existe=false;
        if(m==2){
        System.out.println("Ingrese el identificador: ");
        int n=lectura.nextInt();
        for(int h=0; (existe==false && h<3); h++){
            if(lista[h].getID()==n){
                existe=true;
                System.out.println("Ingrese el numero de horas que desea añadir: ");
                lista[h].añadirHoras(lectura.nextDouble());
            } else if(h==2){
                System.out.println("El empleado no está registrado. ");
            }
        }
        } if(m==3){
            System.out.println("Ingrese el identificador: ");
            int d=lectura.nextInt();
            for(int j=0; (existe==false && j<3); j++){
            if(lista[j].getID()==d){
                existe=true;
                lista[j].mostrarSalario();
            }else if(j==2){
                System.out.println("El empleado no está registrado. ");
            }
        }
    } if(m==4){
        Empleado.salario=lista[0].getSalario()+lista[1].getSalario()+lista[2].getSalario();
        Empleado.mostrarNomina();
    }
    }
}
