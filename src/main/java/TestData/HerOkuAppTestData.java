package TestData;

import java.util.HashMap;
import java.util.Map;

public class HerOkuAppTestData {
   Map<String,String>bookingDatesMap = new HashMap<>();
   Map<String,Object> bookingDetailsMap = new HashMap<>();

   public  Map<String,Object> setUpData(){
       bookingDatesMap.put("checkin","2020-02-27");
       bookingDatesMap.put("checkout","2020-12-16");

       bookingDetailsMap.put("firstname","Eric");
       bookingDetailsMap.put("lastname","Ericsson");
       bookingDetailsMap.put("totalprice",612);
       bookingDetailsMap.put("depositpaid",true);
       bookingDetailsMap.put("bookingDates",bookingDatesMap);
       return  bookingDetailsMap;

   }

}
