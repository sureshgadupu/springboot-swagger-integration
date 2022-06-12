package dev.fullstackcode.eis.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.fullstackcode.eis.entity.Department;
import dev.fullstackcode.eis.entity.Employee;
import dev.fullstackcode.eis.entity.Gender;
import dev.fullstackcode.eis.service.EmployeeService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.server.ResponseStatusException;

@ContextConfiguration(classes = {EmployeeController.class})
@ExtendWith(SpringExtension.class)
class EmployeeControllerTest {
    @Autowired
    private EmployeeController employeeController;

    @MockBean
    private EmployeeService employeeService;

    /**
     * Method under test: {@link EmployeeController#createEmployee(Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmployee() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at dev.fullstackcode.eis.controller.EmployeeController.createEmployee(EmployeeController.java:65)
        //   In order to prevent createEmployee(Employee)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createEmployee(Employee).
        //   See https://diff.blue/R013 to resolve this issue.

        EmployeeController employeeController = new EmployeeController();

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        employeeController.createEmployee(employee);
    }

    /**
     * Method under test: {@link EmployeeController#createEmployee(Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateEmployee2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at dev.fullstackcode.eis.controller.EmployeeController.createEmployee(EmployeeController.java:65)
        //   In order to prevent createEmployee(Employee)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   createEmployee(Employee).
        //   See https://diff.blue/R013 to resolve this issue.

        EmployeeController employeeController = new EmployeeController();

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");
        Employee employee = mock(Employee.class);
        doNothing().when(employee).setBirth_date((LocalDate) any());
        doNothing().when(employee).setDepartment((Department) any());
        doNothing().when(employee).setEmail((String) any());
        doNothing().when(employee).setFirst_name((String) any());
        doNothing().when(employee).setGender((Gender) any());
        doNothing().when(employee).setHire_date((LocalDate) any());
        doNothing().when(employee).setId((Integer) any());
        doNothing().when(employee).setLast_name((String) any());
        doNothing().when(employee).setSalary((BigDecimal) any());
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        employeeController.createEmployee(employee);
    }

    /**
     * Method under test: {@link EmployeeController#updateEmployee(Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateEmployee() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at dev.fullstackcode.eis.controller.EmployeeController.updateEmployee(EmployeeController.java:70)
        //   In order to prevent updateEmployee(Employee)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateEmployee(Employee).
        //   See https://diff.blue/R013 to resolve this issue.

        EmployeeController employeeController = new EmployeeController();

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        employeeController.updateEmployee(employee);
    }

    /**
     * Method under test: {@link EmployeeController#updateEmployee(Employee)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateEmployee2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at dev.fullstackcode.eis.controller.EmployeeController.updateEmployee(EmployeeController.java:70)
        //   In order to prevent updateEmployee(Employee)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateEmployee(Employee).
        //   See https://diff.blue/R013 to resolve this issue.

        EmployeeController employeeController = new EmployeeController();

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");
        Employee employee = mock(Employee.class);
        doNothing().when(employee).setBirth_date((LocalDate) any());
        doNothing().when(employee).setDepartment((Department) any());
        doNothing().when(employee).setEmail((String) any());
        doNothing().when(employee).setFirst_name((String) any());
        doNothing().when(employee).setGender((Gender) any());
        doNothing().when(employee).setHire_date((LocalDate) any());
        doNothing().when(employee).setId((Integer) any());
        doNothing().when(employee).setLast_name((String) any());
        doNothing().when(employee).setSalary((BigDecimal) any());
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        employeeController.updateEmployee(employee);
    }

    /**
     * Method under test: {@link EmployeeController#deleteEmployee(Integer)}
     */
    @Test
    void testDeleteEmployee() throws Exception {
        doNothing().when(this.employeeService).deleteEmployee((Integer) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/employee/{id}", 1);
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link EmployeeController#deleteEmployee(Integer)}
     */
    @Test
    void testDeleteEmployee2() throws Exception {
        doNothing().when(this.employeeService).deleteEmployee((Integer) any());
        MockHttpServletRequestBuilder deleteResult = MockMvcRequestBuilders.delete("/employee/{id}", 1);
        deleteResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(deleteResult)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link EmployeeController#deleteEmployee(Integer)}
     */
    @Test
    void testDeleteEmployee3() throws Exception {
        doThrow(new ResponseStatusException(HttpStatus.CONTINUE)).when(this.employeeService)
                .deleteEmployee((Integer) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/employee/{id}", 1);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartment(Integer, Integer, String)}
     */
    @Test
    void testUpdateEmpDepartment() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any())).thenReturn(employee);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .patch("/employee/{empId}/dept/{deptId}", 123, 123)
                .param("id", "foo");
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartment(Integer, Integer, String)}
     */
    @Test
    void testUpdateEmpDepartment2() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any())).thenReturn(employee);
        MockHttpServletRequestBuilder patchResult = MockMvcRequestBuilders.patch("/employee/{empId}/dept/{deptId}", 123,
                123);
        patchResult.contentType("https://example.org/example");
        MockHttpServletRequestBuilder requestBuilder = patchResult.param("id", "foo");
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartment(Integer, Integer, String)}
     */
    @Test
    void testUpdateEmpDepartment3() throws Exception {
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any()))
                .thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .patch("/employee/{empId}/dept/{deptId}", 123, 123)
                .param("id", "foo");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any())).thenReturn(employee);

        Department department1 = new Department();
        department1.setEmployees(new ArrayList<>());
        department1.setId(1);
        department1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById2() throws Exception {
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any()))
                .thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById3() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any())).thenReturn(employee);

        Department department1 = new Department();
        department1.setEmployees(new ArrayList<>());
        department1.setId(1);
        department1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById4() throws Exception {
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any()))
                .thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById5() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any())).thenReturn(employee);

        Department department1 = new Department();
        department1.setEmployees(new ArrayList<>());
        department1.setId(1);
        department1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById6() throws Exception {
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any()))
                .thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById7() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any())).thenReturn(employee);

        Department department1 = new Department();
        department1.setEmployees(new ArrayList<>());
        department1.setId(1);
        department1.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department1);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#updateEmpDepartmentById(Integer, Department)}
     */
    @Test
    void testUpdateEmpDepartmentById8() throws Exception {
        when(this.employeeService.updateEmpDepartment((Integer) any(), (Integer) any()))
                .thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));

        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");
        String content = (new ObjectMapper()).writeValueAsString(department);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/employee/{empId}", 123)
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployee(Integer)}
     */
    @Test
    void testGetEmployee() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        Optional<Employee> ofResult = Optional.of(employee);
        when(this.employeeService.getEmployeeById((Integer) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee/{id}", 1);
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployee(Integer)}
     */
    @Test
    void testGetEmployee2() throws Exception {
        when(this.employeeService.getEmployeeById((Integer) any())).thenReturn(Optional.empty());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee/{id}", 1);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    /**
     * Method under test: {@link EmployeeController#getEmployee(Integer)}
     */
    @Test
    void testGetEmployee3() throws Exception {
        Department department = new Department();
        department.setEmployees(new ArrayList<>());
        department.setId(1);
        department.setName("Name");

        Employee employee = new Employee();
        employee.setBirth_date(LocalDate.ofEpochDay(1L));
        employee.setDepartment(department);
        employee.setEmail("jane.doe@example.org");
        employee.setFirst_name("Jane");
        employee.setGender(Gender.M);
        employee.setHire_date(LocalDate.ofEpochDay(1L));
        employee.setId(1);
        employee.setLast_name("Doe");
        employee.setSalary(BigDecimal.valueOf(42L));
        Optional<Employee> ofResult = Optional.of(employee);
        when(this.employeeService.getEmployeeById((Integer) any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/employee/{id}", 1);
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"id\":1,\"first_name\":\"Jane\",\"last_name\":\"Doe\",\"gender\":\"M\",\"birth_date\":[1970,1,2],\"hire_date\":[1970"
                                        + ",1,2],\"email\":\"jane.doe@example.org\",\"salary\":42,\"department\":{\"id\":1,\"name\":\"Name\"}}"));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployee(Integer)}
     */
    @Test
    void testGetEmployee4() throws Exception {
        when(this.employeeService.getEmployeeById((Integer) any()))
                .thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee/{id}", 1);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployees()}
     */
    @Test
    void testGetEmployees() throws Exception {
        when(this.employeeService.getAllEmployees()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee");
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployees()}
     */
    @Test
    void testGetEmployees2() throws Exception {
        when(this.employeeService.getAllEmployees()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/employee");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployees()}
     */
    @Test
    void testGetEmployees3() throws Exception {
        when(this.employeeService.getAllEmployees()).thenThrow(new ResponseStatusException(HttpStatus.CONTINUE));
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(100));
    }

    /**
     * Method under test: {@link EmployeeController#getEmployeesByGender(String)}
     */
    @Test
    void testGetEmployeesByGender() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/employee/gender/{gender}", "",
                "Uri Vars");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.employeeController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }
}

