import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox() {
        this.items = (T[]) new Object[4];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("коробка не полна, осталось ещё "
                        + (items.length - i) + " ячеек заполнить");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
