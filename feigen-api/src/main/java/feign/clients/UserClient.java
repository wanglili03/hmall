package feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import feign.pojo.User;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id);
}
