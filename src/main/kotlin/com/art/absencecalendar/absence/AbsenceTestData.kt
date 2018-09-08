package com.art.absencecalendar.absence

import java.time.LocalDate

class AbsenceTestData {
    companion object{
        var absence_1 = Absence(
                beginDate = LocalDate.of(10,10,2018),
                endDate = LocalDate.of(14,10,2018),
                days = 5,
                absenceType = "sick_leave",
                employeeId = 0,
                id = 0)

        var absence_2 = Absence(
                beginDate = LocalDate.of(10,10,2018),
                endDate = LocalDate.of(14,10,2018),
                days = 5,
                absenceType = "sick_leave",
                employeeId = 0,
                id = 0)

        var absence_3 = Absence(
                beginDate = LocalDate.of(10,10,2018),
                endDate = LocalDate.of(14,10,2018),
                days = 5,
                absenceType = "sick_leave",
                employeeId = 0,
                id = 0)

        var absence_4 = Absence(
                beginDate = LocalDate.of(10,10,2018),
                endDate = LocalDate.of(14,10,2018),
                days = 5,
                absenceType = "sick_leave",
                employeeId = 0,
                id = 0)

        var absence_5 = Absence(
                beginDate = LocalDate.of(10,10,2018),
                endDate = LocalDate.of(14,10,2018),
                days = 5,
                absenceType = "sick_leave",
                employeeId = 0,
                id = 0)
    }
}