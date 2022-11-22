package com.axis.services
import com.axis.module.Employee

class EmployeeService {


    fun displayEmployeeDetails(employee: Employee)
    {
        println("====employee info======")
        println("id = ${employee.id}")
        println("name = ${employee.name}")
        println("salary =${employee.salary}")
    }

    fun perDaySalary(employee: Employee):Int
    {
        return employee.salary/30
    }
    fun increaseSalaryByTenPercentage(employee: Employee):Double
    {
        var incrementedSalary = employee.salary*0.10
        println("10 % salary is $incrementedSalary")
        return incrementedSalary+employee.salary
    }




}
