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
        PrintWriter out = resp.getWriter();
       
        resp.setContentType("application/json");
        //mengambil sebuah url dari browser
        String url = req.getRequestURI();
        
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
            out.println(json);
        }
            
        else{
            resp.getOutputStream().println("{}");
        }
    }
    
    @Override
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
        String urlReq = req.getRequestURI();
        
        resp.setContentType("application/json");
        
        PrintWriter out = resp.getWriter();
        
        if(urlReq.equals("/car/")){
            addEditData(req, resp);
        }else{
            out.println("{ }");
        }
    }
    
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String urlReq = req.getRequestURI(); 
        
        String[] split = urlReq.split("/car/");
        
        carRest.getCar().deleteCar(split[1]);
    
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String urlReq = req.getRequestURI();
        
        resp.setContentType("application/json");
        
        String[] split = urlReq.split("/car/");
        
        PrintWriter out = resp.getWriter();
        
        String brand = req.getParameter("brand");
        
        if(split[1]!=null){
//            editData(req, resp);
            out.print("OK");
            out.print(brand);
        }else{
            out.print("{ }");
        }
                
    }
    
    public void addEditData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
        String id = req.getParameter("id");
        String brand = req.getParameter("brand");
        String model = req.getParameter("model");
        String generation = req.getParameter("generation");
        String startOfProduction = req.getParameter("start Production");
        String endOfProduction = req.getParameter("end Production");
        String engine = req.getParameter("engine");
        String Configuration = req.getParameter("configuration");
        String engineDisplacement = req.getParameter("engine Displacement");
        String fuelDelivery = req.getParameter("fuel Delivery");
        String power = req.getParameter("engine Displacement");
        
        
        
        carRest.getCar().addCar(new car(id, brand, model, generation, startOfProduction, endOfProduction, engine, Configuration, engineDisplacement, fuelDelivery, power));
    }
    
     public void editData(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
         String id = req.getParameter("id");
        String brand = req.getParameter("brand");
        String model = req.getParameter("model");
        String generation = req.getParameter("generation");
        String startOfProduction = req.getParameter("start Production");
        String endOfProduction = req.getParameter("end Production");
        String engine = req.getParameter("engine");
        String Configuration = req.getParameter("configuration");
        String engineDisplacement = req.getParameter("engine Displacement");
        String fuelDelivery = req.getParameter("fuel Delivery");
        String power = req.getParameter("engine Displacement");
        
        System.out.print(brand);
        
        carRest.getCar().editCar(new car(id, brand, model, generation, startOfProduction, endOfProduction, engine, Configuration, engineDisplacement, fuelDelivery, power));
    }
    
}
