package com.structural.adapter;

public class Student {

	public static void main(String[] args) {
		
		//PilotPen pp = new PilotPen();
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am bit tired to write assignment");
		

	}

}
