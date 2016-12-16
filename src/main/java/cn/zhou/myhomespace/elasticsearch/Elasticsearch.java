package cn.zhou.myhomespace.elasticsearch;

import cn.zhou.myhomespace.utils.FileReadUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by zhouwenchao on 2016/12/8.
 */
public class Elasticsearch {

    private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void build(){

        Settings settings = Settings.builder()
                .put("cluster.name", "logAnalyseCluster").put("node.name","es675").build();
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        try {
            client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.6.75"), 9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String fileContent = FileReadUtils.fileReadFromPathFile("/Users/zhouwenchao/Downloads","log.log");
        JSONArray jasonObject = JSONObject.parseArray(fileContent);
        int size=jasonObject.size();
        for(int i=0;i<size;i++){
            Object o=jasonObject.get(i);
            Map<String,Object> content= (Map<String, Object>) o;

            try {
                XContentBuilder xContentBuilder =XContentFactory.jsonBuilder()
                    .startObject();
                for(String key : content.keySet()){
                    xContentBuilder.field(key,content.get(key).toString());
                    if("create".equals(key)){
                        xContentBuilder.field("createTimeCreate",simpleDateFormat.format(new Date(Long.parseLong(content.get(key).toString()))));
                    }
                }
                xContentBuilder.endObject();

                IndexResponse response = client.prepareIndex("memcached", "4001603400", "1")
                        .setSource(xContentBuilder)
                        .get();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        build();
    }
}
