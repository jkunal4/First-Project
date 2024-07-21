package com.engineeringdigest.journalAPP.Repository;

import com.engineeringdigest.journalAPP.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}
