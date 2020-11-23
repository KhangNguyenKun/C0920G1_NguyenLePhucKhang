package Models.Room;

import Models.Services;

public class Room extends Services {
    public String freeServices;

    public Room(String Id, String servicesName, String areaUsers, String priceRent, String amount, String brand,
                String freeServices)
    {
        super(Id, servicesName, areaUsers, priceRent, amount, brand);
        this.freeServices = freeServices;
    }

    public Room() {
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfor() {

    }
}
