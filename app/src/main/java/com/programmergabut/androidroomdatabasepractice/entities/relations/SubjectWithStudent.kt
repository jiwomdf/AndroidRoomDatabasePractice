package com.programmergabut.androidroomdatabasepractice.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.programmergabut.androidroomdatabasepractice.entities.Student
import com.programmergabut.androidroomdatabasepractice.entities.StudentSubjectCrossRef
import com.programmergabut.androidroomdatabasepractice.entities.Subject

data class SubjectWithStudent(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val student: List<Student>
)