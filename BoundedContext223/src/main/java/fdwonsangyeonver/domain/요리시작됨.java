package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 요리시작됨 extends AbstractEvent {

    private Long id;

    public 요리시작됨(주문처리 aggregate){
        super(aggregate);
    }
    public 요리시작됨(){
        super();
    }
}
