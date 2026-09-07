interface Drawable {
    int MAX_SIZE = 1000;

    void draw();

    void resize(int factor);

    default void describe() {
        System.out.println("I am a drawable shape");
    }

    static Drawable createDefault() {
        return new Circle2();
    }
}

class Circle2 implements Drawable {

    @Override
    public void draw() {
        System.out.println("drawing a circle.....");
    }

    @Override
    public void resize(int factor) {
        System.out.println("resizing circle by " + factor);
    }
}
