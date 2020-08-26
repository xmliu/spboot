package com.xmliu.spboot.service.impl;

import com.xmliu.spboot.bean.Bus;
import com.xmliu.spboot.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Bus> queryAll() {
        String sql = "select * from bus ORDER BY RAND() LIMIT 1";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
        Iterator iterator = mapList.iterator();
        List<Bus> busList = new ArrayList<>();
        if(mapList.size() > 0){
            while (iterator.hasNext()){
                Bus bus = new Bus();
                Map<String,Object> map = (Map<String, Object>) iterator.next();
                bus.setId((Integer) map.get("id"));
                bus.setName((String) map.get("name"));
                bus.setStart((String) map.get("start"));
                bus.setEnd((String) map.get("end"));
                busList.add(bus);
            }
        }
        return busList;
    }
}
