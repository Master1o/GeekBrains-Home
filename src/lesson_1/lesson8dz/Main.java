package lesson_1.lesson8dz;


public class Main {

    public static void main(String[] args) {
        JumpableRunnable[] jumpableRunnables = new JumpableRunnable[3];
        jumpableRunnables[0] = (JumpableRunnable) new Human();
        jumpableRunnables[1] = (JumpableRunnable) new Cat();
        jumpableRunnables[2] = (JumpableRunnable) new Robot();

        for (JumpableRunnable jumpableRunnable : jumpableRunnables) {
            jumpableRunnable.jump();
        }
        for (JumpableRunnable jumpableRunnable : jumpableRunnables) {
            jumpableRunnable.run();
        }



        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpableRunnable member : jumpableRunnables) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}

