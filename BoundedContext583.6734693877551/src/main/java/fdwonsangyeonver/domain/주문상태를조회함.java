package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문상태를조회함 extends AbstractEvent {

    private Long id;

    public 주문상태를조회함(주문 aggregate){
        super(aggregate);
    }
    public 주문상태를조회함(){
        super();
    }
}
