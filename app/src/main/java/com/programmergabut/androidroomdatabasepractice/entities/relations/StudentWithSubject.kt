package com.programmergabut.androidroomdatabasepractice.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.programmergabut.androidroomdatabasepractice.entities.Student
import com.programmergabut.androidroomdatabasepractice.entities.StudentSubjectCrossRef
import com.programmergabut.androidroomdatabasepractice.entities.Subject

data class StudentWithSubject(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subject: List<Subject>
)