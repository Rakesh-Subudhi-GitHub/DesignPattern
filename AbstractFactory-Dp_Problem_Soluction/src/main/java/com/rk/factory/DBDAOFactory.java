//DBDAOFactory.java
package com.rk.factory;

import com.rk.dao.DAO;
import com.rk.dao.DBCourseDAO;
import com.rk.dao.DBStudentDAO;


public class DBDAOFactory implements DAOFactory {
	 
	//factory pattern 
    public  DAO  createDAO(String type) {
    
      if(type.equalsIgnoreCase("student"))
      	 return new  DBStudentDAO();
    	
      else if(type.equalsIgnoreCase("course"))
       	return new  DBCourseDAO();
    	
      else
    	throw new IllegalArgumentException("Invalid DAO type");
     
    }//db method
}//clss
