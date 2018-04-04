package com.coder.iocaop;

import com.coder.iocaop.controller.UserController;
import com.coder.iocaop.entity.User;
import com.coder.iocaop.entity.UserFather;
import com.coder.iocaop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 所需jar：
 * commons-logging
 * spring-bean
 * spring-context
 * spring-core
 * spring-expression
 */
public class Main {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("../resources/application-context.xml");//这个运行会报错，但是路径也对。原因new的类是基于类路径的
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/coder/iocaop/resource/application-context.xml");
//        User user = applicationContext.getBean(User.class);
//        System.out.println(user.getId());
//        System.out.println(user.getName());
//        UserFather userFather = applicationContext.getBean(UserFather.class);
//        System.out.println(userFather.getFatherName());
//        System.out.println(userFather.getFatherUser().toString());

        /**
         * 注解：
         * @Service业务层
         * @Controller控制层
         * @Component标识一个组件
         * @Autowired自动注入
         * AOP aspect oriented programming面向切面编程
         */
        UserController userController = applicationContext.getBean(UserController.class);
        UserService userService = userController.getUserService();
        userService.say("123");
    }


}
