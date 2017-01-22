package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ToolRepository extends CrudRepository<Tool, Long> {

    Tool findByName(@Param("name") String name);
}
