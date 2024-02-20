package com.example.apiinterface;

import com.example.apiclientsdk.client.ApiClient;
import com.example.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private ApiClient apiClient;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("panjiasheng");
        String result = apiClient.getUsername(user);
        System.out.println(result);
    }
}
