import java.sql.SQLOutput;
import java.util.Arrays;

public class FindMaximum<E extends Comparable> {
    E[] array;

    public FindMaximum() {
    }

    public FindMaximum(E... value) {
        this.array = value;
    }

    public <E extends Comparable> E checkMaximum(E... parameter) {
        E values[]=parameter;
        int arraylength = values.length;
        Arrays.sort(values);
        System.out.println(values[arraylength-1]);
        return values[arraylength-1];
    }

    public Object checkMaximumValue() {
        E e = checkMaximum(array);
        return e;
    }

}




