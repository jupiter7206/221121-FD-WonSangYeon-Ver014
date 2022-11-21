package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문수락됨 extends AbstractEvent {

    private Long id;

    public 주문수락됨(주문처리 aggregate){
        super(aggregate);
    }
    public 주문수락됨(){
        super();
    }
}
