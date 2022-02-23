import java.io.FileNotFoundException;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        KafkaSampleProducer kafkaSampleProducer = new KafkaSampleProducer();
        KafkaSampleConsumer kafkaSampleConsumer = new KafkaSampleConsumer();
        kafkaSampleConsumer.runConsumer();
    }
}
