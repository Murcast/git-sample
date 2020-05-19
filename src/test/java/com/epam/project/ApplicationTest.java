package com.epam.project;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Autowired
    private ConfigurableApplicationContext context;

    @Test
    public void test() {
//        assertThat(context, notNullValue());
    }

}