package calismalar;

public class MyGeneric {
}

final class Unit<T> {
    private final T mValue;

    public Unit(T value) { //constructor
        this.mValue = value;
    }

    public T getmValue() { //getter
        return mValue;
    }


    public static <T> Unit<T> of(T value){
        return new Unit<T>(value);
    }
// Github'dan değişiklik yaptım.
    //Intellij'den değişiklik yaptım. Github'da bakacağım.

}
