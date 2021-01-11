/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.simplerest.model;

/**
 *
 * @author Nida Aulia
 */
public class car {
    
    //parameter to call each data API
    private String id;
    
    //General Information
    private String brand;
    private String model;
    private String generation;
    private String startOfProduction;
    private String endOfProduction;
    
    //Engine information
    private String engine;
    private String Configuration;
    private String engineDisplacement;
    private String fuelDelivery;
    private String power;

    public car(String id, String brand, String model, String generation, String startOfProduction, String endOfProduction, String engine, String Configuration, String engineDisplacement, String fuelDelivery, String power) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.generation = generation;
        this.startOfProduction = startOfProduction;
        this.endOfProduction = endOfProduction;
        this.engine = engine;
        this.Configuration = Configuration;
        this.engineDisplacement = engineDisplacement;
        this.fuelDelivery = fuelDelivery;
        this.power = power;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getGeneration() {
        return generation;
    }

    public String getStartOfProduction() {
        return startOfProduction;
    }

    public String getEndOfProduction() {
        return endOfProduction;
    }

    public String getEngine() {
        return engine;
    }

    public String getConfiguration() {
        return Configuration;
    }

    public String getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getFuelDelivery() {
        return fuelDelivery;
    }

    public String getPower() {
        return power;
    }
    
}
