package adap;

public class School {
    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I am bit tired to write an assignment");
    }
}

//my friend is giving me just a class file, pilotpen and trying to connect his implementation which I required
//I have a pen interface and i want a implementation
// I am using his implementation using adapter in between