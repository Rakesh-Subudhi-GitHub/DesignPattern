//GoodClient.java
package com.rk.test;

import com.rk.dao.DAO;
import com.rk.factory.DAOFactory;
import com.rk.factory.DAOFactoryBuilder;

public class GoodClientApp {

	public static void main(String[] args) {
		
		//fast chooses the which to store (like db or excel)then all data will store 
		DAOFactory  dbDAOFactory=DAOFactoryBuilder.buildDAOFactory("DB");
		
		DAO  stDAO=dbDAOFactory.createDAO("student");
		DAO  crsDAO=dbDAOFactory.createDAO("course");
		
		stDAO.insert();
		crsDAO.insert();
	}

}
