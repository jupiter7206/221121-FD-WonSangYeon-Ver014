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
    @Autowired 결재Repository 결재Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문취소됨'")
    public void whenever주문취소됨_결제취소(@Payload 주문취소됨 주문취소됨){

        주문취소됨 event = 주문취소됨;
        System.out.println("\n\n##### listener 결제취소 : " + 주문취소됨 + "\n\n");


        

        // Sample Logic //
        결재.결제취소(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문거절됨'")
    public void whenever주문거절됨_결제취소(@Payload 주문거절됨 주문거절됨){

        주문거절됨 event = 주문거절됨;
        System.out.println("\n\n##### listener 결제취소 : " + 주문거절됨 + "\n\n");


        

        // Sample Logic //
        결재.결제취소(event);
        

        

    }

}


