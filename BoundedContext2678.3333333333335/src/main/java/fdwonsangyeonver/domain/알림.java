package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.카톡알림됨;
import fdwonsangyeonver.BoundedContext2678_3333333333335Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="알림_table")
@Data

public class 알림  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String message;

    @PostPersist
    public void onPostPersist(){


        카톡알림됨 카톡알림됨 = new 카톡알림됨(this);
        카톡알림됨.publishAfterCommit();

    }

    public static 알림Repository repository(){
        알림Repository 알림Repository = BoundedContext2678_3333333333335Application.applicationContext.getBean(알림Repository.class);
        return 알림Repository;
    }




    public static void 카톡알림서비스(거래완료됨 거래완료됨){

        /** Example 1:  new item 
        알림 알림 = new 알림();
        repository().save(알림);

        */

        /** Example 2:  finding and process
        
        repository().findById(거래완료됨.get???()).ifPresent(알림->{
            
            알림 // do something
            repository().save(알림);


         });
        */

        
    }
    public static void 카톡알림서비스(배달시작됨 배달시작됨){

        /** Example 1:  new item 
        알림 알림 = new 알림();
        repository().save(알림);

        */

        /** Example 2:  finding and process
        
        repository().findById(배달시작됨.get???()).ifPresent(알림->{
            
            알림 // do something
            repository().save(알림);


         });
        */

        
    }
    public static void 카톡알림서비스(카톡으로알림보냄 카톡으로알림보냄){

        /** Example 1:  new item 
        알림 알림 = new 알림();
        repository().save(알림);

        */

        /** Example 2:  finding and process
        
        repository().findById(카톡으로알림보냄.get???()).ifPresent(알림->{
            
            알림 // do something
            repository().save(알림);


         });
        */

        
    }


}
