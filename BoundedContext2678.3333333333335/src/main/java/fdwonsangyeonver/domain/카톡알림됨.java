package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 카톡알림됨 extends AbstractEvent {

    private Long id;

    public 카톡알림됨(알림 aggregate){
        super(aggregate);
    }
    public 카톡알림됨(){
        super();
    }
}
