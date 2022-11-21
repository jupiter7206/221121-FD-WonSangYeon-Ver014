package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문취소됨 extends AbstractEvent {

    private Long id;

    public 주문취소됨(주문 aggregate){
        super(aggregate);
    }
    public 주문취소됨(){
        super();
    }
}
