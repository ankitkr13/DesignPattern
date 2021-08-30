/**structural Design pattern
 **/
public class MainClass {

    /**
     * Here we are going to use Pilot pen as our normal pen, i.e we are going to adapt it like we use other phone charger
     *
     * We have normal pen , but write function is not there in pen , so we are going to use pilot pen write method
     */
    public static void main(String a[])
    {


    AssignmentWork assignmentWork = new AssignmentWork();
    //    PilotPen pilotPen = new PilotPen();
        Pen pen = new PenAdapter();
    assignmentWork.setPen(pen);
    assignmentWork.writeAssignment("This is your assignment , Write it with your pen and dont implement pen interface , instead use PenAdapter to use Pilot pen");


    }
}
