public class FindMaximum<E extends Comparable> {
    E first;
    E second;
    E third;

    public FindMaximum() {

    }

    public FindMaximum(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public <E extends Comparable> E checkMaximum(E first, E second, E third) {
        E max=first;
        if (second.compareTo(max) > 0)
            max =second;
        if (third.compareTo(max) > 0)
            max =third;
        System.out.println(max);
        return max;
    }

    public Object checkMaximumValue() {
        E e = checkMaximum(first, second, third);
        return e;
    }

}




