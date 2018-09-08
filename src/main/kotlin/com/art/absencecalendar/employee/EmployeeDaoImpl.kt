package com.art.absencecalendar.absence.employee

import java.util.concurrent.atomic.AtomicInteger

class EmployeeDaoImpl: EmployeeDao {

    var employees = hashMapOf(
            0 to EmployeeTestData.employee_1,
            1 to EmployeeTestData.employee_2,
            2 to EmployeeTestData.employee_3,
            3 to EmployeeTestData.employee_4
    )

    private var lastId: AtomicInteger = AtomicInteger(employees.size - 1)

    override fun save(employee: Employee): Boolean {
        employees.put(lastId.incrementAndGet(), employee)
        return true
    }

    override fun findById(id: Int): Employee? {
        return employees[id]
    }

    override fun update(id: Int, employee: Employee) {
        employees[id] = employee
    }

    override fun delete(id: Int): Boolean {
        return employees[id]?.let {
            it.isArchival = true
            employees[id] = it
            true
        }?: false
    }

    override fun getAbsentEmployees(date: String): List<Employee>{
        return ArrayList()
    }

    override fun getPresentEmployees(date: String): List<Employee>{
        return ArrayList()
    }

    override fun getEmployees(beginDate: String, endDate: String, absenceType: String, position: String, department: String): List<Employee>{
        return ArrayList()
    }
}