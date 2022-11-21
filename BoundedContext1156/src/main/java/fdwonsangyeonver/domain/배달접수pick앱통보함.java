package fdwonsangyeonver.domain;

import fdwonsangyeonver.domain.*;
import fdwonsangyeonver.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 배달접수pick앱통보함 extends AbstractEvent {

    private Long id;

    public 배달접수pick앱통보함(배달관리 aggregate){
        super(aggregate);
    }
    public 배달접수pick앱통보함(){
        super();
    }
}
