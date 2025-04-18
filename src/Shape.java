public class Shape {

    private  String color = "white";

    public Shape(){

    }


    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
/*
    public  void describe(int side_a, int side_b){
        System.out.println("Side A is "+ side_a);
        System.out.println("Side B is "+side_b);
    }
    public  void describe(int side_a){
        System.out.println("Side A  is "+ side_a);
    }
    public  void describe(double side_a){
        System.out.println("Radius is "+ side_a);
    }
    */
    public void describe(){
        System.out.println("This is a Shape and "+
                "its color is "+ this.color);

    }

}

