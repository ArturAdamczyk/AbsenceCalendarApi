package com.art.absencecalendar.absence.type

class AbsenceTypeDao {
    val absenceTypes = hashMapOf(
            0 to AbsenceType(name = "sick_leave", id = 0),
            1 to AbsenceType(name = "remote_work", id = 1),
            2 to AbsenceType(name = "delegation", id = 2),
            3 to AbsenceType(name = "paid_holiday", id = 3),
            4 to AbsenceType(name = "unpaid_holiday", id = 4)
    )
}