package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 결제취소됨 extends AbstractEvent {

    private Long id;

    public 결제취소됨(결재 aggregate){
        super(aggregate);
    }
    public 결제취소됨(){
        super();
    }
}
