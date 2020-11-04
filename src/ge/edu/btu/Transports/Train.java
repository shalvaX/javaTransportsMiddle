package ge.edu.btu.Transports;

public class Train extends  Vehicle{
    private int blockingCoefficient;

    public Train(){}
    public Train(String code, int distance, int averageSpeed, int blockingCoefficient){
        super(code, distance, averageSpeed);
        this.blockingCoefficient = blockingCoefficient;
    }

    public int getBlockingCoefficient() {
        return blockingCoefficient;
    }

    public void setBlockingCoefficient(int blockingCoefficient) {
        this.blockingCoefficient = blockingCoefficient;
    }

    public double timeWay(){
        return ((getDistance()/getAverageSpeed())+getBlockingCoefficient());
    }

}
