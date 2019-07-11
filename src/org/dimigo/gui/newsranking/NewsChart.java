package org.dimigo.gui.newsranking;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsChart {

    public static Map<String, Map<String, List<String>>> getNewsChart(){

        Map<String, Map<String, List<String>>> selectData = new HashMap<>();
        Map<String, List<String>> data = new HashMap<>();
        Map<String, List<String>> urlData = new HashMap<>();

        Document doc = null;
        try {
            doc = Jsoup.connect("https://news.naver.com/main/ranking/popularDay.nhn?mid=etc&sid1=111").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements contentEle = doc.select("div.ranking_section").select("ol")
                .select("li").select("dl").select("dt").select("a");
        Elements titleEle = doc.select("div.content").select("h4").select("em");
        Elements urlEle = doc.select("div.content").select("ol")
                .select("li").select("dl").select("dt").select("a");

        List<String> titles = titleEle.eachText();
        List<String> keywords = contentEle.eachText();
        List<String> urls = urlEle.eachAttr("href");

        int j =0;

        for (int i=0;i<30;i++) {
            urls.set(i, "https://news.naver.com" + urls.get(i));
        }

        for(int i=0;i<6;i++){
            urlData.put(titles.get(i), urls.subList(j,j+5));
            j+=5;
        }

        j=0;

        for (int i = 0; i < 6; i++) {
            data.put(titles.get(i),keywords.subList(j,j+5));
            j+=5;
        }

        selectData.put("category", data);
        selectData.put("url", urlData);

        return selectData;
    }
}