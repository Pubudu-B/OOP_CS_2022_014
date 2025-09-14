package LW_01;



public class Circle {

    private int radius ;
    Circle(int r){
        radius = r ;
    }

    public double computeArea(){
        return (Math.PI*radius*radius) ;
    }

    public double computeCircumference(){
        return (2*Math.PI*radius) ;
    }
}

