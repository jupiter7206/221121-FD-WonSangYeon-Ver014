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
    @Autowired 주문처리Repository 주문처리Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문취소됨'")
    public void whenever주문취소됨_주문취소알림(@Payload 주문취소됨 주문취소됨){

        주문취소됨 event = 주문취소됨;
        System.out.println("\n\n##### listener 주문취소알림 : " + 주문취소됨 + "\n\n");


        

        // Sample Logic //
        주문처리.주문취소알림(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문됨'")
    public void whenever주문됨_주문정보전달(@Payload 주문됨 주문됨){

        주문됨 event = 주문됨;
        System.out.println("\n\n##### listener 주문정보전달 : " + 주문됨 + "\n\n");


        

        // Sample Logic //
        주문처리.주문정보전달(event);
        

        

    }

}


