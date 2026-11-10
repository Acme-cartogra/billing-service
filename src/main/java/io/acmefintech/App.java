package io.acmefintech;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) { SpringApplication.run(App.class, args); }

    @GetMapping("/billings")
    public Map<String, String> route0() { return Map.of("status", "ok"); }

    @PostMapping("/billings")
    public Map<String, String> route1() { return Map.of("status", "ok"); }

    @GetMapping("/billings/{id}")
    public Map<String, String> route2() { return Map.of("status", "ok"); }
}
