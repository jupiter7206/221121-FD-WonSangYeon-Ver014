package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 메뉴추가됨 extends AbstractEvent {

    private Long id;

    public 메뉴추가됨(주문 aggregate){
        super(aggregate);
    }
    public 메뉴추가됨(){
        super();
    }
}
