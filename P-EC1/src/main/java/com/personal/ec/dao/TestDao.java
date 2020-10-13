package com.personal.ec.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 *
 *
 * @author lyh
 * @date 2020/9/10 21:01
 */
@Repository
public interface TestDao {

    int addItem(Map<String, Object> item);
}
