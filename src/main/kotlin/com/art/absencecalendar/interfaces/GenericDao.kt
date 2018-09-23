package com.art.absencecalendar.interfaces

interface GenericDao<T> {
    fun save(o: T): Boolean

    fun findById(id: Int): T

    fun update(id: Int, o: T)

    fun delete(id: Int): Boolean
}