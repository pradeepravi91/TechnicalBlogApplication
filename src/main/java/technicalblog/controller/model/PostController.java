package technicalblog.controller.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {


    @RequestMapping("posts")
    public String getUserPost(){
       return "posts";
    }
}
