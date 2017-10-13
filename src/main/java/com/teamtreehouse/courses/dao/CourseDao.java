package com.teamtreehouse.courses.dao;

import com.teamtreehouse.courses.exc.DaoException;
import com.teamtreehouse.courses.model.Course;

import java.util.List;

/**
 * Created by kylebudd on 10/11/17.
 */
public interface CourseDao {
    void add(Course course) throws DaoException;

    List<Course> findAll();

}
