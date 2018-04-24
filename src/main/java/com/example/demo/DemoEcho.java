package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;

@Component
public class DemoEcho implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, World!");
        String[] result = StringUtils.split("hoge,piyo,foo,bar", ",");
        System.out.println(Arrays.toString(result));
    }
}
