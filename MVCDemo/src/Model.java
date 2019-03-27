/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AmrHesham
 */
public class Model {
    private String name;

    public Model() {
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String businessLogic(String name){
        return name+" is good";
    }
    
}
