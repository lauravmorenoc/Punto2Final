/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouniversidad;

/**
 *
 * @author Laura M
 */
public class Grade {
    private int mark;
    private Module module;
    public Grade(int mark, Module module){
        this.mark=mark;
        this.module=module;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
