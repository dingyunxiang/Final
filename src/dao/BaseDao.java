package dao;


import util.PageInfo;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/12.
 */
public interface BaseDao<T> {


    public void save(T t);

    public void update(T t);

    public void delete(Class<T> clazz, java.io.Serializable id);

    public T getEntityById(Class<T> clazz, java.io.Serializable id);

    public List<T> getAll(Class<T> clazz);

    public List<T> getEntity(Class<T> clazz, String name, Object value);

    public Integer getCount(Class<T> clazz);

    void getAll(Class<T> clazz, PageInfo info);

    public T getEntityByLine(String tableName, String line, String name);

}
