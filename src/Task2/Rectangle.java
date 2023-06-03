package Task2;

public class Rectangle {
    double width;
    double height;

    Rectangle(){
        this.width = 0.0;
        this.height = 0.0;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){
        return (2 * (height * width));
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
}
