import java.util.Random;

public class MagicBox<T> {

    protected T[] items;
    Random random = new Random();

    public MagicBox() {
        this.items = (T[]) new Object[4];
    }

    boolean add(T item) {
        for (int i = 0; i < getItems().length; i++) {
            if (getItems()[i] == null) {
                getItems()[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() {
        for (int i = 0; i < getItems().length; i++) {
            if (getItems()[i] == null) {
                throw new RuntimeException("коробка не полна, осталось ещё "
                        + (getItems().length - i) + " ячеек заполнить");
            }
        }
        int randomInt = random.nextInt(getItems().length);
        return getItems()[randomInt];
    }

    public T[] getItems() {
        return items;
    }
}
