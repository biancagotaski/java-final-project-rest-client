/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restclient.model;

import java.io.Serializable;

/**
 *
 * @author bianca
 */
public class Loan implements Serializable {
    
    private int id;
    private String startDate;
    private String endDate;
    private String cpfCustomer;

    public Loan(String startDate, String endDate, String cpfCustomer){
        this.startDate = startDate;
        this.endDate = endDate;
        this.cpfCustomer = cpfCustomer;
    }
    
    public Loan(int id, String startDate, String endDate, String cpfCustomer){
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cpfCustomer = cpfCustomer;
    }
    
    @Override
    public String toString() {
        return "Loan{" +
                "startDate=" + this.startDate +
                "endDate" + this.endDate +
                "cpfCustomer" + this.cpfCustomer +
                "}";
    }            
    
    public Loan(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCpfCustomer() {
        return cpfCustomer;
    }

    public void setCpfCustomer(String cpfCustomer) {
        this.cpfCustomer = cpfCustomer;
    }
}
