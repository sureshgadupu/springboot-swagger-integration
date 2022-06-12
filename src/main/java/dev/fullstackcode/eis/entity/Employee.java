package dev.fullstackcode.eis.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import dev.fullstackcode.eis.validation.ConditionalNotNull;
import dev.fullstackcode.eis.validation.OnCreate;
import dev.fullstackcode.eis.validation.OnUpdate;
import dev.fullstackcode.eis.validation.ValidName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@ApiModel(description="Manages employee object ")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@ConditionalNotNull(fields = "salary,email",dependsOn = "hire_date" )
public class Employee implements Serializable {

    @ApiModelProperty(value = "Auto generated unique id ",required = true)

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Null(groups = {OnCreate.class})
    @NotNull(groups = OnUpdate.class)
    private Integer id;

    @ApiModelProperty(value = "First name of employee ",required = true,example = "Suresh")
    @NotBlank(message = "FirstName should not be blank")
    @Size(min = 3, message = "{validation.firstNameSize}")
    @ValidName
    private String first_name;

    @ApiModelProperty(value = "Last name of employee ",required = true,example = "Gadupu")
    @NotBlank(message = "LastName should not be blank")
    @Size(min = 3,message = "LastName should be at least ${min} chars")

    private String last_name;

    @ApiModelProperty(value = "Gender of employee ")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ApiModelProperty(value = "Birth date of employee ")
    @PastOrPresent
    private LocalDate birth_date;

    @ApiModelProperty(value = "Hiring date of employee ")
    @PastOrPresent
    private LocalDate hire_date;

    // @NotBlank // (message = "Email should not be blank")
    @ApiModelProperty(value = "Email of employee ")
    @Email    // (message = "Not a valid email")
    private String email;

    @ApiModelProperty(value = "Salary of employee ")
    @PositiveOrZero
    private BigDecimal salary;

    @ApiModelProperty(value = "Department details of employee ")
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;



    public Employee() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



}