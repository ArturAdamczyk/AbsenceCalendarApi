package com.art.absencecalendar.interfaces

import com.art.absencecalendar.absence.Absence
import com.art.absencecalendar.absence.type.AbsenceType
import com.art.absencecalendar.department.Department
import com.art.absencecalendar.employee.Employee
import com.art.absencecalendar.employee.position.EmployeePosition
import com.art.absencecalendar.gender.Gender

interface Api {
    fun getAbsentEmployees(date: String): List<Employee>
    fun getPresentEmployees(date: String): List<Employee>
    fun getEmployees(beginDate: String, endDate: String, absenceType: String, position: String, department: String): List<Employee>
    fun getEmployee(id: String): Employee
    fun getGenders(): List<Gender>
    fun getEmployeePositions(): List<EmployeePosition>
    fun getDepartments(): List<Department>
    fun getAbsenceTypes(): List<AbsenceType>

    fun addEmployee(employee: Employee): Boolean
    fun archiveEmployee(id: String): Boolean
    fun addAbsence(absence: Absence): Boolean
    fun deleteAbsence(id: String): Boolean
}