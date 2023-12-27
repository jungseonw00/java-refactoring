package ch07;

public enum ItemType2 {
    BOOK(0),
    DVD(1),
    SOFTWARE(2);

    private final int _typecode;

    ItemType2(int typecode) {
        _typecode = typecode;
    }

    public int getTypecode() {
        return _typecode;
    }
}
