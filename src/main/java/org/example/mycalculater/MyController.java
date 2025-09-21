package org.example.mycalculater;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController {
    @FXML
    TextField MyText;
    @FXML
    Label MyLabel1;
    @FXML
    Label MyLabel2;
    @FXML
    Label MyLabel3;
    private int x;
    private int y;
    public void num1(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("1");
        }
        else{
            MyLabel3.setText("1");
        }
    }
    public void num2(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("2");
        }
        else{
            MyLabel3.setText("2");
        }
    }
    public void num3(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("3");
        }
        else{
            MyLabel3.setText("3");
        }
    }
    public void num4(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("4");
        }
        else{
            MyLabel3.setText("4");
        }
    }
    public void num5(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("5");
        }
        else{
            MyLabel3.setText("5");
        }
    }
    public void num6(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("6");
        }
        else{
            MyLabel3.setText("6");
        }
    }
    public void num7(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("7");
        }
        else{
            MyLabel3.setText("7");
        }
    }
    public void num8(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("8");
        }
        else{
            MyLabel3.setText("8");
        }
    }
    public void num9(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("9");
        }
        else{
            MyLabel3.setText("9");
        }
    }
    public void num0(ActionEvent event){
        if(MyLabel1.getText().equals("-")) {
            MyLabel1.setText("0");
        }
        else{
            MyLabel3.setText("0");
        }
    }
    public void plus(ActionEvent event){
        MyLabel2.setText("+");
    }
    public void minus(ActionEvent event){
        MyLabel2.setText("-");
    }
    public void multi(ActionEvent event){
        MyLabel2.setText("×");
    }
    public void dev(ActionEvent event){
        MyLabel2.setText("÷");
    }
    public void power(ActionEvent event){
        MyLabel2.setText("^");
    }
    public void clear(ActionEvent event){
        MyLabel1.setText("-");
        MyLabel2.setText("-");
        MyLabel3.setText("-");
        MyText.clear();
    }
    private double result;
    public void equal(ActionEvent event){
        x= Integer.parseInt(MyLabel1.getText());
        y= Integer.parseInt(MyLabel3.getText());

        if(MyLabel2.getText().equals("+")){
            result=x+y;
        }
        else if(MyLabel2.getText().equals("-")) {
            result=x-y;
        }
        else if(MyLabel2.getText().equals("×")) {
            result=x*y;
        }
        else if(MyLabel2.getText().equals("÷")) {
            result= (double) x /y;
        }
        else if(MyLabel2.getText().equals("^")) {
            result=Math.pow(x,y);
        }

        MyText.setText(String.valueOf(result));
    }



}
