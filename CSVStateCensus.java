package com.bridgelab;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;

public class CSVStateCensus {
	String i;
	public void readFile() {
		try{
			Reader fin=new FileReader("C:\\Users\\Ram\\eclipse-workspace\\FileIO\\src\\com\\bridgelab\\IndiaStateCode.csv");
			BufferedReader br=new BufferedReader(fin);
	        
	        while(( i = br.readLine()) != null) {
	        	String[] status = i.split(",");
	        	System.out.println(status[0]);
	        			System.out.println(status[1]);
	        			System.out.println(status[2]);
	        			System.out.println(status[3]);
	        			System.out.println("+++++++++++++++++++");
	        }
	        br.close();
	        fin.close();
	    }catch(Exception e){System.out.println(e);}
	}
}
