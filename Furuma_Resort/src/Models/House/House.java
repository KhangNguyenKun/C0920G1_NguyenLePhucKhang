package Models.House;

import Models.Services;

public class House extends Services  {
    public String RoomStandard;
    public String ConvenientDescribe;
    public float Pool;

    public House(String servicesName, String areaUsers, String priceRent, String amount, String brand,
                 String roomStandard, String convenientDescribe, float pool)
    {
        super(servicesName, areaUsers, priceRent, amount, brand);
        RoomStandard = roomStandard;
        ConvenientDescribe = convenientDescribe;
        Pool = pool;
    }

    public House(String roomStandard, String convenientDescribe, float pool) {
        RoomStandard = roomStandard;
        ConvenientDescribe = convenientDescribe;
        Pool = pool;
    }

    public House() {
    }

    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        RoomStandard = roomStandard;
    }

    public String getConvenientDescribe() {
        return ConvenientDescribe;
    }

    public void setConvenientDescribe(String convenientDescribe) {
        ConvenientDescribe = convenientDescribe;
    }

    public float getPool() {
        return Pool;
    }

    public void setPool(float pool) {
        Pool = pool;
    }

    @Override
    public String toString() {
        return "House{" +
                "RoomStandard='" + RoomStandard + '\'' +
                ", ConvenientDescribe='" + ConvenientDescribe + '\'' +
                ", Pool=" + Pool +
                '}';
    }

    @Override
    public void showInfor() {

    }
}
