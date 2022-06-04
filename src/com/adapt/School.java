package com.adapt;

import com.raghav.PilotPen;

public class School {


    public static void main(String[] args) {
	// write your code here
        PenAdapter pa = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(pa);
        aw.writeAssignment("I'm big tired to write an assignment");
    }
}
