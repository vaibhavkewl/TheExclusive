package in.jsr.exclusive.web.controller;

import in.jsr.exclusive.persistence.domain.User;
import in.jsr.exclusive.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/")
    public String index() {
        System.out.println("------------> userRepository : " + userRepository);

        User user = new User();
        user.setUserName("vaibhav");
        user.setPassword("vaibhav");

        userRepository.save(user);
        return "Greetings from The Exclusive! " + userRepository;
    }

}
