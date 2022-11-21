package fdwonsangyeonver.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="메뉴판_table")
@Data
public class 메뉴판 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}