package caro.database.impl;

import caro.database.IRoomDAO;
import caro.entity.Room;

public class RoomDAO extends AbstracDAO<Integer, Room> implements IRoomDAO
{
    @Override
    public Room findByMaMH() {
        return null;
    }
}
