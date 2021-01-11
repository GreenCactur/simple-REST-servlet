/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.simplerest.controller;

import io.project.simplerest.model.car;
import io.project.simplerest.rest.carRest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

/**
 *
 * @author Nida Aulia
 */
@WebServlet(urlPatterns = "/")
public class controller extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //Melakukan Testing apakah servlet sudah berjalan
        

        //mengambil sebuah url dari browser
        String url = req.getRequestURI();
        System.err.println(url);
        
        //Mengambil id yang ada setelah /car/
        String urlID = url.substring("/car/".length());
        System.err.println(urlID);
        
        car Car = carRest.getCar().getCar(urlID);
        
        if(Car != null){
            String json = "{\n";
            json +="  \"id\": "+JSONObject.quote(Car.getId()) + ",\n";
            json +="  \"brand\": "+JSONObject.quote(Car.getBrand()) + ",\n";
            json +="  \"model\": "+JSONObject.quote(Car.getModel()) + ",\n";
            json +="  \"generation\": "+JSONObject.quote(Car.getGeneration()) + ",\n";
            json +="  \"start Production\": "+JSONObject.quote(Car.getStartOfProduction()) + ",\n";
            json +="  \"end Production\": "+JSONObject.quote(Car.getEndOfProduction()) + ",\n";
            json +="  \"engine\": "+JSONObject.quote(Car.getEngine()) + ",\n";
            json +="  \"configuration\": "+JSONObject.quote(Car.getConfiguration()) + ",\n";
            json +="  \"engine Displacement\": "+JSONObject.quote(Car.getEngineDisplacement()) + ",\n";
            json +="  \"fuel Delivery\": "+JSONObject.quote(Car.getFuelDelivery()) + ",\n";
            json +="  \"power\": "+JSONObject.quote(Car.getPower()) + "\n";
            json += "}\n\n";
            resp.getOutputStream().println(json);
        }else{
            resp.getOutputStream().println("{}");
        }
        
        
    }
  
    
}
