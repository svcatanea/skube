package io.skube.holiday.impl;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRepository extends MongoRepository<Holiday, String> {

	public Holiday findByName(String name);
}
