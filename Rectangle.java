package baitapvn;

public class Rectangle extends Geomatric {
    double width, height;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(String color, String filled, double width, double height){
        super(color,filled);
        this.width= width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(double width, double height){
        double area=0;
        this.width=width;
        this.height=height;
        area=width*height;
        return area;
    }
    public double getPerimeter(double width,double height){
        double perimeter=0;
        this.width=width;
        this.height=height;
        perimeter=(width+height)*2;
        return perimeter;
    }
}
