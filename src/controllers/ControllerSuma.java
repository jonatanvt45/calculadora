/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewSuma;
import models.ModelSuma;


public class ControllerSuma {
    ViewSuma view_suma;
    ModelSuma model_suma;
    
    public ControllerSuma(ViewSuma view_suma, ModelSuma model_suma){
        this.view_suma = view_suma;
        this.model_suma = model_suma;
        initView();
    }
    public void initView(){
        view_suma.jtf_Numero1.setText(String.valueOf(model_suma.getNumero1()));
        view_suma.jtf_Numero2.setText(String.valueOf(model_suma.getNumero2()));
        view_suma.jtf_Resultado.setText(String.valueOf(model_suma.getResultado()));
        view_suma.setVisible(true);
        view_suma.jbtn_Suma.addActionListener(e->jbtn_Sumaclick());
        view_suma.jbtn_resta.addActionListener(e->jbtn_restaclick());
        view_suma.jbtn_division.addActionListener(e->jbtn_divisionclick());
        view_suma.jbtn_multiplicacion.addActionListener(e->jbtn_multiplicacionclick());
    }
    
    public void jbtn_Sumaclick(){
        model_suma.setNumero1(Double.parseDouble(view_suma.jtf_Numero1.getText()));
        model_suma.setNumero2(Double.parseDouble(view_suma.jtf_Numero2.getText()));
        model_suma.suma();
        view_suma.jtf_Resultado.setText(String.valueOf(model_suma.getResultado()));
    }
    public void jbtn_restaclick(){
        model_suma.setNumero1(Double.parseDouble(view_suma.jtf_Numero1.getText()));
        model_suma.setNumero2(Double.parseDouble(view_suma.jtf_Numero2.getText()));
        model_suma.resta();
        view_suma.jtf_Resultado.setText(String.valueOf(model_suma.getResultado()));
    }
    public void jbtn_divisionclick(){
        model_suma.setNumero1(Double.parseDouble(view_suma.jtf_Numero1.getText()));
        model_suma.setNumero2(Double.parseDouble(view_suma.jtf_Numero2.getText()));
        model_suma.division();
        view_suma.jtf_Resultado.setText(String.valueOf(model_suma.getResultado()));
    }
    public void jbtn_multiplicacionclick(){
        model_suma.setNumero1(Double.parseDouble(view_suma.jtf_Numero1.getText()));
        model_suma.setNumero2(Double.parseDouble(view_suma.jtf_Numero2.getText()));
        model_suma.multiplicacion();
        view_suma.jtf_Resultado.setText(String.valueOf(model_suma.getResultado()));
    }

    
}