package ch07;

public class Item {

    private final ItemType2 _itemtype;
    private final String _title;
    private final int _price;

    public Item(ItemType2 itemtype2, String title, int price) {
        this._itemtype = itemtype2;
        this._title = title;
        this._price = price;
    }

    public ItemType2 getItemtype() {
        return _itemtype;
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    @Override
    public String toString() {
        return "Item{" +
            "_itemtype=" + _itemtype.getTypecode() +
            ", _title='" + getTitle() + '\'' +
            ", _price=" + getPrice() +
            '}';
    }
}
