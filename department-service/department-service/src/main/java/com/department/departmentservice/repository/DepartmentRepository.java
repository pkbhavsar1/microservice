package com.department.departmentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.departmentservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
