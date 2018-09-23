package com.art.absencecalendar

import com.art.absencecalendar.absence.Absence
import com.art.absencecalendar.absence.AbsenceDaoImpl
import com.art.absencecalendar.absence.type.AbsenceType
import com.art.absencecalendar.absence.type.AbsenceTypeDao
import com.art.absencecalendar.absence.user.UserDao
import com.art.absencecalendar.interfaces.Api
import com.art.absencecalendar.department.Department
import com.art.absencecalendar.department.DepartmentDao
import com.art.absencecalendar.employee.Employee
import com.art.absencecalendar.gender.Gender
import com.art.absencecalendar.employee.EmployeeDao
import com.art.absencecalendar.employee.EmployeeDaoImpl
import com.art.absencecalendar.employee.position.EmployeePosition
import com.art.absencecalendar.employee.position.EmployeePositionDao
import com.art.absencecalendar.gender.GenderDao

class ApiImpl(
        private val employeeDao: EmployeeDao = EmployeeDaoImpl(),
        private val absenceDao: AbsenceDaoImpl = AbsenceDaoImpl(),
        private val genderDao: GenderDao = GenderDao(),
        private val departmentDao: DepartmentDao = DepartmentDao(),
        private val employeePosistionDao: EmployeePositionDao = EmployeePositionDao(),
        private val absenceTypesDao: AbsenceTypeDao = AbsenceTypeDao(),
        private val userDao: UserDao = UserDao()
): Api {
    override fun getAbsentEmployees(date: String): List<Employee>{
        return employeeDao.getAbsentEmployees(date)
    }

    override fun getPresentEmployees(date: String): List<Employee>{
        return employeeDao.getPresentEmployees(date)
    }

    override fun getEmployees(beginDate: String, endDate: String, absenceType: String, position: String, department: String): List<Employee>{
        return employeeDao.getEmployees(beginDate, endDate, absenceType, position, department)
    }

    override fun getEmployee(id: String): Employee{
        return employeeDao.findById(id.toInt())
    }

    override fun getGenders(): List<Gender>{
        return genderDao.genders.values.toList()
    }

    override fun getEmployeePositions(): List<EmployeePosition>{
        return employeePosistionDao.employeePositions.values.toList()
    }

    override fun getDepartments(): List<Department>{
        return departmentDao.departments.values.toList()
    }

    override fun getAbsenceTypes(): List<AbsenceType>{
        return absenceTypesDao.absenceTypes.values.toList()
    }

    override fun addEmployee(employee: Employee): Boolean{
        return employeeDao.save(employee)
    }

    override fun archiveEmployee(id: String): Boolean{
        return employeeDao.delete(id.toInt())
    }

    override fun addAbsence(absence: Absence): Boolean{
        return absenceDao.save(absence)
    }

    override fun deleteAbsence(id: String): Boolean{
        return absenceDao.delete(id.toInt())
    }

}