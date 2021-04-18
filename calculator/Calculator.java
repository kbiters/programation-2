package calculator;

import java.util.Scanner;



public class Calculator implements ICalulator {
    
    private double num1, num2;
   

    Scanner inp = new Scanner(System.in);

    public void setFirstNumber(double num1){
        this.num1 = inp.nextDouble();
    }
    public void setSecondNumber(double num2){
        this.num2 = inp.nextDouble();
    }
    public Double getFirstNumber(){
        return num1;
    }
    public Double getSecondNumber(){
        return num2;
    }
    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
        
    }
    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
        
    }
    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
        
    }
    @Override
    public double divition(double num1, double num2) {
        return num1 / num2;
        
    }

    
}