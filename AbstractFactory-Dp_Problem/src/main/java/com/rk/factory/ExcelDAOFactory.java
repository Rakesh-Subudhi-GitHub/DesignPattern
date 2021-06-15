//ExcelDAOFactory.java
package com.rk.factory;

import com.rk.dao.DAO;
import com.rk.dao.ExcelCourseDAO;
import com.rk.dao.ExcelStudentDAO;


public class ExcelDAOFactory {
	 //factory pattern 
     public static  DAO  createDAO(String type) {
    	    if(type.equalsIgnoreCase("student"))
    	    	 return new  ExcelStudentDAO();
    	    else if(type.equalsIgnoreCase("course"))
    	    	return new  ExcelCourseDAO();
    	    else
    	    throw new IllegalArgumentException("Invalid DAO type");
     }
}
