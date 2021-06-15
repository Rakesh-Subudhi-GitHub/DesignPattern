//BadClierk.java
package com.rk.test;

import com.rk.dao.DAO;
import com.rk.factory.DBDAOFactory;
import com.rk.factory.ExcelDAOFactory;

public class BadClientApp {

	public static void main(String[] args) {
		DAO  stDAO=ExcelDAOFactory.createDAO("student");  //store student info in excel
		DAO  crsDAO=DBDAOFactory.createDAO("course");     //store course in database its a problem
		stDAO.insert();
		crsDAO.insert();
	}

}
