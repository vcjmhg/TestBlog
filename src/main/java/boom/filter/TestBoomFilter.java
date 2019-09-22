package boom.filter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

/**
 *
 * @description:
 * 测试BoomFilter的使用借助于Guva
 *
 * @author: vcjmhg
 *
 * @create: 2019/9/22
 **/
public class TestBoomFilter {
    public static void main(String[] args) {
        //创建布隆过滤器，传入期望处理的元素数量以及期望的误报率
        //注意需要设置String的默认字符编码
        BloomFilter<String> filter=BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()),100,0.01);
        //插入url集合
        String urls[]={"vcjmhg.top","example.com","vcjmhg.com","vcjmhg.cn","baidu.com","google.com"};

        for(int i=0;i<urls.length;i++){
            filter.put(urls[i]);
        }
        //我们添加了七个元素，并且定义了最大字符数量为500，因此我们过滤器会产生十分准确的结果
        //测试vcjmhg.top是否在urls集合中,以及其准确率
        System.out.println("vcjmhg.top是否在urls集合中"+filter.mightContain("vcjmhg.top"));
        System.out.println("vcjmg.top的测试准确率:"+filter.expectedFpp());
        //测试bing.com是否在urls集合中
        System.out.println("bing.com是否在urls集合中:"+filter.mightContain("bing.com"));
        System.out.println("bing.com此次的测试准确率:"+filter.expectedFpp());

    }
}
