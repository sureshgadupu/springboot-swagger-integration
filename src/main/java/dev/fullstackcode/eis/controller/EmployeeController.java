package dev.fullstackcode.eis.controller;


import dev.fullstackcode.eis.entity.Department;
import dev.fullstackcode.eis.entity.Employee;
import dev.fullstackcode.eis.entity.Gender;
import dev.fullstackcode.eis.service.EmployeeService;
import dev.fullstackcode.eis.validation.OnCreate;
import dev.fullstackcode.eis.validation.OnUpdate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.groups.Default;
import javax.websocket.server.PathParam;
import java.util.List;


@Api(tags = "Manages operations on Employee ")
@RestController
@RequestMapping("/employee")
@Validated
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @ApiOperation(value = "getEmployees",notes = "Get list of all employees")
    @GetMapping()
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }


    @ApiOperation(value = "getEmployee",notes = "Get employee base on id")
    @GetMapping("/{id}")
    public Employee getEmployee( @ApiParam(value = "Id of employee",required = true) @PathVariable @Min(1) Integer id) {
        return employeeService.getEmployeeById(id).orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND,"Employee not found with id : "+ id));
    }

//    @ResponseStatus(HttpStatus.CREATED) // send HTTP 201 instead of 200 as new object created
//    @PostMapping
//    @Validated(CreateValidations.class)
//    public Employee createEmployee(@RequestBody @Valid Employee employee) {
//        return employeeService.createEmployee(employee);
//    }

    @ApiOperation(value = "createEmployee",notes = "Get employee base on id")
    @ResponseStatus(HttpStatus.CREATED) // send HTTP 201 instead of 200 as new object created
    @PostMapping
    @Validated(OnCreate.class)
    public Employee createEmployee(@ApiParam(value = "Employee details",required = true) @RequestBody @Valid Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @ApiOperation(value = "updateEmployee details",notes = "Update employee details")
    @PutMapping()
    public Employee updateEmployee(@ApiParam(value = "Employee details",required = true) @RequestBody  @Validated({OnUpdate.class, Default.class}) Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value="/{id}")
    public  void deleteEmployee(@ApiParam(value = "Id of employee",required = true) @PathVariable("id") @Min(1) Integer id){
        employeeService.deleteEmployee(id);
    }

    @PatchMapping("/{id}/dept/{deptId}")
    public Employee updateEmpDepartment(@PathVariable("id") @Min(1) Integer emp_id , @PathVariable("deptId") @Min(1) Integer dept_id, @PathParam("id") @Min(1) String id) {
       return employeeService.updateEmpDepartment(emp_id,dept_id);
    }

    @ApiOperation(value = "updateEmpDepartmentById",notes = "Update employee department based on the employee id")
    @PatchMapping("/{id}")
    public Employee updateEmpDepartmentById(@PathVariable("id") Integer emp_id , @RequestBody Department department) {
        return employeeService.updateEmpDepartment(emp_id,department.getId());
    }

    @ApiOperation(value = "getEmployeesByGender",notes = "Get employee base on gender")
    @GetMapping(value="/gender/{gender}")
    public List<Employee> getEmployeesByGender(@PathVariable String gender) {

        return employeeService.findEmployeesByGender(Gender.valueOf(gender));
    }



}

