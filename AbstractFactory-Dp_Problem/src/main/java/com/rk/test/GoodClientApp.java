//GoodClierk.java
package com.rk.test;

import com.rk.dao.DAO;
import com.rk.factory.ExcelDAOFactory;

public class GoodClientApp {

	public static void main(String[] args) {
		DAO  stDAO=ExcelDAOFactory.createDAO("student");  
		DAO  crsDAO=ExcelDAOFactory.createDAO("course");
		stDAO.insert();
		crsDAO.insert();
	}

}
