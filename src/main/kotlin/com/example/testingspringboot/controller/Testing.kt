package com.example.testingspringboot.controller

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Testing {
    @GetMapping("testing")
    fun hello() : ResponseEntity<String>{
        return ResponseEntity("Hello", HttpStatus.OK)
    }
}