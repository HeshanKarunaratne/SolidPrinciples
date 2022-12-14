package Principles.Solid.LiscovSubstitution;

public class Prisoner implements InsideRoom {

    @Override
    public void walkInside() {
        System.out.println("Walk inside the room");
    }
}
