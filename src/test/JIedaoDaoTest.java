package test;

import dao.JiedaoDao;
import entity.JiedaoEntity;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dingyunxiang on 16/4/16.
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:../web/WEB-INF/applicationContext.xml")
//@Transactional
public class JIedaoDaoTest {

//    @Autowired
//    JiedaoDao dao;

//    @Resource(name = "jiedaoDao")
//    JiedaoDao jiedaoDao;


    public void test(){
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        JiedaoDao service  = (JiedaoDao) factory.getBean("jiedaoDao");

        System.out.println(service);



    }

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        JiedaoDao service  = (JiedaoDao) factory.getBean("jiedaoDao");
        List<JiedaoEntity> a = service.getAll(JiedaoEntity.class);
        for(JiedaoEntity b:a){
            System.out.println(b.getStreet());
        }
    }

}
