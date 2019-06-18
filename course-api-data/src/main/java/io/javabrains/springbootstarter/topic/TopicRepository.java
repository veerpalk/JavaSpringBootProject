package io.javabrains.springbootstarter.topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

	//getAll Topics
	//get topic given(string Id)
	//Update topic(topic t)
	//delete Topic(string id)
	
}
