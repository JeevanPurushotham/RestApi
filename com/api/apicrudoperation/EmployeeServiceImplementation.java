package com.api.apicrudoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDetails addEmployee(EmployeeDetails employeeDetails) {
        return employeeRepository.save(employeeDetails);
    }

    @Override
    public List<EmployeeDetails> getData() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeDetails getById(long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public EmployeeDetails updateIyId(long employeeId, EmployeeDetails employeeDetails ) {
        EmployeeDetails updateemployeeDetails=employeeRepository.findById(employeeId).get();
        if(Objects.nonNull(employeeDetails.getEmployeeName()))
        {
            updateemployeeDetails.setEmployeeName(employeeDetails.getEmployeeName());
        }
        if(Objects.nonNull(employeeDetails.getCourse())){
            updateemployeeDetails.setCourse(employeeDetails.getCourse());
        }
        employeeRepository.save(updateemployeeDetails);
        return employeeDetails;
    }

    @Override
    public String deleteById(long employeeId) {
         employeeRepository.deleteById(employeeId);
         return "Deleted Successfully";
    }


}
