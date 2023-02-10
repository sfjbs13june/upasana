package com.upasana.db.repository;

import com.upasana.db.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

