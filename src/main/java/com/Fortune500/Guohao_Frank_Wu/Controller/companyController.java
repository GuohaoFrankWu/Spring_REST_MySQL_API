package com.Fortune500.Guohao_Frank_Wu.Controller;

import com.Fortune500.Guohao_Frank_Wu.entity.company;
import com.Fortune500.Guohao_Frank_Wu.service.companyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class companyController {
    private final companyService service;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the employeeService.
    @Autowired
    public companyController(companyService service) {
        this.service = service;
    }


}
