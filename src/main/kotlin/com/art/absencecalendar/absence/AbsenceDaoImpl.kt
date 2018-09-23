package com.art.absencecalendar.absence

import java.util.concurrent.atomic.AtomicInteger

class AbsenceDaoImpl: AbsenceDao {

    val absences = hashMapOf(
            0 to AbsenceTestData.absence_1,
            1 to AbsenceTestData.absence_2,
            2 to AbsenceTestData.absence_3,
            3 to AbsenceTestData.absence_4,
            4 to AbsenceTestData.absence_5
    )

    private var lastId: AtomicInteger = AtomicInteger(absences.size - 1)

    override fun save(absence: Absence): Boolean {
        absences.put(lastId.incrementAndGet(), absence)
        return true
    }

    override fun findById(id: Int): Absence {
        absences[id]?.let{
            return it
        }?: throw Exception()
    }

    override fun update(id: Int, absence: Absence) {
        absences[id] = absence
    }

    override fun delete(id: Int): Boolean {
        absences[id]?.let {
           return if(it.isAbsenceAFutureEvent()){ absences.remove(id); true }
           else false
        }?: return false
    }

}