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
    @Autowired 주문Repository 주문Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문수락됨'")
    public void whenever주문수락됨_주문상태변경(@Payload 주문수락됨 주문수락됨){

        주문수락됨 event = 주문수락됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 주문수락됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문거절됨'")
    public void whenever주문거절됨_주문상태변경(@Payload 주문거절됨 주문거절됨){

        주문거절됨 event = 주문거절됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 주문거절됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리시작됨'")
    public void whenever요리시작됨_주문상태변경(@Payload 요리시작됨 요리시작됨){

        요리시작됨 event = 요리시작됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 요리시작됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리완료됨'")
    public void whenever요리완료됨_주문상태변경(@Payload 요리완료됨 요리완료됨){

        요리완료됨 event = 요리완료됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 요리완료됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='거래완료됨'")
    public void whenever거래완료됨_주문상태변경(@Payload 거래완료됨 거래완료됨){

        거래완료됨 event = 거래완료됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 거래완료됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달시작됨'")
    public void whenever배달시작됨_주문상태변경(@Payload 배달시작됨 배달시작됨){

        배달시작됨 event = 배달시작됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 배달시작됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달접수pick앱통보함'")
    public void whenever배달접수pick앱통보함_앱통보(@Payload 배달접수pick앱통보함 배달접수pick앱통보함){

        배달접수pick앱통보함 event = 배달접수pick앱통보함;
        System.out.println("\n\n##### listener 앱통보 : " + 배달접수pick앱통보함 + "\n\n");


        

        // Sample Logic //
        주문.앱통보(event);
        

        

    }

}


