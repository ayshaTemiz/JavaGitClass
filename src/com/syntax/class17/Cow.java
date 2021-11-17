package com.syntax.class17;

public class Cow {

	
	static int price=5;
	String name;
	String breed;
	String color;
	int age;
	double weigth;
	
//	to create a constructor using instance variables(fields)  ; (shortcut)
//	right clicksourceGenerate Constructor using Fields set the fields and access modifiersgenerate

	public Cow(String name, String breed, String color, int age, double weigth) {
//		super(); // you can remove super keyword part
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.weigth = weigth;
	}

	public Cow() {   //I created default constructor to  use single method.
		System.out.println("important line of code");
	}
	
	
	void printName() {
		
	}
	
    public Cow(String name) {
	    this();  // bu sekilde parameter olmayan yani kendi olstrgum default constructori cagirmis olurum line 26
    	this.name=name;
    	
    }
    
    
    public Cow(String name, String breed) {
    	
    	this(name);
    	this.breed=breed;
    }
    
    
    public Cow(String breed, int age) {
		
		this(breed);
		this.age = age;
		
	}
    
    public Cow(String name, String breed, String color) {
    	   
    //  this.name = name;// tekrar bunu yazmak yerine onu iceren constructoru cagirabilrisn
       this(name,breed);
       this.color=color;
    	
    }
        
    
    

	public Cow(String breed, String color, int age) {
		
		this(breed,color);
		this.age=age;
		
	}
	
	
	
	
}
