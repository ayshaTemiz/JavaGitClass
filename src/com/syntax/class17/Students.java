package com.syntax.class17;

public class Students {

	private String name;
	double gradeNum1;
	double gradeNum2;
	double gradeNum3;
	
	Students(String name,int gradeNum1,int gradeNum2,int gradeNum3){
		this.name=name;
		this.gradeNum1=gradeNum1;
		this.gradeNum2=gradeNum2;
		this.gradeNum3=gradeNum3;
		
		System.out.println(name +"'s average grade is "+ calAverageGrade ());
		
	}
	
    
	public double calAverageGrade (){
		
		double sum=(gradeNum1+gradeNum2+gradeNum3)/3;
		return sum;
	}
	
	
	
}
