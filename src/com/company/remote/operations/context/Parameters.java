package com.company.remote.operations.context;

/**
 * Created by Никита Овсянников on 06.07.2017.
 */
public @interface Parameters {
   String URL = "http://booking.uz.gov.ua/ru/purchase/search/";
   boolean DEF_REMEMBER_ME = false;

   String CALL = "station_id_from=2218400" +
           "&station_id_till=2200001" +
           "&station_from=Ровно" +
           "&station_till=Киев" +
           "&date_dep=26.07.2017" +
           "&time_dep=00:00" +
           "&time_dep_till=" +
           "&another_ec=0" +
           "&search=";
}
