package Models.task_1;

public abstract class Services {
    public String VillaServices;
    public String HouseServices;
    public String RoomServices;
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Services(String id) {
        this.id = id;
    }

    public Services(String villaServices, String houseServices, String roomServices) {
        VillaServices = villaServices;
        HouseServices = houseServices;
        RoomServices = roomServices;
    }

    public String getVillaServices() {
        return VillaServices;
    }

    public void setVillaServices(String villaServices) {
        VillaServices = villaServices;
    }

    public String getHouseServices() {
        return HouseServices;
    }

    public void setHouseServices(String houseServices) {
        HouseServices = houseServices;
    }

    public String getRoomServices() {
        return RoomServices;
    }

    public void setRoomServices(String roomServices) {
        RoomServices = roomServices;
    }
}
