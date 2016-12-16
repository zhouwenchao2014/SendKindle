package cn.zhou.myhomespace.controller;

import cn.zhou.myhomespace.service.PublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by zhouw on 2016/12/8.
 */
@Controller
public class SendKindleController {

    @Autowired
    private PublicService publicService;

    @RequestMapping("/checkToken")
    public @ResponseBody String validate(HttpServletRequest request) throws ParseException, IOException {
        String token=request.getParameter("Token");
        return token;
    }

    @RequestMapping("/sendView")
    public String sendView(){
        return "send";
    }
    @RequestMapping("/send")
    public void send(){
        String message=publicService.publicService("SendKindle||万物简史.mobi||8618368817487@KINDLE.com");
        System.out.println(message);
    }
    @RequestMapping("/sendBook")
    @ResponseBody
    public String sendBook(HttpServletRequest request){
        String bookName=request.getParameter("bookName");
        String kindleEmail=request.getParameter("kindleEmail");
        String message=publicService.publicService("SendKindle||"+bookName+"||"+kindleEmail);
        return message;
    }
    @RequestMapping("/sendBookWeb")
    @ResponseBody
    public String sendBookWeb(HttpServletRequest request){
        System.out.println(request.getParameter("message"));
        return request.getParameter("message");
        //String message=publicService.publicService("SendKindle||万物简史.mobi||8618368817487@KINDLE.com");
        //System.out.println(message);
    }
}
