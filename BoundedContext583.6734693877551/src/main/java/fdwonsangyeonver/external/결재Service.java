package fdwonsangyeonver.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "BoundedContext766", url = "${api.url.BoundedContext766}")
public interface 결재Service {
    @RequestMapping(method= RequestMethod.POST, path="/결재")
    public void 결제(@RequestBody 결재 결재);
}

