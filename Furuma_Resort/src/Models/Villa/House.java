package Models.Villa;

import Models.Services;

public class House extends Services {
    private String roomStandard;
    private String convenientDescribe;
    private String pool;
    private String floor;

    public House(String Id, String servicesName, String areaUsers, String priceRent, String amount, String brand,
                 String roomStandard, String convenientDescribe, String pool, String floor)
    {
        super(Id, servicesName, areaUsers, priceRent, amount, brand);
        this.roomStandard = roomStandard;
        this.convenientDescribe = convenientDescribe;
        this.pool = pool;
        this.floor = floor;
    }

    public House(String roomStandard, String convenientDescribe, String pool, String floor) {
        this.roomStandard = roomStandard;
        this.convenientDescribe = convenientDescribe;
        this.pool = pool;
        this.floor = floor;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescribe() {
        return convenientDescribe;
    }

    public void setConvenientDescribe(String convenientDescribe) {
        this.convenientDescribe = convenientDescribe;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", convenientDescribe='" + convenientDescribe + '\'' +
                ", pool=" + pool +
                ", floor=" + floor +
                '}';
    }

    @Override
    public void showInfor() {

    }
}
