package ge.edu.btu.Transports;

import java.util.ArrayList;
import java.util.List;

public class Transport {
    private List<String> list = new ArrayList<String>();

    public Transport(){}

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void addNew(Vehicle Vehicle){
        list.add(Vehicle.getCode());
    }

    public void validateVehicles(Vehicle Vehicle) throws Exception {
        if (list.contains(Vehicle.getCode())){
            throw new Exception("Vehicle with this code already exists");
        }
    }
}
