package com.example.runners;

import com.example.models.Employee;
import com.example.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInsertRunner implements CommandLineRunner {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("DataInsertRunner execution started.");
        employeeRepository.save(new Employee(101, "SAM", "Lead", "DEV", 86500.0));
        employeeRepository.save(new Employee(102, "RAM", "MGR", "DEV", 96000.0));
        employeeRepository.save(new Employee(103, "SYED", "ASSOCIATE", "QA", 32500.0));
        employeeRepository.save(new Employee(104, "ABD", "MGR", "BA", 55500.0));
        log.info("DataInsertRunner execution completed.");
    }
}
