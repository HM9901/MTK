import Creational.BaiTap.BT3.Shape;
import Creational.BaiTap.BT3.ShapeFactory;
import Creational.BaiTap.BT3.ShapeType;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape(ShapeType.Tamgiac);
        shape = ShapeFactory.createShape(ShapeType.Chunhat);
        System.out.println(shape.draw());
        Shape shape1 = ShapeFactory.createShape(ShapeType.Chunhat);
        System.out.println(shape1.draw());
        Shape shape2 = ShapeFactory.createShape(ShapeType.Tron);
        System.out.println(shape2.draw());
    }
}
