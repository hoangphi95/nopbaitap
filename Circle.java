package baitapvn;

public class Circle extends Geomatric {
    private double radius;

    public Circle(){

    }
    public  Circle(double radius){
        this.radius= radius;
    }

    public Circle(String color, String filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea( double radius){
        double area=0;
        this.radius=radius;
        area= 3.14*Math.pow(radius,2);
        return area;

    }
    public double getPerimeter(double radius){
        double perimeter=0;
        this.radius=radius;
        perimeter=2*3.14*radius;
        return perimeter;
    }
    public double getDiameter(double radius){
        double diameter=0;
        this.radius=radius;
        diameter=radius*2;
        return diameter;
    }
    public void Circle(double radius){
        this.radius=radius;
        System.out.println("Diện tích hình tròn=  "+getArea(radius));
        System.out.println("Chu vi hình tròn=  "+getPerimeter(radius));
        System.out.println("Đường Kính hình tròn=  "+getDiameter(radius));

    }

}



