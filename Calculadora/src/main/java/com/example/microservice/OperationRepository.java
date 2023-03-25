package com.example.microservice;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends CouchbaseRepository<Operation, String> {
}