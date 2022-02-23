import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.FileNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class KafkaSampleProducerTest {

    @InjectMocks
    private KafkaSampleProducer kafkaSampleProducer = new KafkaSampleProducer();

    @Mock
    private KafkaSampleConsumer kafkaSampleConsumer;

    public KafkaSampleProducerTest() throws FileNotFoundException {
    }

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test(){
        int i = 10;
        Assertions.assertEquals(i, 10);
    }
}
