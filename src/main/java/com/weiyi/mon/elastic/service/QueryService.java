package com.weiyi.mon.elastic.service;



import java.util.List;
import java.util.Map;

import com.weiyi.mon.elastic.model.Es;


public interface QueryService {

    List<Map<String, Object>> queryListFromES(Es es, int storeId, String storeName, String startDate, String endDate);

}
