package cn.gaoyuan.demo.jieba;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.WordDictionary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/12 14:57
 * @desc
 */
public class JiebaTest {

    public static void main(String[] args) {
        String text = "加载自定义词库的信息，开始做自定义词库的分词" ;
        System.out.println( "Jeba 分词  -------------" );
//        System.out.println(segmenter.process( text , JiebaSegmenter.SegMode.INDEX).toString());
        System.out.println("加载自定义词库的信息，开始做自定义词库的分词------->>>>>>>>");
        //加载自定义的词典进词库
        WordDictionary.getInstance().freqs.put("自定",WordDictionary.getInstance().getFreq("自定"));
        WordDictionary.getInstance().freqs.put("库的",WordDictionary.getInstance().getFreq("库的"));
//        WordDictionary.getInstance().loadUserDict( path )
        //重新分词
        JiebaSegmenter segmenter = new JiebaSegmenter();
        List<String> strings = segmenter.sentenceProcess(text);
        System.out.println(strings);
//        System.out.println(segmenter.process( text , JiebaSegmenter.SegMode.SEARCH).toString());
    }
}
