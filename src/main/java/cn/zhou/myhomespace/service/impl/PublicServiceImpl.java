package cn.zhou.myhomespace.service.impl;

import cn.zhou.myhomespace.mapper.KindleEbookMapper;
import cn.zhou.myhomespace.po.KindleEbook;
import cn.zhou.myhomespace.service.PublicService;
import cn.zhou.myhomespace.utils.DownLoadFile;
import cn.zhou.myhomespace.utils.SendKindle;
import net.sf.cglib.core.CollectionUtils;
import org.apache.lucene.util.CollectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhouwenchao on 2016/12/2.
 */
@Service("publicService")
public class PublicServiceImpl implements PublicService{

    @Autowired
    private SendKindle sendKindle;

    @Autowired
    private KindleEbookMapper kindleEbookMapper;

    public String publicService(String message) {
        String[] mes=message.split("\\|\\|");
        if(mes.length<3){
            return "格式错误,请按如下格式发送:关键字||书名||kindle邮箱,如:SendKindle||白夜行||XXXX@KINDLE.com";
        }
        boolean isSend=false;
        KindleEbook kindleEbook=new KindleEbook();
        kindleEbook.setBookName(mes[1]);
        List<KindleEbook> kindleEbooks= kindleEbookMapper.queryByParam(mes[1]);
        if(kindleEbooks!=null&&kindleEbooks.size()!=0){
            boolean isdown=DownLoadFile.downLoadFileWithPath(kindleEbooks.get(0).getUrl(),kindleEbooks.get(0).getBookName(),sendKindle.getDownloadPath());
            if (isdown&&mes[0].equals("SendKindle")) {
                isSend = sendKindle.sendKindle(mes[2], mes[1]);
            }
            if(isSend){
                return "发送成功";
            }else{
                return "发送失败!电子书不存在或者邮箱错误";
            }
        }else{
            return "此书不存在";
        }


    }
}
