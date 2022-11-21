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
    @Autowired 알림Repository 알림Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='거래완료됨'")
    public void whenever거래완료됨_카톡알림서비스(@Payload 거래완료됨 거래완료됨){

        거래완료됨 event = 거래완료됨;
        System.out.println("\n\n##### listener 카톡알림서비스 : " + 거래완료됨 + "\n\n");


        

        // Sample Logic //
        알림.카톡알림서비스(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달시작됨'")
    public void whenever배달시작됨_카톡알림서비스(@Payload 배달시작됨 배달시작됨){

        배달시작됨 event = 배달시작됨;
        System.out.println("\n\n##### listener 카톡알림서비스 : " + 배달시작됨 + "\n\n");


        

        // Sample Logic //
        알림.카톡알림서비스(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='카톡으로알림보냄'")
    public void whenever카톡으로알림보냄_카톡알림서비스(@Payload 카톡으로알림보냄 카톡으로알림보냄){

        카톡으로알림보냄 event = 카톡으로알림보냄;
        System.out.println("\n\n##### listener 카톡알림서비스 : " + 카톡으로알림보냄 + "\n\n");


        

        // Sample Logic //
        알림.카톡알림서비스(event);
        

        

    }

}


