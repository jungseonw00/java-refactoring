package ch07;

public enum LunchSetEnum {

    LUNCH_TYPE_A(0),

    LUNCH_TYPE_B(1),
    LUNCH_TYPE_C(2),
    LUNCH_TYPE_COFFEE(0),
    LUNCH_TYPE_JUICE(1),
    LUNCH_TYPE_TEA(2);

    private final int _typecode;

    LunchSetEnum(int typecode) {
        _typecode = typecode;
    }

    public int getTypecode() {
        return _typecode;
    }
}
