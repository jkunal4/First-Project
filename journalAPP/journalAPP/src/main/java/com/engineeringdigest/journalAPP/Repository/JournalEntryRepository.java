package com.engineeringdigest.journalAPP.Repository;

import com.engineeringdigest.journalAPP.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {
}
