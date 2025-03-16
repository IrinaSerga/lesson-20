package com.dmdev.hometask;

import java.util.Map;
import java.util.stream.Stream;

public class CSVFileDataResultBuilder {


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
