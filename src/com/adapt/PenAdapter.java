package com.adapt;

import com.raghav.PilotPen;

// In this design pattern you don't have access to change anything in PilotPen
// but you can use it so to use it we created a pen Adapter which work as a adapter
// between Pen and PilotPen (basically implementing pen interface showing connection of
// assignmentwork to the adapter and creating object of Piotpen showing connection of Pen to Pilotpen)
public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
