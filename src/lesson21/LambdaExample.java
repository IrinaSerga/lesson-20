package lesson21;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;
        //(o1,  o2) ->  Integer.compare(o1, o2);

        System.out.println(comparator.compare(25, 100));

    }

//    private static class IntegerComparator implements Comparator<Integer> {
//        @Override
//        //[модификаторы] возвр тип название [параметры]
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }

        // (Integer o1, Integer o2) ->{ --єто лямбда выражение
        //            return Integer.compare(o1, o2);
//    }
}
