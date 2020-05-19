package com.epam.project;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        assertThat(context, notNullValue());
    }

    @Test
    public void beanTest() {
        Clazz clazz = context.getBean("clazz", Clazz.class);
        assertThat(clazz, Matchers.instanceOf(Object.class));
    }
}