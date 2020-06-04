package top.dfghhj.anhanx.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RequestMapping("/auth")
@Controller
public class OauthController {

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

//    @ResponseBody
//    @GetMapping("/login/code")
//    public String loginByCode(String code) {
//
//        return null;
//    }

}
