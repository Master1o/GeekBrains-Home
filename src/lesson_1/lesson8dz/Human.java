package lesson_1.lesson8dz;

public class Human implements JumpableRunnable {
    int maxHeight;
    int maxLength;
    String name;

    public Human() {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    public Human(int i, int i1, String maria) {

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Human run");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Human jump");
    }

    @Override
    public String toString() {
        return "Человек по имени " + name;
    }
}
