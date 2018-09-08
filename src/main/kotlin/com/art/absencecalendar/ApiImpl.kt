package com.art

import com.art.absencecalendar.absence.type.AbsenceType
import com.art.absencecalendar.absence.Interfaces.Api
import com.art.absencecalendar.absence.department.Department
import com.art.absencecalendar.absence.employee.Employee
import com.art.absencecalendar.absence.gender.Gender
import com.art.absencecalendar.absence.employee.EmployeeDao
import com.art.absencecalendar.absence.employee.position.EmployeePosition

class ApiImpl(
        private val employeeDao: EmployeeDao
): Api {

    override fun getAbsentEmployees(date: String): List<Employee>{
        return ArrayList()
    }

    override fun getPresentEmployees(date: String): List<Employee>{
        return ArrayList()
    }

    override fun getEmployees(beginDate: String, endDate: String, absenceType: String, position: String, department: String): List<Employee>{
        return ArrayList()
    }

    override fun getEmployee(id: String): Employee?{
        return employeeDao.findById(id.toInt())
    }

    override fun getGenders(): List<Gender>{
        return ArrayList()
    }

    override fun getEmployeePositions(): List<EmployeePosition>{
        return ArrayList()
    }

    override fun getDepartments(): List<Department>{
        return ArrayList()
    }

    override fun getAbsenceTypes(): List<AbsenceType>{
        return ArrayList()
    }

    override fun addEmployee(firstName: String,
                    surname: String,
                    personalIdentityNumber: Int,
                    age: Int,
                    gender: String,
                    position: String,
                    departament: String,
                    isArchival: Boolean,
                    photo: String): Boolean{
        return true
    }

    override fun archiveEmployee(id: String): Boolean{
        return true
    }

}