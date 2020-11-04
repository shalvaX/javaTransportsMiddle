package ge.edu.btu;

import ge.edu.btu.Transports.Buss;
import ge.edu.btu.Transports.Train;
import ge.edu.btu.Transports.Transport;

public class Runner {
    private static Buss buss1 = new Buss("abcd",24.6,100,4,1);
    private static Train train1 = new Train("vvcd",100,230,5);
    private static Train train2 = new Train("vvcd",100,230,5);
    private static Transport transport1 = new Transport();

    public static void main(String[] args) throws java.lang.Exception {
        move();
    }
    private static void move() throws java.lang.Exception {
        try {
            transport1.validateVehicles(buss1);
            transport1.addNew(buss1);
            System.out.println(buss1.timeWay());
        }catch(java.lang.Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            transport1.validateVehicles(train1);
            transport1.addNew(train1);
            System.out.println(train1.timeWay());
        }catch(java.lang.Exception ex){
            System.out.println(ex.getMessage());
        }
        try {
            transport1.validateVehicles(train2);
            transport1.addNew(train2);
            System.out.println(train2.timeWay());
        }catch(java.lang.Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
