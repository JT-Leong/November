package com.jt.list;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static void main(String[] args) {
        User user1 = new User("cxk", "123456");
        User user2 = new User("cwt", "784363");

        List<User> list = new ArrayList();
        list.add(user1);
        list.add(user2);

     //   System.out.println(list.get(0).getName() + " " +list.get(0).getPassword());
        System.out.println(list.get(0).toString());
    }
}