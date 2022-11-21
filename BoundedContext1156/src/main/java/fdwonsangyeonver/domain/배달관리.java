package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.거래완료됨;
import fdwonsangyeonver.domain.배달시작됨;
import fdwonsangyeonver.domain.배달접수pick앱통보함;
import fdwonsangyeonver.BoundedContext1156Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="배달관리_table")
@Data

public class 배달관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        거래완료됨 거래완료됨 = new 거래완료됨(this);
        거래완료됨.publishAfterCommit();



        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        배달접수pick앱통보함 배달접수pick앱통보함 = new 배달접수pick앱통보함(this);
        배달접수pick앱통보함.publishAfterCommit();

    }

    public static 배달관리Repository repository(){
        배달관리Repository 배달관리Repository = BoundedContext1156Application.applicationContext.getBean(배달관리Repository.class);
        return 배달관리Repository;
    }




    public static void 배달목록추가(요리완료됨 요리완료됨){

        /** Example 1:  new item 
        배달관리 배달관리 = new 배달관리();
        repository().save(배달관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리완료됨.get???()).ifPresent(배달관리->{
            
            배달관리 // do something
            repository().save(배달관리);


         });
        */

        
    }


}
