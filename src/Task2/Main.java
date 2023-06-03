package Task2;

public class Main {
    public static void main(String[] args){
        // Создание прямоугольника с шириной и высотой по умолчанию
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина: " + rectangle1.getWidth());
        System.out.println("Высота: " + rectangle1.getHeight());
        System.out.println("Площадь: " + rectangle1.calculateArea());
        System.out.println("Периметр: " + rectangle1.calculatePerimeter());

        // Создание прямоугольника с заданными значениями ширины и высоты
        Rectangle rectangle2 = new Rectangle(12.0, 5.0);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());
    }
}
