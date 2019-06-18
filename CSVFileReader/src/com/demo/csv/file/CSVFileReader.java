package com.demo.csv.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

	public static void main(String []args)
	{
		String csvFile="D:\\samlpe.csv";
		//BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<Student> list=new ArrayList<Student>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] names = line.split(cvsSplitBy);
                
                Student s=new Student(names[0],Integer.parseInt(names[1]),names[2]);    
                list.add(s);
               // System.out.println("Country [code= " + names[0] + " , name=" + names[1] +" ,name="+names[2]+"]");

            }
            
           

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Student s :list)
        {
        	System.out.println(s.getfName());
        }
				
	}

	private static void foreach(Object object) {
		// TODO Auto-generated method stub
		
	}
	
}
