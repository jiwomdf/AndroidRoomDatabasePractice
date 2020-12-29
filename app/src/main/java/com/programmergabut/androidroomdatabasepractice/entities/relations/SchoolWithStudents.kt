package com.programmergabut.androidroomdatabasepractice.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.programmergabut.androidroomdatabasepractice.entities.School
import com.programmergabut.androidroomdatabasepractice.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)