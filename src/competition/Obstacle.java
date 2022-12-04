package competition;

public abstract class Obstacle {

    int length = 0;
    double height = 0.0;

    public static void competition(Member[] member, Obstacle[] obstacle) {
        String obstacleName;
        String memberName;
        for (Obstacle o : obstacle) {
            obstacleName = o.getClass().getSimpleName();
            for (Member m : member) {
                memberName = m.getClass().getSimpleName();

                if (m.run(o.length) & o.height == 0 & m.igGoingOn) {
                    System.out.println(memberName +
                            " пробежал " + o.length + " м на " + obstacleName + ".");
                }
                if (!m.run(o.length) & m.igGoingOn) {
                    System.out.print(memberName +
                            " не пробежал " + o.length + " м на " + obstacleName + ", пройдено: " +
                            m.runLimit + " м. ");
                    m.igGoingOn = false;
                    System.out.println(memberName + " выбыл.");
                }

                if (m.jump(o.height) & o.length == 0 & m.igGoingOn) {
                    System.out.println(memberName +
                            " прыгнул через " + obstacleName + " " + o.height + " м.");
                }

                if (!m.jump(o.height) & m.igGoingOn) {
                    System.out.print(memberName + " не прыгнул через " + obstacleName + " " + o.height +
                            " м, взята высота: " + m.jumpLimit + " м. ");
                    m.igGoingOn = false;
                    System.out.println(memberName + " выбыл.");
                }
            }
        }
    }
}