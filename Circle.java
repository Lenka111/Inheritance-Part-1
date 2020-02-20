//Elena Voinu
public class Circle {
    private double radius; // instance variable

    //constructor with one parameter
    public Circle(double radius){
        if (radius < 0 ){
            this.radius = 0;
        }
        else {
            this.radius = radius; //initialize the field
        }
    }

    // method getRadius returns the value of radius field
    public double getRadius(){
        return this.radius;
    }
    // calculate area
    public double getArea(){

        return (radius * radius * Math.PI);
    }

}
