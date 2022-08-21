package com.app.automateweb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student extends Person{	
	int studentId;
	String studentName;	
	String age;	
	String studentClass;
	
	public Student() {
		super();
		
	}
}

class People {
	
	public String printHelloWorld(String name)
	{
		return null;
	}
	
	public People() {
		
	}
}


public class Person extends People{

	// These are called 'FIELDS' OR PROPERTIES.
	float weight; // 25.6lb
	int age; // 5	
	float height; // 5.6ft
	
	
	static boolean isHuman = true;
	
	public Person() {
		
	}
	
	public Person(float weight, int age, float height) {
		
		super();
		this.weight = weight;
		this.age = age;
		this.height = height;
	}
	
	public Person(float weight) {
		this.weight = weight;
		
		// have to initialize the age and height to some desired default value
	}
	
    public static void main(String args[]) {

      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      
      
      Person bhavani = new Person();
      
      Person shiv = new Person(180, 45, 160);
      Person shiv2 = new Person(180);
    
      Person.printHelloWorld2("static");
     
      System.out.println(Person.isHuman);
      
      
      System.out.println(shiv.printHelloWorld("Shiv")); // Hello Shiv! is returned
      
      String str = new String("shiv");
      System.out.println(str);
      
      for (int i = 0; i < str.length(); i++) {
    	  Character c = str.charAt(i);
    	  
    	  // total 10 OR conditions check. if (c.equals('A') || c.equals ('a') || 
      }
      
      
      try {
    	  
      
      int a[] = new int[3]; // 1, 8, 6 
      Person[] personArray = new Person[2];
      
      String strArray[] = new String[2];
      strArray[0] = "shiv";
      strArray[1] = "kumar";
            
      //TODO: Iterate through the Array with for loop and print out both the Strings in the Array
      
      for (int i = 0; i < strArray.length; i++) {    	  
    	  System.out.println(strArray[i]);
      }
      
      }
      
      catch (Exception e) {
    	e.printStackTrace();
      }
      finally {
    	  // you can put any statement here. For cleanup of variables.
    	  
    	//  It gets executed even if exception comes above.
      }
      
      
      ArrayList<String> arrList = new ArrayList<String>();
      
      arrList.add("shiv");
      arrList.add("kumar");
      
      for (int i = 0; i < arrList.size(); i++) {    	  
    	  System.out.println(arrList.get(i));
      }
      
      Set<String> hashSet = new HashSet<String>();
      
      hashSet.add("shiv");
      hashSet.add("kumar");
      
      // This will be a very fast O(1) operation
      boolean containsWord = hashSet.contains("shiv");
      
      Iterator iterator = hashSet.iterator();
      
      while (iterator.hasNext()) {
    	  System.out.println(iterator.next());
    	  
      }
      
    }
        
    public String printHelloWorld(String name)
 {   
    
    	final int i = 0;
    	
    	//i = 10; NOT allowed
    	
     return "Hello " + name + "!";
 }   
    
    public static String printHelloWorld2(String name2)
    {
    
        return "Hello " + name2 + "!";
    }  
    
    public String printHelloWorld(String firstName, String lastName)
    {   
        return "Hello " + firstName + lastName + "!";
    }  
    
    
}
