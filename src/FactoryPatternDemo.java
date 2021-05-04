public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.Square);
        shape.draw();
    }
}
