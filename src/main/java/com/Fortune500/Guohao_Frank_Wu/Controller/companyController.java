package com.Fortune500.Guohao_Frank_Wu.Controller;

import com.Fortune500.Guohao_Frank_Wu.entity.company;
import com.Fortune500.Guohao_Frank_Wu.service.companyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class companyController {
    private final companyService service;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the employeeService.
    @Autowired
    public companyController(@Qualifier("companyServiceIMPL") companyService service) {
        this.service = service;
    }

    //This is a GET request that will read a list of all the employees.
    //http://localhost:8080/retrieveAllCompanies
    @GetMapping("/retrieveAllCompanies")
    public List<company> findAll() {
        return service.findAll();
    }


    //This is a POST request to add a new employee.
    //http://localhost:8080/addCompany
    @PostMapping("/addCompany")
    public company addEmployee(@RequestBody company theCompany) {
        //also just in case they pass an id in JSON .... set id to o
        //this is to force a save of new item .... instead of update
        theCompany.setOrders(0);

        //This will call the employeeDqoImpl.save method to save a new employee
        //through the employeeService interface SPRING
        service.saveOrUpdate(theCompany);
        return theCompany;
    }

    //This is a PUT request to update an existing employee.
    //http://localhost:8080/updateCompany
    @PutMapping("/updateCompany")
    public company updateEmployee(@RequestBody company updateCompany) {
        //No theEmployee.setId(0); this will execute an update instead of a create
        service.saveOrUpdate(updateCompany);
        return updateCompany;
    }

    //This is a DELETE request to delete an existing employee.
    //http://localhost:8080/deleteEmployee/1
    @DeleteMapping("/deleteCompany/{companyId}")
    public String deleteEmployee(@PathVariable int companyId) {
        //This will execute the deleteByID.
        service.deleteById(companyId);
        return "Deleted company id : " + companyId;
    }

}
