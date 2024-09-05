package com.max.training;

public class Greater {
public static void main(String[] args) {
	int x=100;
	int y = 200;
	int z = 300;
	
   if(x>y && x>z) {
	   System.out.println("X is greater");
   }
   else if(y>z && y>x) {
	   System.out.println("Y is greater");
   }
   
   String result = (x>y&&x>z)?"X is greater":(y>x&&y>z)?"y is greater":"Z is greater";
   System.out.println(result);
	
}
}
