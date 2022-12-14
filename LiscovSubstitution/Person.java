package Principles.Solid.LiscovSubstitution;

public class Person implements InsideRoom, OutsideRoom {

    @Override
    public void walkInside() {
        System.out.println("Walk inside the room");
    }

    @Override
    public void walkOutside() {
        System.out.println("Walk outside the room");
    }
}
