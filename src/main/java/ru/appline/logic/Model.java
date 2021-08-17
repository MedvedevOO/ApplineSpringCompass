package ru.appline.logic;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private static final Model instance = new Model();

    private Compass compass = new Compass();

    public Model() {
        super();
    }

    public static Model getInstance() {
        return instance;
    }

    public Compass getCompass() {
        return compass;
    }

    public void setCompass(Compass compass) {
        this.compass = compass;
    }

    public String getDirection(int number) {


        if (compass.getNorthEast()[0] <= number && number < compass.getNorthEast()[1]) {
            return "North-East";
        }
        else if (compass.getEast()[0] <= number && number < compass.getEast()[1]) {
            return "East";
        }
        else if (compass.getSouthEast()[0] <= number && number < compass.getSouthEast()[1]) {
            return "South-East";
        }
        else if (compass.getSouth()[0] <= number && number < compass.getSouth()[1]) {
            return "South";
        }
        else if(compass.getSouthWest()[0] <= number && number < compass.getSouthWest()[1]) {
            return "South-West";
        }
        else if (compass.getWest()[0] <= number && number < compass.getWest()[1]) {
            return "West";
        }
        else if (compass.getNorthWest()[0] <= number && number < compass.getNorthWest()[1]) {
            return "North-West";
        }
        else if ((compass.getNorth()[0] <= number && number < compass.getNorth()[1]) || (compass.getNorth()[0] >= number && number < compass.getNorth()[1])){
            return "North";
        }
        else {
            return "Invalid Data.";
        }
    }
}
