package ss7_abstract_class_and_interface.bai_tap.colorable_interface;


import ss7_abstract_class_and_interface.source_code.Rectangle;

public class Square extends Rectangle implements Colorable{
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void howToColor() {

    }
}
