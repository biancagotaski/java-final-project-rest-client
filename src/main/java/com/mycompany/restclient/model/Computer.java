package com.mycompany.restclient.model;

import java.io.Serializable;

/**
 *
 * @author bianca
 */
public class Computer implements Serializable{
    private int id;
    private String operationalSystem;
    private int cores;
    private boolean hasAccessories;

    public Computer(String operationalSystem, int cores, boolean hasAccessories) {
        this.operationalSystem = operationalSystem;
        this.cores = cores;
        this.hasAccessories = hasAccessories;
    }
    
    public Computer(int id, String operationalSystem, int cores, boolean hasAccessories){
        this.id = id;
        this.operationalSystem = operationalSystem;
        this.cores = cores;
        this.hasAccessories = hasAccessories;
    }

    public Computer(){}
    
    @Override
    public String toString(){
        return "Computer{" +
                "operationalSystem=" + this.operationalSystem +
                "cores" + this.cores +
                "hasAccessories" + this.hasAccessories +
                "}";
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperationalSystem() {
        return operationalSystem;
    }

    public void setOperationalSystem(String operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public boolean isHasAccessories() {
        return hasAccessories;
    }

    public void setHasAccessories(boolean hasAccessories) {
        this.hasAccessories = hasAccessories;
    }
    
    
}
