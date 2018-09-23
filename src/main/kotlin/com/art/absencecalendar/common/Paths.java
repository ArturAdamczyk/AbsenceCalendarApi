package com.art.absencecalendar.common;

public class Paths {
    public static final String ABSENT_EMPLOYEES = "/employess/absent/:date";
    public static final String PRESENT_EMPLOYEES = "/employees/present/:date";
    public static final String EMPLOYEES = "/employess/:begin_date/:end_date/:absence_type/:position/:department";
    public static final String EMPLOYEE = "/employee/:id";
    public static final String GEDNERS = "/genders";
    public static final String EMPLOYEE_POSITIONS = "/employee_positions";
    public static final String DEPARTMENTS = "/departments";
    public static final String ABSENCE_TYPES = "/absence_types";
    public static final String EMPLOYEE_DELETE = "/employee/delete/:id";
    public static final String EMPLOYEE_ADD = "/employee/add";

    public static final String BEGIN_DATE_PARAM = "begin_date";
    public static final String END_DATE_PARAM = "end_date";
    public static final String ID_PARAM = "id";
    public static final String ABSENCE_TYPE_PARAM = "absence_type";
    public static final String POSITION_PARAM = "position";
    public static final String DEPARTMENT_PARAM = "department";
    public static final String DATE_PARAM = "date";
}
