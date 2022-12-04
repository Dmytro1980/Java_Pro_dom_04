package competition;

public abstract class Member {
    protected int runLimit;
    protected double jumpLimit;
    protected boolean isDone = true;
    protected boolean igGoingOn = true;

    boolean run(int distance) {
        if (distance <= runLimit) {
            return isDone = true;
        } else {
            return isDone = false;
        }
    }

    boolean jump(double height) {
        if (height <= jumpLimit) {
            return isDone = true;
        }
        else {
            return isDone = false;
        }
    }
}
