package com.heqing.entity.orm;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 数据库 表实体类
 *
 * @author heqing
 * @email 975656343@qq.com
 * @date 2018/01/03
 */
public class Table implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dbName 数据库名
     */
    @JSONField(name="db_name")
    private String dbName;

    /**
     * name 表名
     */
    @JSONField(name="table_name")
    private String tableName;

    /**
     * type 表类型
     */
    @JSONField(name="type")
    private String type;

    /**
     * engine 数据库引擎
     */
    @JSONField(name="engine")
    private String engine;

    /**
     * rowFormat 行格式
     */
    @JSONField(name="row_format")
    private String rowFormat;

    /**
     * rowsNum 行数
     */
    @JSONField(name="rows_num")
    private Integer rowsNum;

    /**
     * createTime 创建时间
     */
    @JSONField(name="create_time", format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * updateTime 修改时间
     */
    @JSONField(name="update_time", format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * collation 编码
     */
    @JSONField(name="collation")
    private String collation;

    /**
     * comment 注解
     */
    @JSONField(name="comment")
    private String comment;

    /**
     * autoIncrement 自动递增
     */
    @JSONField(name="auto_increment")
    private Integer autoIncrement;

    /**
     * indexLength 索引长度
     */
    @JSONField(name="index_length")
    private Double indexLength;

    /**
     * dateLength 数据长度
     */
    @JSONField(name="date_length")
    private Double dateLength;

    /**
     * maxDateLength 最大数据长度
     */
    @JSONField(name="max_date_length")
    private Double maxDateLength;

    /**
     * columns 列信息列表
     */
    @JSONField(name="column_list")
    private List<Column> columnList;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    public Integer getRowsNum() {
        return rowsNum;
    }

    public void setRowsNum(Integer rowsNum) {
        this.rowsNum = rowsNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Integer autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public Double getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(Double indexLength) {
        this.indexLength = indexLength;
    }

    public Double getDateLength() {
        return dateLength;
    }

    public void setDateLength(Double dateLength) {
        this.dateLength = dateLength;
    }

    public Double getMaxDateLength() {
        return maxDateLength;
    }

    public void setMaxDateLength(Double maxDateLength) {
        this.maxDateLength = maxDateLength;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
