package fdwonsangyeonver.infra;
import fdwonsangyeonver.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/배달관리")
@Transactional
public class 배달관리Controller {
    @Autowired
    배달관리Repository 배달관리Repository;





}
