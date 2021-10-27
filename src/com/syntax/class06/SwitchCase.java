package com.syntax.class06;

public class SwitchCase {

	public static void main(String[] args) {
	
		
		char gender='M';
		String description;
		
		
		switch(gender) {
		
		case 'M':
			description="Male";
			break;
			
		case 'F':
		description="Female";
		break;
		
		default:
			description="Unknown gender";
		}
		
		System.out.println("Your gender is "+ description);

	}

}
