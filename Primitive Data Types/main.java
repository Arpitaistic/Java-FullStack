
public class main {
    public static void main (String [] args){
    int byteValue = 10; // 1 byte
    short shortValue = (short) byteValue; //Widening conversion from byte to short
    int intValue = shortValue; //Widening conversion from short to int
    long longValue = intValue; //Widening conversion from int to long
    float floatValue = longValue; //Widening conversion from long to float
    double doubleValue = floatValue; //Widening conversion from float to double

    System.out.println("int: "  + intValue);
    System.out.println("long: " + longValue);
    System.out.println("float: " + floatValue);
    System.out.println("double: " + doubleValue);
    System.out.println(Long.toBinaryString (Long.MAX_VALUE));
    }
}
