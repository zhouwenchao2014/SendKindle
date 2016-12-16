package cn.zhou.myhomespace.generator;

import cn.zhou.myhomespace.utils.SendEmailWithFile;
import cn.zhou.myhomespace.utils.SendKindle;

import java.io.File;

/**
 * Created by zwc on 2016/12/13.
 */
public class SendKindTest {

    public static void main(String[] args) {
        SendEmailWithFile sendmail = new SendEmailWithFile();

        sendmail.setHost("smtp.163.com");
        sendmail.setUserName("sendkindleservice@163.com");
        sendmail.setPassWord("zwc160016ZWC2017");
        sendmail.setTo("8618368817487@KINDLE.com");
        //sendmail.setTo(email);
        sendmail.setFrom("sendkindleservice@163.com");
        sendmail.setSubject("kindle推送");
        sendmail.setContent("kind书籍黑客与画家sendkindleservice@163.com");
        // Mail sendmail = new
        // Mail("dujiang@sricnet.com","du_jiang@sohu.com","smtp.sohu.com","du_jiang","31415926","你好","胃，你好吗？");
        sendmail.attachfile("F:/kindle/cache/黑客与画家.mobi");
        boolean isSeand=sendmail.sendMail();
        if(isSeand){
            File file=new File("F://kindle//cache//黑客与画家.mobi");
            if(file.exists()){
                file.delete();
            }
        }
    }
}
