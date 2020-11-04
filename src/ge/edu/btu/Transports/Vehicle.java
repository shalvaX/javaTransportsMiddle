package ge.edu.btu.Transports;
import java.util.ArrayList;
import java.util.List;

public abstract  class Vehicle {
    private String code;
    private double distance;
    private double averageSpeed;

    public Vehicle(){}
    public Vehicle(String code, double distance, double averageSpeed){
        this.code = code;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }


    public abstract double timeWay();
}
