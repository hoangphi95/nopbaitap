package baitapvn;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Geomatric geo=new Geomatric();
        geo.setColor("Vàng");
        geo.setFilled("Hình Chữ Nhật");
        System.out.println(geo.toString());
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn");
        double r=sc.nextDouble();
        System.out.println("Nhập kích thước hình chứ nhật");
        double w= sc.nextDouble();
        double h=sc.nextDouble();
        System.out.println("------------");

        circle.getDiameter(r);
        circle.getArea(r);
        circle.getPerimeter(r);
        System.out.println("Hình tròn" + ":    Diện tích:"+circle.getArea(r)+ "   Chu Vi:  "+ circle.getPerimeter(r)+  "  Đường Kính:   "+circle.getDiameter(r));
        System.out.println("------------");

        rectangle.getArea(w,h);
        rectangle.getPerimeter(w,h);
        System.out.println("Hình Chữ Nhật:   "+ "   DIện Tích:"+rectangle.getArea(w,h)+"    CHu Vi: "+ rectangle.getPerimeter(w,h) );
        }
    }

