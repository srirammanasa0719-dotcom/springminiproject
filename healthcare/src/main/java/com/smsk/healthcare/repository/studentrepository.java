package com.smsk.healthcare.repository;

import com.smsk.healthcare.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<student,Long> {
}
