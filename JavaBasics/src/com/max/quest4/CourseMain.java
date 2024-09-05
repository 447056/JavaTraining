package com.max.quest4;

public class CourseMain {

	public static void main(String[] args) {
		
		Trainer trainer = new Trainer();
 String[] courses =	trainer.showCourses();
 for (String course : courses) {
	 System.out.println(course);
	
}
		
		trainer.showTrainers("vinay", "bala","vignesh");
	}
}
