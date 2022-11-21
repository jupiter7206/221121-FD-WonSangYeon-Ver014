package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.주문됨;
import fdwonsangyeonver.domain.주문취소됨;
import fdwonsangyeonver.domain.카톡으로알림보냄;
import fdwonsangyeonver.domain.메뉴추가됨;
import fdwonsangyeonver.domain.주문상태를조회함;
import fdwonsangyeonver.domain.주문상태가변경됨;
import fdwonsangyeonver.domain.앱통보함;
import fdwonsangyeonver.BoundedContext583_6734693877551Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="주문_table")
@Data

public class 주문  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String preference;
    
    
    
    
    
    private String options;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        fdwonsangyeonver.external.결재 결재 = new fdwonsangyeonver.external.결재();
        // mappings goes here
        BoundedContext583_6734693877551Application.applicationContext.getBean(fdwonsangyeonver.external.결재Service.class)
            .결제(결재);


        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();



        주문취소됨 주문취소됨 = new 주문취소됨(this);
        주문취소됨.publishAfterCommit();



        카톡으로알림보냄 카톡으로알림보냄 = new 카톡으로알림보냄(this);
        카톡으로알림보냄.publishAfterCommit();



        메뉴추가됨 메뉴추가됨 = new 메뉴추가됨(this);
        메뉴추가됨.publishAfterCommit();



        주문상태를조회함 주문상태를조회함 = new 주문상태를조회함(this);
        주문상태를조회함.publishAfterCommit();



        주문상태가변경됨 주문상태가변경됨 = new 주문상태가변경됨(this);
        주문상태가변경됨.publishAfterCommit();



        앱통보함 앱통보함 = new 앱통보함(this);
        앱통보함.publishAfterCommit();

    }

    public static 주문Repository repository(){
        주문Repository 주문Repository = BoundedContext583_6734693877551Application.applicationContext.getBean(주문Repository.class);
        return 주문Repository;
    }




    public static void 주문상태변경(주문수락됨 주문수락됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문수락됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(주문거절됨 주문거절됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문거절됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(요리시작됨 요리시작됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리시작됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(요리완료됨 요리완료됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리완료됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(거래완료됨 거래완료됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(거래완료됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(배달시작됨 배달시작됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(배달시작됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 앱통보(배달접수pick앱통보함 배달접수pick앱통보함){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(배달접수pick앱통보함.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }


}
