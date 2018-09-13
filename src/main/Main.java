/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.ModelSuma;
import views.ViewSuma;
import controllers.ControllerSuma;

public class Main {
    public static void main(String jagb[]){
        ModelSuma model_suma = new ModelSuma();
        ViewSuma view_suma = new ViewSuma();
        ControllerSuma controller_suma = new ControllerSuma(view_suma, model_suma);
        
    }
    
}
