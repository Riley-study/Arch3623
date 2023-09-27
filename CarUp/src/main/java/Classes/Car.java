package Classes;

import Enumerators.TypeCar;
import Enumerators.TypeFuel;
import Enumerators.TypeGearBox;

import java.awt.*;

public abstract class Car {
    private String mark;
    private String model;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBox;
    private Color bodyColor;
    private int engineCap;

    public Car(String mark, String model, TypeCar bodyType,
               int numberWheels, TypeFuel fuelType, TypeGearBox gearBox,
               Color bodyColor, int engineCap) {
        this.mark = mark;
        this.model = model;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuelType = fuelType;
        this.gearBox = gearBox;
        this.bodyColor = bodyColor;
        this.engineCap = engineCap;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(TypeGearBox gearBox) {
        this.gearBox = gearBox;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }

    public boolean turnLights() {
        return true;
    }

    public boolean turnWrappers() {
        return true;
    }

}


