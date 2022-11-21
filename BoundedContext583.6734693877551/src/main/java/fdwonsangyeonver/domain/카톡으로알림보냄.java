package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 카톡으로알림보냄 extends AbstractEvent {

    private Long id;

    public 카톡으로알림보냄(주문 aggregate){
        super(aggregate);
    }
    public 카톡으로알림보냄(){
        super();
    }
}
