package lesson_1.lesson6.Animal;

public class Animal implements AnimalInterface {
    private double animalDistanceRun, animalDistanceJump, animalDistanceSwim;

    public Animal(double animalDistanceRun, double animalDistanceJump, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceJump = animalDistanceJump;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean run(double value) {
        return animalDistanceRun > value;
    }

    @Override
    public boolean jump(double value) {
        return animalDistanceJump > value;
    }

    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    public double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    public double getAnimalDistanceJump() {
        return animalDistanceJump;
    }

    public double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}






