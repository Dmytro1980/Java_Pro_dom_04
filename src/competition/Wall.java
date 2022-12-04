package competition;

public class Wall extends Obstacle {


    public Wall(double height) {
        this.height = height;
    }

        public void overcome(Member member) {
        String obstacleName = Wall.class.getSimpleName();
        String memberName = member.getClass().getSimpleName();
        if (member.jump(height) & member.igGoingOn) {
            System.out.println(memberName +
                    " прыгнул через " + obstacleName + " " + height + " м.");
        }

        if (!member.jump(height) & member.igGoingOn) {
            System.out.print(memberName + " не прыгнул через " + obstacleName + " " + height +
                    " м, взята высота: " + member.jumpLimit + " м. ");
            member.igGoingOn = false;
            System.out.println(memberName + " выбыл.");
        }
    }
}
