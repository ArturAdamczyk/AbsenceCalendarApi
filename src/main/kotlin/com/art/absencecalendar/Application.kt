package com.art.absencecalendar

import com.art.absencecalendar.common.Paths
import com.art.absencecalendar.employee.Employee
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.*

const val MESSAGE_OK = "OK"
const val MESSAGE_ERROR = "ERROR"
const val MESSAGE_ERROR_NOT_FOUND = "Not found"
const val NO_ID = -1

fun main(args: Array<String>) {
    val app = Javalin.create().apply {
        exception(Exception::class.java) { e, ctx -> e.printStackTrace() }
        error(404) { ctx -> ctx.json(MESSAGE_ERROR_NOT_FOUND) }
    }.start(8080)

    val api = ApiImpl()

    app.routes {

        get(Paths.ABSENT_EMPLOYEES) { ctx ->
            ctx.json(api.getAbsentEmployees(ctx.pathParam(Paths.DATE_PARAM)))
        }

        get(Paths.PRESENT_EMPLOYEES) { ctx ->
            ctx.json(api.getPresentEmployees(ctx.pathParam(Paths.DATE_PARAM)))
        }

        get(Paths.EMPLOYEES) { ctx ->
            ctx.json(api.getEmployees(
                    ctx.pathParam(Paths.BEGIN_DATE_PARAM),
                    ctx.pathParam(Paths.END_DATE_PARAM),
                    ctx.pathParam(Paths.ABSENCE_TYPE_PARAM),
                    ctx.pathParam(Paths.POSITION_PARAM),
                    ctx.pathParam(Paths.DEPARTMENT_PARAM)))
        }

        get(Paths.EMPLOYEE) { ctx ->
            ctx.json(api.getEmployee(ctx.pathParam(Paths.ID_PARAM)))
        }

        get(Paths.GEDNERS) { ctx ->
            ctx.json(api.getGenders())
        }

        get(Paths.EMPLOYEE_POSITIONS) { ctx ->
            ctx.json(api.getEmployeePositions())
        }

        get(Paths.DEPARTMENTS) { ctx ->
            ctx.json(api.getDepartments())
        }

        get(Paths.ABSENCE_TYPES) { ctx ->
            ctx.json(api.getAbsenceTypes())
        }

        delete(Paths.EMPLOYEE_DELETE) { ctx ->
            api.archiveEmployee(ctx.pathParam(Paths.ID_PARAM))
            ctx.status(204)
        }

        post(Paths.EMPLOYEE_ADD) { ctx ->
            api.addEmployee(ctx.bodyAsClass(Employee::class.java))
            ctx.status(201)
        }

    }
}


