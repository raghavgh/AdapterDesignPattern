package com.adapt;

public class AssignmentWork {
    public Pen getPen() {
        return p;
    }

    public void setPen(Pen p) {
        this.p = p;
    }

    private Pen p;
    public void writeAssignment(String str){
        p.write(str);
    }
}
