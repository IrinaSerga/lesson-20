package com.dmdev.hometask;

import java.util.Map;
import java.util.stream.Stream;

public class CSVFileDataResultBuilder {

//    оу май resultMapFromMaps(Map<String, String> priceMap, Map<String, String> nameMap) так на подумать можно было создать классы и в них положить результаты, а потом с ними работать
//    public class Result {
//        private Integer id; private String name; private Double price; }
//    public class ItemsPrice { private Integer id; private Double price; }
//    public class ItemsName {
//        private Integer id; private String name; private Double description; }
    public static Stream<String> resultMapFromMaps(Map<String, String> priceMap, Map<String, String> nameMap)  {


        return Stream.concat(priceMap.keySet().stream(), nameMap.keySet().stream())
                .distinct()
                .map(id -> id + "," + priceMap.get(id) + "," + nameMap.get(id))
//                .flatMap(id -> {
//                        if (priceMap.containsKey(id) && nameMap.containsKey(id)){
//                            String resultString =  id + "," + priceMap.get(id) + "," + nameMap.get(id);
//                            return Stream.of(resultString);
//                          } else {
//                            errorMap.put(id);
//                            return Stream.empty();
//
//                        }
//                })

                ;

    }
}
