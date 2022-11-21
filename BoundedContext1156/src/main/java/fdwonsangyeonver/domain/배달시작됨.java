package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 배달시작됨 extends AbstractEvent {

    private Long id;

    public 배달시작됨(배달관리 aggregate){
        super(aggregate);
    }
    public 배달시작됨(){
        super();
    }
}
