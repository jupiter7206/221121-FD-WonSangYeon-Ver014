package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 거래완료됨 extends AbstractEvent {

    private Long id;

    public 거래완료됨(배달관리 aggregate){
        super(aggregate);
    }
    public 거래완료됨(){
        super();
    }
}
