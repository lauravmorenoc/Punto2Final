/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclases;

/**
 *
 * @author Laura M
 */
public class Empleado {
    private int ide;
    private double horas;
    private String nombre;
    private double salarioU;
    public static double salario;
    public void añadirHoras(double n){
        if(n>0){
            this.horas+=n;
            System.out.println("Se añadieron " + n + " horas al empleado " + this.nombre);
        } else {
            System.out.println("No se añadieron horas al empleado.");
        }
    }
    public double calcularSalario(){
        return this.horas*1400;
    };
    public int getID(){
        return this.ide;
    }
    public void setSalario(double n){
        this.salarioU=n;
    }
    public double getSalario(){
        return this.salarioU;
    }
    public void mostrarSalario(){
        System.out.println("Salario = $" + this.salarioU);
    };
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificador: " + this.ide);
        System.out.println("Horas de trabajo: " + this. horas);
        System.out.println("Salario parcial: $" + this.salarioU);
    }
    public static void mostrarNomina(){
        System.out.println("Total a consignar: $" + salario);
    };
    public static void start(){
        System.out.println("Digite el numero correspondiente a la accion que desea realizar: ");
        System.out.println("1. Registrar un nuevo empleado.");
        System.out.println("2. Agregar horas de trabajo a un empleado. ");
        System.out.println("3. Consultar salario de un empleado. ");
        System.out.println("4. Consultar nómina");
    }
    public Empleado(int ide, double horas, String nombre){
        this.ide=ide;
        this.horas=horas;
        this.nombre=nombre;
    };
}   
