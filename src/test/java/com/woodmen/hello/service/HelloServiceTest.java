package com.woodmen.hello.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {

    @Autowired
    HelloService helloService;

//    @Test
//    public void testHelloWorld() throws Exception {
//        assertThat(helloService.helloWorld().getMessage()).isEqualTo("Hello World!");
//    }
}
