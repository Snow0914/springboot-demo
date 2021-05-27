package com.pingan.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTask
//@EnableCaching
@EnableTransactionManagement
@SpringBootApplication
public class SpringbootDemoApplication /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner() {
        return new HelloWorldCommandLineRunner();
    }

    public static class HelloWorldCommandLineRunner implements CommandLineRunner {
        public void run(String... strings) throws Exception {
            System.out.println("Hello World!");
        }
    }*/

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(SpringbootDemoApplication.class);
    }*/
//    @Bean()
//    public DataSource dataSource() {
//        return new DriverManagerDataSource();
//    }
}
