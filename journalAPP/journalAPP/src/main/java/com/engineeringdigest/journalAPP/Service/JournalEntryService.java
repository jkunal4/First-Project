package com.engineeringdigest.journalAPP.Service;

import com.engineeringdigest.journalAPP.Entity.JournalEntry;
import com.engineeringdigest.journalAPP.Repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class JournalEntryService {


    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
       journalEntryRepository.save(journalEntry);
    }
}


// Controller --> Service --> Repository