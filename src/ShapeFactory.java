public class ShapeFactory {
    private ShapeFactory() {
    }
    public static final Shape getShape(ShapeType type){
        Shape shape;
        switch (type){
            case Circle:
                shape = new Circle();
                break;
            case Rectangle:
                shape = new Rectangle();
                break;
            case Square:
                shape = new Square();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return shape;
    }
}
