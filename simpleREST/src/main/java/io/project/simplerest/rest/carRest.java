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
import java.util.Iterator;


/**
 *
 * @author Nida Aulia
 */
public class carRest {
    
    //Make Java Map to Store data API
    private static Map<String, car> Cars= new HashMap<>();
    
    private static carRest Car = new carRest();
    
    public static carRest getCar(){
        return Car;
    }
    
    private carRest(){
        //Technical Data W123
        // Engine With Carburretor
        Cars.put("0", new car("0", "Mercedes - Benz", "200", "200 w123", "1976", "1980", "M115", "M115 V-20", "1988", "Carburretor", "94PS"));
        Cars.put("1", new car("1", "Mercedes - Benz", "230", "230 w123", "1976", "1980", "M115", "M115 V-23", "2307", "Carburretor", "104PS"));
        Cars.put("2", new car("2", "Mercedes - Benz", "250", "250 w123", "1976", "1979", "M123", "M123 V-25", "2525", "Carburretor", "129PS"));
        Cars.put("3", new car("3", "Mercedes - Benz", "280", "280 w123", "1975", "1981", "M110", "M110 V-28", "2746", "Carburretor", "156PS"));

        // Engine With K- Jetronic (Mecanical Injection)
        Cars.put("4", new car("4", "Mercedes - Benz", "230E", "230 w123", "1980", "1985", "M102", "M102 E-23", "2299", "Bosch K-Jetronic Fuel Injection", "136PS"));
        Cars.put("5", new car("5", "Mercedes - Benz", "280E", "280 w123", "1981", "1985", "M110", "M110 E-28", "2746", "Bosch K-Jetronic Fuel Injection", "185PS"));

        // Engine With Diesel Fuel
        Cars.put("6", new car("6", "Mercedes - Benz", "200D", "200 w123", "1979", "1985", "OM615", "OM 615 D-20", "1988", "Fuel Injection With Precombution Chamber", "56PS"));
        Cars.put("7", new car("7", "Mercedes - Benz", "220D", "220 w123", "1976", "1979", "OM615", "OM 615 D-23", "2197", "Fuel Injection With Precombution Chamber", "60PS"));
        Cars.put("8", new car("8", "Mercedes - Benz", "240D", "240 w123", "1979", "1985", "OM616", "OM 616 D-24", "2404", "Fuel Injection With Precombution Chamber", "72PS"));
        Cars.put("8", new car("8", "Mercedes - Benz", "240TD", "240 w123", "1978", "1986", "OM616", "OM 616 D-24", "2404", "Fuel Injection With Precombution Chamber and turbocharger", "72PS"));
        Cars.put("9", new car("9", "Mercedes - Benz", "300D", "300 w123", "1976", "1985", "OM617", "OM 617 D-30", "3005", "Fuel Injection With Precombution Chamber", "88PS"));
        Cars.put("10", new car("10", "Mercedes - Benz", "300TD", "300 w123", "1978", "1986", "OM617", "OM 617 D-30", "3005", "Fuel Injection With Precombution Chamber and turbocharger", "125PS"));

    }
    
    public car getCar(String id){
        return Cars.get(id);
    }
    
    public static String key(){
        System.out.print("all");
        Iterator iterator = Cars.keySet().iterator();
        
        String key = null;
        while(iterator.hasNext()){
            key = (String) iterator.next();
            System.out.print(key);
            System.out.print("11");
         }
        return key;
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
}

