package com.art.Interfaces

import com.art.absence.type.AbsenceType
import com.art.department.Department
import com.art.employee.Employee
import com.art.employee.position.EmployeePosition
import com.art.gender.Gender

interface Api {
    fun getAbsentEmployees(date: String): List<Employee>
    fun getPresentEmployees(date: String): List<Employee>
    fun getEmployees(beginDate: String, endDate: String, absenceType: String, position: String, department: String): List<Employee>
    fun getEmployee(id: String): Employee?
    fun getGenders(): List<Gender>
    fun getEmployeePositions(): List<EmployeePosition>
    fun getDepartments(): List<Department>
    fun getAbsenceTypes(): List<AbsenceType>

    fun addEmployee(firstName: String,
                    surname: String,
                    personalIdentityNumber: Int,
                    age: Int,
                    gender: String,
                    position: String,
                    departament: String,
                    isArchival: Boolean,
                    photo: String): Boolean
    fun archiveEmployee(id: String): Boolean
}