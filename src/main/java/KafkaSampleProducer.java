import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class KafkaSampleProducer {

    public KafkaSampleProducer() throws FileNotFoundException {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer kafkaProducer = new KafkaProducer(properties);

        File read = new File("D:\\NAGP\\BigData\\Final-Assignment_Solution\\Kafka-data-file.txt");
        Scanner scan = new Scanner(read);
        int index = 0;
        while(scan.hasNextLine()) {

            index++;
            Date time = new Date();

            String data = scan.nextLine();
            System.out.println(data);

            ProducerRecord producerRecord = new ProducerRecord("Kafka-Topic-for-BD", time.toString() + "-" + String.valueOf(index) , data);

            kafkaProducer.send(producerRecord);
        }

        kafkaProducer.close();
    }


}
