package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.*;
import cloudlvfooddeliveryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;

    public Paid(Payment aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
