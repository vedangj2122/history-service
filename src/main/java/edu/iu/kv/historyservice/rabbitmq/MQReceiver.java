package edu.iu.kv.historyservice.rabbitmq;


import edu.iu.kv.historyservice.model.PrimesRecord;
import edu.iu.kv.historyservice.repository.PrimesHistoryRepository;
import org.springframework.stereotype.Component;

@Component
public class MQReceiver {
    private final PrimesHistoryRepository primesHistoryRepository;
    public MQReceiver(PrimesHistoryRepository primesHistoryRepository, PrimesHistoryRepository primesHistoryRepository1) {

        this.primesHistoryRepository = primesHistoryRepository;
    }

    @RabbitListner(queues={'primes'})
    public void recieveMessage(@Payload String message) {
        System.out.println(message);
        Gson gson = new Gson();
        PrimesRecord primesRecord = gson
                .fromJson(message, PrimesRecord.class);
        primesHistoryRepository.save(primesRecord);
    }
}
