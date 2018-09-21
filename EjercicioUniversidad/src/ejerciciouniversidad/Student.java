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
public class Student {
    private String name;
    private Module takes[];

    public Student(String name, Module takes[]) {
        this.name = name;
        this.takes=takes;
        Grade grades[]=new Grade[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module[] getTakes() {
        return takes;
    }

    public void setTakes(Module[] takes) {
        this.takes = takes;
    }
}
