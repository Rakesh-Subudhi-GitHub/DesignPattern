//GoodClient.java
package com.rk.test;

import com.rk.dao.DAO;
import com.rk.factory.DAOFactory;
import com.rk.factory.DAOFactoryBuilder;

public class GoodClientApp1 {

	public static void main(String[] args) {
		
		//fast chooses which to store(like db or excel) then all data store by default
		DAOFactory  dbDAOFactory=DAOFactoryBuilder.buildDAOFactory("EXCEL");
		
		DAO  stDAO=dbDAOFactory.createDAO("student");
		DAO  crsDAO=dbDAOFactory.createDAO("course");
		
		stDAO.insert();
		crsDAO.insert();
	}

}
