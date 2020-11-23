package caro.database;

import caro.entity.Player;


public interface IPlayerDAO extends GenericDAO<Integer, Player>
{
    Player findByAccount(String account);
}
