package com.art.department

class DepartmentDao {
    val departments = hashMapOf(
            0 to Department(name = "web_dev", id = 0),
            1 to Department(name = "android_dev", id = 1),
            2 to Department(name = "qa", id = 2),
            3 to Department(name = "other", id = 3)
    )
}