package com.linecomparision;

class LineCalculation
{
    private double x,y;

    LineCalculation(double x1, double y1) {
        x = x1;
        y = y1;
    }
    double distance(LineCalculation p)
    {
        return Math.sqrt( Math.pow(p.x - x,2) + Math.pow(p.y -y,2) );
    }
}



/*
LineCalculation point1_line1= new LineCalculation(2,1);
        LineCalculation point2_line1= new LineCalculation(8,2);
        double line1 = point1_line1.distance(point2_line1);
        System.out.println("Length of First Line : " + line1);
// */