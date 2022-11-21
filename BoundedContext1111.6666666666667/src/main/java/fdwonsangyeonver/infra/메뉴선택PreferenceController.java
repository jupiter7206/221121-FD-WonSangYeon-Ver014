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
// @RequestMapping(value="/메뉴선택Preferences")
@Transactional
public class 메뉴선택PreferenceController {
    @Autowired
    메뉴선택PreferenceRepository 메뉴선택PreferenceRepository;



}
