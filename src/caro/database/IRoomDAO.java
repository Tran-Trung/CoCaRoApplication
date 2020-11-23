package caro.database;

import caro.entity.Room;

public interface IRoomDAO extends GenericDAO<Integer, Room>
{
    Room findByMaMH();
}
