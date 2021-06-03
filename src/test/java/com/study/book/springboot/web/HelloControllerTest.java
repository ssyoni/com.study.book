package com.study.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello_return() throws Exception{
        String hello ="hello";

        mvc.perform(get("/hello")) // "hello" 주소로 HTTP GET 요청
                .andExpect(status().isOk()) // HTTP header 의 Status를 검증
                .andExpect(content().string(hello)); // Controller 에서 "hello"를 리턴 했는지
    }

    @Test
    public void helloDto_return() throws Exception{
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                    .param("name",name)
                    .param("amount", String.valueOf(amount))
        ).andExpect(status().isOk())
         .andExpect(jsonPath("$.name",is(name)))
         .andExpect(jsonPath("$.amount", is(amount)));

    }
}
