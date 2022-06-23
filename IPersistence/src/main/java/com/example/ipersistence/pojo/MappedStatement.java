package com.example.ipersistence.pojo;

public class MappedStatement {
    //id
    private Integer id;
    //sql语句
    private String sql;
    //输⼊参数
    private Class<?> paramterType;
    //输出参数
    private Class<?> resultType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}