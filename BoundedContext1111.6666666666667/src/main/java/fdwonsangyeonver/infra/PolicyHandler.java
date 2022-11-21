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
    @Autowired 메뉴선택PreferenceRepository 메뉴선택PreferenceRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='메뉴추가됨'")
    public void whenever메뉴추가됨_메뉴추가(@Payload 메뉴추가됨 메뉴추가됨){

        메뉴추가됨 event = 메뉴추가됨;
        System.out.println("\n\n##### listener 메뉴추가 : " + 메뉴추가됨 + "\n\n");


        

        // Sample Logic //
        메뉴선택Preference.메뉴추가(event);
        

        

    }

}


