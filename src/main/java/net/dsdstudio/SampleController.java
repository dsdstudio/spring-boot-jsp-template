package net.dsdstudio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bhkim on 2017. 1. 30..
 */
@Controller
public class SampleController {
    @RequestMapping(value = "/test.html")
    public String testPage() {
        return "test";
    }
}
