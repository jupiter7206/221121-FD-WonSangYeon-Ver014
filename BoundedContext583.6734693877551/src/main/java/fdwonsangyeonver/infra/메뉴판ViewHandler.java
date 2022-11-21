package fdwonsangyeonver.infra;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class 메뉴판ViewHandler {


    @Autowired
    private 메뉴판Repository 메뉴판Repository;




}

