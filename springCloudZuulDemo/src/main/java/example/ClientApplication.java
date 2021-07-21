package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @classname: ClientApplication
 * @description:
 * @author: dhm
 * @create: 2021/07/15 13:38
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
