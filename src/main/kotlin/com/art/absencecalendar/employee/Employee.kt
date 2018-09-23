package com.art.absencecalendar.employee

import com.art.absencecalendar.absence.Absence

data class Employee(
        var id: Int,
        var firstName: String,
        var surname: String,
        var personalIdentityNumber: Int,
        var age: Int,
        var gender: String,
        var position: String,
        var department: String,
        var isArchival: Boolean,
        var photo: String,
        var absenceList: List<Absence>
)