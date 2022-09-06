package com.api.apicrudoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImplementation employeeServiceImplementation;

    @PostMapping("/save")
    public EmployeeDetails saveEmployee(@RequestBody EmployeeDetails employeeDetails){
        return employeeServiceImplementation.addEmployee(employeeDetails);
    }
    @GetMapping("/GetData")
    public List<EmployeeDetails> addEmployee(){
        return employeeServiceImplementation.getData();
    }
    @GetMapping("/GetDataById/{id}")
    public EmployeeDetails getById(@PathVariable("id") long employeeId) {
        return employeeServiceImplementation.getById(employeeId);
    }
    @PutMapping("/updateByID/{id}")
    public EmployeeDetails updateById(@PathVariable("id") long employeeId, @RequestBody EmployeeDetails employeeDetails){
        return employeeServiceImplementation.updateIyId(employeeId,employeeDetails);
    }
    @DeleteMapping("/deleteByID/{id}")
    public String deleteById(@PathVariable("id") long employeeId){
        return employeeServiceImplementation.deleteById(employeeId);
    }



}
