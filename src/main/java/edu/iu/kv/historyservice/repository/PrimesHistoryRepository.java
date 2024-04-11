package edu.iu.kv.historyservice.repository;

import edu.iu.kv.historyservice.model.PrimesRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimesHistoryRepository
        extends CrudRepository<PrimesRecord, Integer> {
    List <PrimesRecord> findAllByCustomer(String customer);
}