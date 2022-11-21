package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.결제됨;
import fdwonsangyeonver.domain.결제취소됨;
import fdwonsangyeonver.BoundedContext766Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="결재_table")
@Data

public class 결재  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String orderId;

    @PostPersist
    public void onPostPersist(){


        결제됨 결제됨 = new 결제됨(this);
        결제됨.publishAfterCommit();



        결제취소됨 결제취소됨 = new 결제취소됨(this);
        결제취소됨.publishAfterCommit();

    }

    public static 결재Repository repository(){
        결재Repository 결재Repository = BoundedContext766Application.applicationContext.getBean(결재Repository.class);
        return 결재Repository;
    }




    public static void 결제취소(주문취소됨 주문취소됨){

        /** Example 1:  new item 
        결재 결재 = new 결재();
        repository().save(결재);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문취소됨.get???()).ifPresent(결재->{
            
            결재 // do something
            repository().save(결재);


         });
        */

        
    }
    public static void 결제취소(주문거절됨 주문거절됨){

        /** Example 1:  new item 
        결재 결재 = new 결재();
        repository().save(결재);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문거절됨.get???()).ifPresent(결재->{
            
            결재 // do something
            repository().save(결재);


         });
        */

        
    }


}
