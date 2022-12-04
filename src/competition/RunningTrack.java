package competition;

public class RunningTrack extends Obstacle {

    public RunningTrack(int length) {
        super.length = length;
    }

    public void overcome(Member member) {

        String obstacleName = RunningTrack.class.getSimpleName();
        String memberName = member.getClass().getSimpleName();
        if (member.run(length)  & member.igGoingOn) {
            System.out.println(memberName +
                    " пробежал " + length + " м на " + obstacleName + ".");
        }

        if (!member.run(length) & member.igGoingOn) {
            System.out.print(memberName +
                    " не пробежал " + length + " м на " + obstacleName + ", пройдено: " +
                    member.runLimit + " м. ");
            member.igGoingOn = false;
            System.out.println(memberName + " выбыл.");
        }
    }
}
