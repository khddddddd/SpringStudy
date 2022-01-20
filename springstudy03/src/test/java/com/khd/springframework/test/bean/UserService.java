package com.khd.springframework.test.bean;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack)
 */
public class UserService {

    private String name;

    private String nickName;

    public UserService() {
    }
    
    public UserService(String name) {
        this.name = name;
    }

    public UserService(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }


    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
