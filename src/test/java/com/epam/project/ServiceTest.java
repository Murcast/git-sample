package com.epam.project;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ServiceTest {

    private Service service = new Service();

    @Test
    public void methodTest() {
        String result = service.method("null");
        assertThat(result, is(equalTo("null #$%")));
    }

}