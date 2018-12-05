package com.springboot.eo.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * @author ChenJunXian
 * @create 2018-12-05 17:05
 **/
public class SessionFilter implements Filter{

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }

    @Bean
    public OpenEntityManagerInViewFilter openEntityManagerInViewFilter() {
        System.out.println(11);
        return new OpenEntityManagerInViewFilter();
    }
}
