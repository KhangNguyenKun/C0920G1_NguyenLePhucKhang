package Models.Villa;

import Models.Services;

public class Villa extends Services {
    private String roomStandard;
    private String convenientDescribe;
    private Float pool;
    private int floor;

    public Villa(String servicesName, String areaUsers, String priceRent, String amount, String brand,
                 String roomStandard, String convenientDescribe, float pool, int floor)
    {
        super(servicesName, areaUsers, priceRent, amount, brand);
        this.roomStandard = roomStandard;
        this.convenientDescribe = convenientDescribe;
        this.pool = pool;
        this.floor = floor;
    }

    public Villa(String roomStandard, String convenientDescribe, float pool, int floor) {
        this.roomStandard = roomStandard;
        this.convenientDescribe = convenientDescribe;
        this.pool = pool;
        this.floor = floor;
    }

    public Villa() {
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

    public float getPool() {
        return pool;
    }

    public void setPool(Float pool) {
        this.pool = pool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
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
