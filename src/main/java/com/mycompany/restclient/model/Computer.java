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
    private String name;
    private float value;
    private int serialNumber;
    private String brand;

    public Computer(String operationalSystem, int cores, boolean hasAccessories, String name, float value, int serialNumber, String brand) {
        this.operationalSystem = operationalSystem;
        this.cores = cores;
        this.hasAccessories = hasAccessories;
        this.name = name;
        this.value = value;
        this.serialNumber = serialNumber;
        this.brand = brand;
    }
    
    public Computer(int id, String operationalSystem, int cores, boolean hasAccessories, String name, float value, int serialNumber, String brand){
        this.id = id;
        this.operationalSystem = operationalSystem;
        this.cores = cores;
        this.hasAccessories = hasAccessories;
        this.name = name;
        this.value = value;
        this.serialNumber = serialNumber;
        this.brand = brand;
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
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
