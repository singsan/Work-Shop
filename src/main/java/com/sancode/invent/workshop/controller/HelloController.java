package com.sancode.invent.workshop.controller;

import com.sancode.invent.workshop.model.Mechanic;
import com.sancode.invent.workshop.services.MechanicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@Slf4j
@RequestMapping(value = "/workShop"/*, produces = {MediaType.APPLICATION_XML_VALUE}*/)
public class HelloController {
    @Autowired
    MechanicService mechanicService;

    @GetMapping("/mechanicDetail/{id}")
    public ResponseEntity<Mechanic> getMechanicV1(@PathParam("version1") String pathParam, @PathVariable String id) {
        log.info("V1 => "+id+" Path Param => "+pathParam);
        return  ResponseEntity.ok().header("PATH-VARIABLE",id).body(mechanicService.getMechanicDetails());
    }
}
