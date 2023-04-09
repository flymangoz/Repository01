package com.usa.javapractice;

public class Additional_cond {

public static void main(String[] args) {

// Students grades 95 or above A+
//Students grades 80  or above B
//Students grade 65 or above C
// Students grades 65 below F	
// Students grades range from 0 to 100	

int marks = 98;

if (marks >=95) {
 System.out.println(" A+ ");

}
else if (marks>=80) {
	System.out.println(" B ");
}
else if (marks >=60) {
	System.out.println(" C ");
}
else if (marks<=65){
	System.out.println(" F ");
}

}
}

