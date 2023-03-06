package baitapvn;

public class Geomatric {
    private String color;
    private String filled;

    public Geomatric() {

    }

    public Geomatric(String color, String filled) {
        this.color = color;
        this.filled = filled;

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
       this.color=color;
    }
    public String getFilled(){
        return filled;
    }
    public void setFilled(String filled){
        this.filled=filled;
    }
    public String toString(){
        return this.color + "   " + this.filled;
    }

}

