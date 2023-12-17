package com.github.giandemanincor.javacore.Gassociation.test;

import com.github.giandemanincor.javacore.Gassociation.domain.School;
import com.github.giandemanincor.javacore.Gassociation.domain.Teacher;

public class SchoolTest {
    public static void main(String[] args) {
        // unidirectional relation many to one
        Teacher teacher = new Teacher("Gian");
        Teacher[] teachers = {teacher};
        School school = new School("New School", teachers);

        school.print();
    }
}
