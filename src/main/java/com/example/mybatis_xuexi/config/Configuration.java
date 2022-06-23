package com.example.mybatis_xuexi.config;

import com.example.mybatis_xuexi.config.entity.MappedStatement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class Configuration {
    //数据源
    private DataSource dataSource;
    //map集合： key:statementId value:MappedStatement
    private Map<String, MappedStatement> mappedStatementMap = new HashMap<String, MappedStatement>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MappedStatement> getMappedStatementMap() {
        return mappedStatementMap;
    }

    public void setMappedStatementMap(Map<String, MappedStatement> mappedStatementMap) {
        this.mappedStatementMap = mappedStatementMap;
    }
}