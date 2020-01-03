import java.sql.SQLOutput;
import java.util.Arrays;

public class FindMaximum<E extends Comparable> {
    E[] array;

    public FindMaximum(E... value) {
        this.array = value;
    }

    public <E extends Comparable> E checkMaximum(E... parameter) {
        E values[]=parameter;
        int arraylength = values.length;
        Arrays.sort(values);
        E maximumValue=values[arraylength-1];
        printMax(maximumValue);
        return maximumValue;
    }

    private <E extends Comparable> void printMax(E maximumValue) {
        System.out.println("Maximum Value Is  "+maximumValue);
    }

    public Object checkMaximumValue() {
        E e = checkMaximum(array);
        return e;
    }

}




