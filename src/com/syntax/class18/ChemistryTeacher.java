package com.syntax.class18;

public class ChemistryTeacher extends Teacher {

	boolean laboratory;
	int numOfExperiment;
	
	void getPaid(int numOfExperiment ) {
		this.numOfExperiment=numOfExperiment;
		if(numOfExperiment>5) {
			System.out.println("You will get paid more");
		}else {
			System.out.println("You need to do more experiment during class");
		}
	}
	
	public static void main(String[] args) {
		
		ChemistryTeacher obj=new ChemistryTeacher();
		
	}
}
