package com.art.absencecalendar.absence

import java.time.LocalDate

data class Absence(
        var id: Int,
        var employeeId: Int,
        var beginDate: LocalDate,
        var endDate: LocalDate,
        var days: Int,
        var absenceType: String) {

    fun isBetweenDates(beginDate: LocalDate, endDate: LocalDate): Boolean{
        return (this.beginDate.isAfter(beginDate)
                || this.endDate.isBefore(endDate)
                || (this.beginDate.isBefore(beginDate) && this.endDate.isAfter(endDate)))
    }

    fun isAbsenceAFutureEvent(): Boolean{
        return this.endDate.isBefore(LocalDate.now())
    }
}