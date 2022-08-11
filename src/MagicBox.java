public class MagicBox<T> {

    private T number;

    public MagicBox(T number) {
        this.number = number;
    }

    public T getNuber() {
        return number;
    }

    boolean add(T item) {
        return true;
    }

    T pick() {
        return null;
    }
}
