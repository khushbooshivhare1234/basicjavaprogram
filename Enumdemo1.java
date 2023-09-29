package Enum;

public class Enumdemo1 {

enum Season{
    WINTER(5), SPRING(10), SUMMER(15), FALL(20);

    private final int value;/*Changing the index number (ordinal value) of an enum constant at runtime is not supported
                            and not recommended because it would break the intended semantics of enum types,
                            which are meant to represent a fixed set of constants with consistent ordinal values.
                            If you need to associate custom values with enum constants, you can define instance variables within
                             the enum and initialize them in the enum's constructor.*/
    private Season(int value){
        this.value=value;
    }
}
    public static void main(String args[]){
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value);
        }
        System.out.println(Season.valueOf("WINTER").ordinal());

    }
}
