package aug18;

public class Container<T,U> {

    T item1;
    U item2;

    public Container(T item1, U item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Container{" +
                "item1='" + item1 + '\'' +
                ", item2='" + item2 + '\'' +
                '}';
    }
}
