package caro.database.impl;

import caro.database.IPlayerDAO;
import caro.entity.Player;


public class PlayerDAO extends AbstracDAO<Integer, Player> implements IPlayerDAO
{
	@Override
	public Player findByAccount(String account)
	{
		return findEqualUnique("account", account);
	}
}
