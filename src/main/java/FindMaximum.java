public class FindMaximum {

        public Integer checkMax(Integer a,Integer b,Integer c){
                Integer max = a;
                if (b.compareTo(max) > 0)
                    max = b;
                if (c.compareTo(max) > 0)
                    max = c;
            System.out.println(max);
                return max;

            }


    public Float checkMaxFloat(Float a, Float b,Float c) {
        float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println(max);
        return max;

    }


    public String checkMaxString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println(max);
        return max;


    }
}



