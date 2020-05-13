package oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        Fox fox = new Fox();
        hare.tryEat(wolf);
        wolf.tryEat(ball);
        ball.tryEat(fox);
        fox.tryEat(hare);
    }
}
