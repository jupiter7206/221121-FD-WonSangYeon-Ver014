package fdwonsangyeonver.domain;

import fdwonsangyeonver.BoundedContext1111_6666666666667Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="메뉴선택Preference_table")
@Data

public class 메뉴선택Preference  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String count;


    public static 메뉴선택PreferenceRepository repository(){
        메뉴선택PreferenceRepository 메뉴선택PreferenceRepository = BoundedContext1111_6666666666667Application.applicationContext.getBean(메뉴선택PreferenceRepository.class);
        return 메뉴선택PreferenceRepository;
    }




    public static void 메뉴추가(메뉴추가됨 메뉴추가됨){

        /** Example 1:  new item 
        메뉴선택Preference 메뉴선택Preference = new 메뉴선택Preference();
        repository().save(메뉴선택Preference);

        */

        /** Example 2:  finding and process
        
        repository().findById(메뉴추가됨.get???()).ifPresent(메뉴선택Preference->{
            
            메뉴선택Preference // do something
            repository().save(메뉴선택Preference);


         });
        */

        
    }


}
