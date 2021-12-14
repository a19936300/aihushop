package com.binbinxiu.aihushop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author binbin
 * @date 2021/12/14 9:47
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello SpringFox!");
    }

    @GetMapping("/double")
    public ResponseEntity<String> testDouble(@RequestParam(value = "test", defaultValue = "10") Double count) {
        return ResponseEntity.ok("Value " + count);
    }
}
