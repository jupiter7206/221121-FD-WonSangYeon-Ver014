package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 앱통보함 extends AbstractEvent {

    private Long id;

    public 앱통보함(주문 aggregate){
        super(aggregate);
    }
    public 앱통보함(){
        super();
    }
}
