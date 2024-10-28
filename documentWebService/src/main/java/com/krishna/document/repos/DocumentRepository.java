package com.krishna.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
