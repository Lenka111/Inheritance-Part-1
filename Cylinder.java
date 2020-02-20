/*Derived class inherits from base class Circle*/
public class Cylinder extends Circle {
    private double height;

    //Call parent constructor
    public Cylinder(double radius, double height){
        super(radius);
        // initialize height field
        if(height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return (getArea()* getHeight());
    }
}
