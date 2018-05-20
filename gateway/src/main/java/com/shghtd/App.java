package com.shghtd;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringCloudApplication
@EnableZuulProxy
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

}
