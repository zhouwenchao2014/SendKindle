package cn.zhou.myhomespace.controller;

import cn.zhou.myhomespace.mapper.KindleEbookMapper;
import cn.zhou.myhomespace.po.KindleEbook;
import cn.zhou.myhomespace.utils.AnalysisHtml;
import org.apache.commons.codec.Decoder;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by zhouwenchao on 2016/12/9.
 */
@Controller
public class FindBookController {

    private final String BASEURL="http://120.26.102.2:8000/d/965cd17330/";

    private final String BASEHOST="http://120.26.102.2:8000";

    @Autowired
    private KindleEbookMapper kindleEbookMapper;

    @RequestMapping("/findAndSaveBook")
    public void findAndSaveBook(){
        Elements elements = AnalysisHtml.getElementsFromUrlByClassName("normal",BASEURL,"UTF-8");
        if(elements==null) return;
        for(Element element : elements){
            String href=element.attr("href");
            if(href.contains("?p=/")){
                String tag=element.text();
                Elements elementsp =AnalysisHtml.getElementsFromUrlByClassName("normal",BASEURL+href,"UTF-8");
                if(elementsp==null) return;
                for(Element elementp : elementsp){
                    String bookname= elementp.text();
                    System.out.println(bookname);
                    String hrefp=elementp.attr("href");
                    KindleEbook kindleEbook=new KindleEbook();
                    kindleEbook.setAuthor("");
                    kindleEbook.setBookName(bookname);
                    kindleEbook.setTag(bookname+","+tag);
                    kindleEbook.setType(tag);
                    kindleEbook.setUrl(BASEHOST+hrefp+"&dl=1");
                    kindleEbookMapper.insert(kindleEbook);
                }

            }
        }
    }
    @RequestMapping("/findbook")
    public void findbook(){
        List<KindleEbook> kindleEbooks = kindleEbookMapper.queryAll();
        for(KindleEbook kindleEbook : kindleEbooks){
            System.out.println(kindleEbook.toString());
        }
    }
}
