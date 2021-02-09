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
        return new Unit<>(value);
    }
// Github'dan değişiklik yaptım.
    //Intellij'den değişiklik yaptım. Github'da bakacağım.
    //MyBranch üzerinden değişiklik yaptım.

    //MyBranch içerisinde yaptığım değişiklik.
    //MyBranch_02 içerisinde yaptığım değişiklik
    //Git mesaj denemesi
//asdad

}
