package genericBox;

public class Box <T> {
    private T box;

    public Box(T box) {
        this.setBox(box);
    }

    private T getBox() {
        return box;
    }

    private void setBox(T box) {
        this.box = box;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(box.getClass().getName()).append(String.format(": %s",box));
        return sb.toString();
    }
}
