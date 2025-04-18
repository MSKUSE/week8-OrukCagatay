public class Rectangle extends Shape {

    private int side_a = 0,side_b = 0;

    public Rectangle(){

    }

    public Rectangle(int side_a, int side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public Rectangle(String color, int side_a, int side_b) {
        super(color);
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public int getSide_a() {
        return side_a;
    }

    public void setSide_a(int side_a) {
        this.side_a = side_a;
    }

    public int getSide_b() {
        return side_b;
    }

    public void setSide_b(int side_b) {
        this.side_b = side_b;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A "+ side_a +"Side B "+ side_b);
    }


    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.side_a == rectangle.side_a
        && this.side_b == rectangle.side_b
        &&this.getColor().equals(rectangle.getColor())){
            return  true;
        }
        else {
            return false;
        }
        // Dİğer metotları da overload et//

    }
}
