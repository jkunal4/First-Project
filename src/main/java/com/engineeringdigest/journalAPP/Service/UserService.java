package com.engineeringdigest.journalAPP.Service;

import com.engineeringdigest.journalAPP.Entity.JournalEntry;
import com.engineeringdigest.journalAPP.Entity.User;
import com.engineeringdigest.journalAPP.Repository.JournalEntryRepository;
import com.engineeringdigest.journalAPP.Repository.UserRepository;
import org.apache.kafka.common.protocol.types.Field;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
       userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findByID(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}


// Controller --> Service --> Repository