package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Temperatures temperatures = new Temperatures();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter to exit.");
        while (true){
            System.out.print("Please enter the temperature(F): ");
            try {
                double temp = Double.parseDouble(scanner.next());
                temperatures.setTemperature(temp);

                temperatures.isEthylFreezing();
                temperatures.isEthylBoiling();

                temperatures.isOxygenFreezing();
                temperatures.isOxygenBoiling();

                temperatures.isWaterFreezing();
                temperatures.isWaterBoiling();
                System.out.println();
            }catch (NumberFormatException e){
                System.out.println("Exiting...");
                break;
            }
        }
    }
}


class Temperatures{
    private final int ETHYL_FREEZE = -173;
    private final int ETHTL_BOIL = 172;

    private final int OXYGEN_FREEZE = -362;
    private final int OXYGEN_BOIL = -306;

    private final int WATER_FREEZE = 32;
    private final int WATER_BOIL = 212;

    private double temperature;

    public Temperatures(){
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void isEthylFreezing(){
        if(this.temperature <= ETHYL_FREEZE){
            System.out.println("Ethyl will freeze");
        }
    }

    public void isEthylBoiling(){
        if(this.temperature >= ETHTL_BOIL){
            System.out.println("Ethyl will boil");
        }
    }

    public void isOxygenFreezing(){
        if(this.temperature <= OXYGEN_FREEZE){
            System.out.println("Oxygen will freeze");
        }
    }

    public void isOxygenBoiling(){
        if(this.temperature >= OXYGEN_BOIL){
            System.out.println("Oxygen will boil");
        }
    }

    public void isWaterFreezing(){
        if(this.temperature <= WATER_FREEZE){
            System.out.println("Water will freeze");
        }
    }

    public void isWaterBoiling(){
        if(this.temperature >= WATER_BOIL){
            System.out.println("Water will boil");
        }
    }

}
