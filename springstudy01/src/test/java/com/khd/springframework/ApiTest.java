package com.khd.springframework;


import com.khd.springframework.bean.UserService;
import org.junit.Test;

/**
 * @Author kehd
 * @Date 2022-1-13 10:55
 * @Version 1.0
 * @Description
 */
public class ApiTest
{
    @Test
    public void test_BeanFactory() {
        //1.初始化factory
        BeanFactory beanFactory = new BeanFactory();

        //2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
