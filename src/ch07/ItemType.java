package ch07;

public class ItemType {

    private final int _typecode;

    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    public ItemType(int typecode) {
        this._typecode = typecode;
    }
}
