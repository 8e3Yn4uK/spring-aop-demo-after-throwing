package com.aopdemo;

import com.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 13.03.2019
 */

public class AfterReturningDemoApp {
    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from the spring container
        AccountDAO theAccountDAODao = context.getBean("accountDAO", AccountDAO.class);

        List<Account> theAccounts = theAccountDAODao.findAccounts();

        System.out.println("\n\nMain program: AfterReturningDemoApp");
        System.out.println("--------------");
        System.out.println(theAccounts);
        System.out.println("\n");




        // close the context
        context.close();
    }
}
