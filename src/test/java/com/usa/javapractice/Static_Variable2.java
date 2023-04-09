package com.usa.javapractice;

public class Static_Variable2 {
String name;
	
	public void getInfo () {
		
		name = " Rakib : ";
		Static_variable1.salary = 25000;
		Static_variable1.bonus = 50000;
		int total = Static_variable1.salary + Static_variable1.bonus;
		System.out.println(name + total);
			
	}
	
	public void getDemoted () {
		String slacking = " Boss not happy ";
		name = " Rakib : ";
		Static_variable1.salary = 25000;
		Static_variable1.bonus = 50000;
		int penalty = 100000;
	int total = Static_variable1.salary + Static_variable1.bonus - penalty ;
	String bigTrouble = " and goes to maximum security prison. ";
	System.out.println(name + slacking + " because he damaged his office " + total + bigTrouble );
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variable2 obj = new Static_Variable2();
	obj.getInfo();
	
	obj.getDemoted();
	
	
	
	
	
	
	}

}
