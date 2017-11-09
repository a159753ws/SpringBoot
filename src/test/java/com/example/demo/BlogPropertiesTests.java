package com.example.demo;

import com.example.demo.service.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogProperties.class)
public class BlogPropertiesTests {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test1() {
        Assert.assertEquals(blogProperties.getName(), "Sheng");
        Assert.assertEquals(blogProperties.getTitle(), "Sheng Blog");
    }

}