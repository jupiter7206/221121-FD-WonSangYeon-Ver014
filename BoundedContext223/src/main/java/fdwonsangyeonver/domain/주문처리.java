package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.주문수락됨;
import fdwonsangyeonver.domain.주문거절됨;
import fdwonsangyeonver.domain.요리완료됨;
import fdwonsangyeonver.domain.요리시작됨;
import fdwonsangyeonver.BoundedContext223Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="주문처리_table")
@Data

public class 주문처리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String preferenceId;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        주문수락됨 주문수락됨 = new 주문수락됨(this);
        주문수락됨.publishAfterCommit();



        주문거절됨 주문거절됨 = new 주문거절됨(this);
        주문거절됨.publishAfterCommit();



        요리완료됨 요리완료됨 = new 요리완료됨(this);
        요리완료됨.publishAfterCommit();



        요리시작됨 요리시작됨 = new 요리시작됨(this);
        요리시작됨.publishAfterCommit();

    }

    public static 주문처리Repository repository(){
        주문처리Repository 주문처리Repository = BoundedContext223Application.applicationContext.getBean(주문처리Repository.class);
        return 주문처리Repository;
    }




    public static void 주문취소알림(주문취소됨 주문취소됨){

        /** Example 1:  new item 
        주문처리 주문처리 = new 주문처리();
        repository().save(주문처리);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문취소됨.get???()).ifPresent(주문처리->{
            
            주문처리 // do something
            repository().save(주문처리);


         });
        */

        
    }
    public static void 주문정보전달(주문됨 주문됨){

        /** Example 1:  new item 
        주문처리 주문처리 = new 주문처리();
        repository().save(주문처리);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문됨.get???()).ifPresent(주문처리->{
            
            주문처리 // do something
            repository().save(주문처리);


         });
        */

        
    }


}
