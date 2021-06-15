//DAOFactory.java
package com.rk.factory;

import com.rk.dao.DAO;

public interface DAOFactory {
	public   DAO  createDAO(String type);
}
