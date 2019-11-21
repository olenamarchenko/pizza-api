package com.tdl.javafoundations.pizzaapi.test;

import chairs.dao.Chair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import unittests.configuration.BeansTestConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {BeansTestConfiguration.class})
public class ChairsTest {

    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void testChairClass(){
        Chair chair = beanFactory.getBean(Chair.class, 41);

        boolean actualResult = chair.save();
        assert actualResult==true;


        // how to call methods from diff beans?
    }
}