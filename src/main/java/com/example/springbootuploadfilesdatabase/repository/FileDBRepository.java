package com.example.springbootuploadfilesdatabase.repository;

import com.example.springbootuploadfilesdatabase.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB,String> {

}
