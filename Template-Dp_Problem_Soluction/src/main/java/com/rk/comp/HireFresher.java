package com.rk.comp;

public abstract class HireFresher {
	
    public boolean conductAptitudeTest() {
    	  System.out.println("Conducting Aptitude Test for Fresher");
    	  return true;
    }//fresher required for common all developer
    
    public boolean conductGDTest() {
  	  System.out.println("Conducting GD Test for Fresher");
  	  return true;
    }//fresher required for common all developer
    
    public abstract boolean conductTechnicalTest(); // Different developer different question changes java,.net,ui
    public abstract boolean conductCodingTest();//Different developer different question changes java,.net,ui
    
    public boolean conductHRTest() {
    	  System.out.println("Conducting HR Test for Fresher");
    	  return true;
    }//fresher required for common all developer
    
    
    //its take then client only take test all desited for that
    
  //Template method - defining the skeleton of algorithm
    public  boolean  recruiteFresher() {
    	System.out.println("HireFresher.recruiteFresher alogirthem exuection is started");
        if(conductAptitudeTest())
        	  if(conductGDTest())
        		   if(conductTechnicalTest())
        			   if(conductCodingTest())
        				   if(conductHRTest())
        					      return true;
        return false;
    }
    
}//class
    
