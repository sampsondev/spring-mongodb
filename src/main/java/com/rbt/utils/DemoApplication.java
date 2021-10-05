package com.rbt.utils;

import com.rbt.model.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ExecutableFindOperation;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	MongoOperations mongoTemplate;

	public static void main(String[] args)   {

		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Query query = Query.query( where("programName").is("INTERNAL_PROGRAM"));
		List<Program> list = mongoTemplate.find(query, Program.class, "program");
		System.out.println("size  " + list.size());
	}
}
