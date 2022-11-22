package cloudlvfooddeliveryapp.domain;

import cloudlvfooddeliveryapp.domain.Deliverycompleted;
import cloudlvfooddeliveryapp.domain.Picked;
import cloudlvfooddeliveryapp.DeliveryMgmtApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderid;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String foodName;
    
    
    
    
    
    private String qty;

    @PostPersist
    public void onPostPersist(){


        Deliverycompleted deliverycompleted = new Deliverycompleted(this);
        deliverycompleted.publishAfterCommit();



        Picked picked = new Picked(this);
        picked.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryMgmtApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }




    public static void addDeliveryList(Cooked cooked){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cooked.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
