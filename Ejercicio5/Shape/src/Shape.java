public class Shape {
    public static final int SQUARE = 1;
    public static final int CIRCLE = 2;
    public static final int RIGHT_TRIANGLE = 3;

    private int shapeType;
    private double size;
    public Shape(int shapeType, double size) {
        this.shapeType = shapeType;
        this.size = size;
    }
    // ... other methods ...
    public double area() {
        switch (shapeType) {
            case SQUARE: return getAreaSquare(); // Creo un método sólo para el area del cuadrado
            case CIRCLE: return getAreaCircle();// Creo un método sólo para el area del circulo
            case RIGHT_TRIANGLE: return getAreaTriangle();// Creo un método sólo para el area del triangulo
        }
        return 0;
    }

    private double getAreaTriangle() {
        return getAreaSquare() / 2.0;
    }

    private double getAreaSquare() {
        return size * size;
    }

    private double getAreaCircle() {
        return Math.PI * size * size / 4.0;
    }
}
