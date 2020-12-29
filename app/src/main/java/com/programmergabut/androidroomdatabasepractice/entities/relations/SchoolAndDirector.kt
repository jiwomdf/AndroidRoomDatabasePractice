package com.programmergabut.androidroomdatabasepractice.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.programmergabut.androidroomdatabasepractice.entities.Director
import com.programmergabut.androidroomdatabasepractice.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)