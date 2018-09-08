package com.art.absencecalendar.absence.Interfaces

import com.art.absencecalendar.absence.type.AbsenceType
import com.art.absencecalendar.absence.department.Department
import com.art.absencecalendar.absence.employee.Employee
import com.art.absencecalendar.absence.employee.position.EmployeePosition
import com.art.absencecalendar.absence.gender.Gender

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