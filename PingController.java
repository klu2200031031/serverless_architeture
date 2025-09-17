package org.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")   // ✅ Prefix to keep all APIs under /api
@CrossOrigin(origins = {
        "http://localhost:3000",   // React dev server
        "*"                        // Allow from anywhere (needed for API Gateway/CloudFront)
})
public class PingController {

    @GetMapping("/ping")
    public Map<String, String> ping() {
        Map<String, String> pong = new HashMap<>();
        pong.put("pong", "Hello, World!");
        return pong;
    }
}
