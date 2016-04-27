package daoImpl;

import dao.BaseDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import util.PageInfo;

import java.io.Serializable;
import java.util.List;

@Transactional
@Component
public class BaseDaoImpl<T>  implements BaseDao<T> {

        @Autowired
        SessionFactory factory;

        public Session getSession(){
           Session session = factory.getCurrentSession();
            return session;
        }

        @Override
        public void save(T t) {
            this.getSession().save(t);
        }

        @Override
        public void update(T t) {
            this.getSession().update(t);
        }

        @Override
        public void delete(Class<T> clazz, Serializable id) {
            this.getSession().delete(this.getEntityById(clazz, id));
        }

        @SuppressWarnings("unchecked")
        @Override
        public T getEntityById(Class<T> clazz, Serializable id) {
            return (T) this.getSession().get(clazz, id);
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<T> getAll(Class<T> clazz) {
            return this.getSession().createCriteria(clazz).list();
        }

        @Override
        public List<T> getEntity(Class<T> clazz, String name, Object value) {
            Criteria c =  this.getSession().createCriteria(clazz);
            c.add(Restrictions.eq(name, value));
            return c.list();
        }


        @Override
        public void getAll(Class<T> clazz, PageInfo info) {
            info.setRecordCount(this.getCount(clazz));
            info.setPageCount( info.getRecordCount()%info.getPageSize()==0 ? info.getRecordCount()/info.getPageSize() : info.getRecordCount()/info.getPageSize()+1 );

            Criteria c =  this.getSession().createCriteria(clazz);
            c.setMaxResults(info.getPageSize());
            c.setFirstResult((info.getCurrentPage()-1)*info.getPageSize());
            info.setList(c.list());

        }

        @Override
        public Integer getCount(Class<T> clazz) {
            Query query = this.getSession().createQuery("select count(d) from "+clazz.getSimpleName()+" d");
            return ((Long)query.uniqueResult()).intValue();
        }


    @Override
    public T getEntityByLine(String tableName, String line, String name) {
        Query query = this.getSession().createQuery("from "+tableName+" where "+line+" = '"+name+"'");
       List list = query.list();
        if(list.size()>0){
            return (T)list.get(0);
        }else{
            return null;
        }
    }
}
