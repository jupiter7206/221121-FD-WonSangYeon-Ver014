package fdwonsangyeonver.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fdwonsangyeonver.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fdwonsangyeonver.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired 배달관리Repository 배달관리Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리완료됨'")
    public void whenever요리완료됨_배달목록추가(@Payload 요리완료됨 요리완료됨){

        요리완료됨 event = 요리완료됨;
        System.out.println("\n\n##### listener 배달목록추가 : " + 요리완료됨 + "\n\n");


        

        // Sample Logic //
        배달관리.배달목록추가(event);
        

        

    }

}


