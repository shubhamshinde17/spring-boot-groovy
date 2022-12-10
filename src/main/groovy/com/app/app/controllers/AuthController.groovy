package com.app.app.controllers

import com.app.app.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController {

    @Autowired
    private UserRepository userRepository

    @RequestMapping("/home")
    static ResponseEntity getHome(){
        Map<String, Object> response = new LinkedHashMap<String, Object>()
        response.put("code", 200)
        response.put("message", "Success")
        return new ResponseEntity(response, HttpStatus.OK)
    }
}
