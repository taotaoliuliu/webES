package com.aebiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aebiz.Utils.PinYinUtils;
import com.aebiz.controller.KeyWordController;
import com.aebiz.dao.KeyWordDao;
import com.aebiz.service.KeyWordService;
import com.aebiz.vo.KeyWord;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class Demo {

	
	
	public static void main(String[] args) {
		
		

		
		 ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
		 
		                                              

 //KeyWordService service = (KeyWordService)ctx.getBean("keyWordService");
 
 
		 KeyWordDao bean = ctx.getBean(KeyWordDao.class);
 
 
 
		 KeyWord keyWord =new KeyWord();
	
	keyWord.setUuid(keyWord.genUuid());
	
	keyWord.setChineseName("小米手机");
	
	keyWord.setSimpleName(PinYinUtils.getPinYinHeadChar("小米手机"));
	
	
	keyWord.setFullName(PinYinUtils.getPingYin("小米手机"));
	
	keyWord.setClick(1);
	
	bean.addData(keyWord);
 
 
		 
		 
		// System.out.println(service);
		 System.out.println(bean);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	 // 返回中文的首字母  
    public static String getPinYinHeadChar(String str) {  
  
        String convert = "";  
        for (int j = 0; j < str.length(); j++) {  
            char word = str.charAt(j);  
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);  
            if (pinyinArray != null) {  
                convert += pinyinArray[0].charAt(0);  
            } else {  
                convert += word;  
            }  
        }  
        return convert;  
    }  
	
	// 将汉字转换为全拼  
    public static String getPingYin(String src) {  
  
        char[] t1 = null;  
        t1 = src.toCharArray();  
        String[] t2 = new String[t1.length];  
        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();  
          
        t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  
        t3.setVCharType(HanyuPinyinVCharType.WITH_V);  
        String t4 = "";  
        int t0 = t1.length;  
        try {  
            for (int i = 0; i < t0; i++) {  
                // 判断是否为汉字字符  
                if (java.lang.Character.toString(t1[i]).matches(  
                        "[\\u4E00-\\u9FA5]+")) {  
                    t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);  
                    t4 += t2[0];  
                } else  
                    t4 += java.lang.Character.toString(t1[i]);  
            }  
            // System.out.println(t4);  
            return t4;  
        } catch (BadHanyuPinyinOutputFormatCombination e1) {  
            e1.printStackTrace();  
        }  
        return t4;  
    }  
}
