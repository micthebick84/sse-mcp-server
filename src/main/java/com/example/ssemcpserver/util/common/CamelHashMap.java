package com.example.ssemcpserver.util.common;

import org.springframework.jdbc.support.JdbcUtils;

import java.util.HashMap;

public class CamelHashMap extends HashMap {
    
    @SuppressWarnings("unchecked")
    @Override
    public Object put(Object key, Object value) {
        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName((String) key), value);
    }

}
