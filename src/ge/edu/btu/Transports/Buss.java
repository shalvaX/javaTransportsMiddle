package ge.edu.btu.Transports;

public class Buss extends Vehicle {
    private double stationNumber;
    private double stopTime;

    public Buss(){}
    public Buss(String code, double distance, double averageSpeed, int stationNumber, int stopTime){
        super(code, distance, averageSpeed);
        this.stationNumber = stationNumber;
        this.stopTime =  stopTime;
    }

    public double getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(double stationNumber) {
        this.stationNumber = stationNumber;
    }

    public double getStopTime() {
        return stopTime;
    }

    public void setStopTime(double stopTime) {
        this.stopTime = stopTime;
    }

    public double timeWay(){
        return ((getDistance()/getAverageSpeed())+(getStationNumber()*getStopTime()));
    }
}
