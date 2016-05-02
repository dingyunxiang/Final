package test;

import dao.JiedaoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CyryService;

/**
 * Created by dingyunxiang on 16/4/16.
 */

//@RunWith(SpringJUnit4ClassRunner.class)
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
        CyryService service  = (CyryService) factory.getBean("cyryService");
        String arr[] = {"name","sex","id"};
        System.out.println(service.listToExcelByDiy(arr));
    }




}
