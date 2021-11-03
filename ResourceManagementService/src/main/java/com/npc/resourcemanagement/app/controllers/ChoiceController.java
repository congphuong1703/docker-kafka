package com.cmcglobal.resourcemanagement.app.controllers;

import com.cmcglobal.resourcemanagement.domain.services.ChoiceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Choice API")
@RestController
@RequestMapping(value = "${prefix-api}/choice")
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(choiceService.findAll());
    }

    @PostMapping
    public void sendMessage(@RequestParam("msg") String msg) {
        choiceService.publishToTopic(msg);
    }

    @GetMapping(value = "/redis")
    public void testRedis() {
        choiceService.testRedis();
    }
}
