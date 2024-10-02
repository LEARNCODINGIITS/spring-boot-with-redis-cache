package com.iits.service;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.iits.entity.User;
@Service
public class UserService {
	@Cacheable(value = "users", key = "#userId")
    public User getUserById(String userId) {
        simulateSlowService();  // Simulate slow data fetch
        return new User(userId, "John Doe", "john.doe@example.com");
    }

    // Simulate a slow service with sleep
    private void simulateSlowService() {
        try {
            Thread.sleep(3000);  // Simulate delay
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
