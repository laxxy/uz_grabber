package net.uz.core.context;

/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public @interface Parameters {
   String URL = "http://booking.uz.gov.ua/ru/purchase/search/";
   boolean DEF_REMEMBER_ME = false;

   String CALL = "station_id_from=2218400" +
           "&station_id_till=2200001" +
           "&station_from=%D0%A0%D0%BE%D0%B2%D0%BD%D0%BE" +
           "&station_till=%D0%9A%D0%B8%D0%B5%D0%B2" +
           "&date_dep=26.07.2017" +
           "&time_dep=00%3A00" +
           "&time_dep_till=" +
           "&another_ec=0" +
           "&search=";
}
