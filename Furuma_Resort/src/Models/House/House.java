package Models.House;

import Models.Services;

public class House extends Services  {
    public String RoomStandard;
    public String ConvenientDescribe;
    public String Pool;

    public House(String Id, String servicesName, String areaUsers, String priceRent, String amount, String brand,
                 String roomStandard, String convenientDescribe, String pool)
    {
        super(Id, servicesName, areaUsers, priceRent, amount, brand);
        RoomStandard = roomStandard;
        ConvenientDescribe = convenientDescribe;
        Pool = pool;
    }

    public House(String roomStandard, String convenientDescribe, String pool) {
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

    public String getPool() {
        return Pool;
    }

    public void setPool(String pool) {
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
