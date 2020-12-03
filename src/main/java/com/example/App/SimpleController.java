package com.example.App;


import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SimpleController {

    DBUser db = new DBUser();

    @RequestMapping("/")
    public String hello() {
        return "Greeting From Spring Boot!!";
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "Hello World from the server";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return db.getUserTable();
    }

    @GetMapping("/user/{id}")
    public User getAUser(@PathVariable int id) {
        return db.getAUser(id);
    }

    @DeleteMapping("/users/{id}")
    public Boolean deleteAUser(@PathVariable int id) {
        return db.deleteAUser(id);
    }

    @PostMapping("/add")
    public User addAUser(@RequestBody User user) {
            return db.addAUser(user);
    }

}
