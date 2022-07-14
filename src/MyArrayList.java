public class MyArrayList<T> implements MyList<T> {

    private Object[] array;
    private int index;

    public MyArrayList() {
        array = new Object[2];
    }

    @Override
    public boolean add(T element) {
        if (index < array.length) {
            array[index++] = element;
        }
        increaseArray();

        return add(element);
    }

    public void increaseArray() {
        Object[] newArray = new Object[index + 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }

    @Override
    public T getElement(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
