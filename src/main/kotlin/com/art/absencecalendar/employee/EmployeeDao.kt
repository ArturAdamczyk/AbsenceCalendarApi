package com.art.absencecalendar.absence.employee

import com.art.absencecalendar.absence.Interfaces.GenericDao

interface EmployeeDao : GenericDao<Employee> {
    fun getAbsentEmployees(date: String): List<Employee>

    fun getPresentEmployees(date: String): List<Employee>

    fun getEmployees(beginDate: String, endDate: String, absenceType: String, position: String, department: String): List<Employee>
}