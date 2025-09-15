package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.domain.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity, Long> {

}
