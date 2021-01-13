/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.simplerest.rest;

import java.util.Map;
import io.project.simplerest.model.car;
import java.util.Collection;
import java.util.HashMap;


/**
 *
 * @author Nida Aulia
 */
public class carRest {
    
    //Make Java Map to Store data API
    private Map<String, car> Cars= new HashMap<>();
    
    private static carRest Car = new carRest();
    
    public static carRest getCar(){
        return Car;
    }
    
    private carRest(){
       Cars.put("0", new car("0", "Mercedes - Benz", "200", "200 w123", "1976", "1980", "M115", "M115 V-20", "1988", "Carburretor", "98HP"));
       Cars.put("1", new car("1", "Mercedes - Benz", "200D", "200D w123", "1979", "1985", "OM-615", "OM615 D-20", "1988", "Fuel Injection", "60HP"));
       
    }
    
    public car getCar(String id){
        return Cars.get(id);
    }
    
    public car addCar(car Car){
        Cars.put(Car.getId(), Car);
        System.err.println(Car.getId());
        return Cars.get(Car.getId());
    }
    
    public void deleteCar(String id){
        Cars.remove(id);
    }
    
    public car editCar(car Car){
        Cars.put(Car.getId(), Car);
        return Cars.get(Car.getId());
    }
    
    
    //Check apakah Map sudah berhasil menyimpan data dan data dapat diambil
//    public static void main(String[] args) {
//        car Car = carRest.getCar().getCar("1");
//        System.err.println(Car.getBrand()+Car.getEngine());
//        
//    }
}

