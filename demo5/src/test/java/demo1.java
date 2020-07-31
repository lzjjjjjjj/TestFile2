import demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class demo1 {
    @Autowired
    private UserService userService;
    @Test
    public void list(){
       /* List<User> list=userService.list();
        for (User user:list) {
            System.out.printf("策划组的组长有"+user);
        }*/
        System.out.printf("行不行的");
    }
}
