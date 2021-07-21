package com.hc.summer.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;

/**
 * 取得给定汉字串的首字母串,即声母串 Title: ChineseCharToEn(含常用汉字，不常见汉字及多音字) 注：只支持GB2312字符集中的汉字
 *
 * @author wendiyou
 * @date 2021-06-07
 */
public class LetterUtil {

    protected final static Log logger = LogFactory.getLog(LetterUtil.class);

    public final static String CANNOTFIND = "CANNOTFIND";

    private final static int[] li_SecPosValue =
            {1601, 1637, 1833, 2078, 2274, 2302, 2433, 2594, 2787, 3106, 3212, 3472, 3635, 3722, 3730, 3858, 4027, 4086,
             4390, 4558, 4684, 4925, 5249, 5590};

    private final static String[] lc_FirstLetter =
            {"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "w", "x",
             "y", "z"};

    private static Map<String, String> exceptWords = new HashMap<String, String>();

    // 不转换的特殊字符
    private static final Character[] particularChars = new Character[]{
            // 英文输入
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
            '-', '_', '=', '+', '[', '{', ']', '}', '\\', '|',
            ';', ':', '\'', '"', ',', '<', '.', '>', '/', '?',
            '`', '~',
            // 中文输入
            '·', '~', '！', '￥', '…', '（', '）', '【', '】',
            '；', '：', '“', '，', '《', '。', '》', '、', '？',
            };

    private final static Set<Character> particularSet = new HashSet<Character>(Arrays.asList(particularChars));

    static {
        exceptWords.put("a", "%E5%BA%B5%E9%B3%8C%E5%97%B7");
        exceptWords.put("b", "%E7%92%A7%E4%BA%B3%E4%B8%A6%E4%BE%BC%E5%88%A5%E5%8C%82");
        exceptWords.put("c", "%E8%8C%8C%E4%B8%9E%E4%B8%92%E4%B8%B3%E5%88%85");
        exceptWords.put("d", "%E6%B8%8E%E7%A0%80%E6%A3%A3%E5%84%8B%E4%B8%9F");
        exceptWords.put("e", "");
        exceptWords.put("f", "%E9%82%A1%E5%86%B9%E5%85%9D");
        exceptWords.put("g",
                        "%E5%B4%AE%E8%97%81%E8%8E%9E%E4%B8%90%E4%B8%B1%E4%B9%A2%E4%BA%81%E4%BB%A0%E5%86%AE%E5%8C%83%E5%8C%84");
        exceptWords.put("h", "%E9%AA%85%E7%8F%B2%E6%BD%A2%E6%B9%9F%E4%B8%86%E5%86%B4%E5%8C%A2");
        exceptWords.put("j",
                        "%E6%B3%BE%E8%9B%9F%E6%9A%A8%E7%BC%99%E6%97%8C%E8%8E%92%E9%84%84%E4%B8%8C%E4%B8%A9%E4%B8%AE%E4%B8%AF%E4%B8%BC%E4%BA%85%E4%BC%8B%E5%86%8F%E5%8C%8A%E5%8C%9B%E5%8C%9E");
        exceptWords.put("k", "%E4%B8%82%E5%8C%9F");
        exceptWords.put("l",
                        "%E5%B4%82%E6%B6%9E%E6%A0%BE%E6%BA%A7%E6%BC%AF%E6%B5%8F%E8%80%92%E9%86%B4%E6%B3%B8%E9%98%86%E5%B4%83%E4%B8%A1%E5%88%A2%E5%8A%BD%E5%95%B0");
        exceptWords.put("m", "%E6%B8%91%E6%B1%A8%E4%B8%8F%E5%86%90%E5%86%BA%E5%85%9E%E5%86%87");
        exceptWords.put("n", "");
        exceptWords.put("o", "%E7%93%AF");
        exceptWords.put("p", "%E9%82%B3%E6%BF%AE%E9%83%AB%E4%B8%95%E4%BC%82%E5%86%B8");
        exceptWords.put("q",
                        "%E5%96%AC%E7%B6%A6%E8%A1%A2%E5%B2%90%E6%9C%90%E9%82%9B%E4%B8%A0%E4%B8%AC%E4%BA%9D%E5%86%BE%E5%85%9B%E5%8C%A4");
        exceptWords.put("r", "%E9%95%95%E7%91%A2%E6%A6%95%E5%88%84");
        exceptWords.put("s",
                        "%E6%B3%97%E7%9D%A2%E6%B2%AD%E5%B5%8A%E6%AD%99%E8%8E%98%E5%B5%A9%E9%84%AF%E4%B8%84%E4%B8%97%E4%BE%BA%E5%85%99");
        exceptWords.put("t", "%E6%BD%BC%E6%BB%95%E9%83%AF%E4%BA%A3%E4%BE%B9%E4%BE%BB");
        exceptWords.put("w", "%E5%A9%BA%E6%B6%A0%E6%B1%B6%E4%BA%BE%E4%BB%BC%E5%8D%8D%E5%8D%90");
        exceptWords
                .put("x", "%E9%91%AB%E7%9B%B1%E6%B5%94%E8%8D%A5%E6%B7%85%E6%B5%A0%E4%BA%B5%E4%B8%85%E4%BC%88%E5%85%87");
        exceptWords.put("y",
                        "%E6%87%BF%E7%9C%99%E9%BB%9F%E9%A2%8D%E5%85%96%E9%83%93%E5%81%83%E9%84%A2%E6%99%8F%E4%B8%A3%E4%BA%9C%E4%BC%87%E5%81%90%E5%86%86%E5%8C%9C");
        exceptWords.put("z", "%E6%A2%93%E6%B6%BF%E8%AF%8F%E6%9F%98%E7%A7%AD%E5%9C%B3%E4%BC%80%E5%86%91%E5%88%A3");
    }

    /**
     * 要处理的多音字
     */
    private final static String polyphoneTxt = "重庆|cq,音乐|yy";

    public static String getAllFirstLetter(String str) {
        return getAllFirstLetter(str, false);
    }

    /**
     * 取得给定汉字串的首字母串,即声母串
     *
     * @param str     给定汉字串
     * @param toUpper 是否转换为大写
     *
     * @return 声母串
     */
    public static String getAllFirstLetter(String str, boolean toUpper) {
        if (str == null || str.trim().length() == 0) {
            return "";
        }
        // 多音字判定
        for (String polyphone : polyphoneTxt.split(",")) {
            String[] chinese = polyphone.split("[|]");
            if (str.indexOf(chinese[0]) != -1) {
                str = str.replace(chinese[0], chinese[1]);
            }
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur >= 'a' && cur <= 'z' || cur >= 'A' && cur <= 'Z') {
                // 字母
                result += cur;
            } else if (cur >= '0' && cur <= '9') {
                // 数字
                result += cur;
            } else if (particularSet.contains(cur)) {
                // 不转换的特殊字符
                result += cur;
            } else {
                // 待转换字符：汉字
                if (toUpper) {
                    result += getFirstLetter(cur + "").toUpperCase();
                } else {
                    result += getFirstLetter(cur + "");
                }
            }
        }
        return result;
    }

    /**
     * 取得给定汉字的首字母,即声母
     *
     * @param chinese 给定的汉字
     *
     * @return 给定汉字的声母
     */
    private static String getFirstLetter(String chinese) {
        if (chinese == null || chinese.trim().length() == 0) {
            return "";
        }
        String chineseTemp = chinese;
        chinese = conversionStr(chinese, "GB2312", "ISO8859-1");

        boolean matched = false;//默认没有找到匹配的

        if (chinese.length() > 1) {
            // 判断是不是汉字
            int li_SectorCode = (int) chinese.charAt(0); // 汉字区码
            int li_PositionCode = (int) chinese.charAt(1); // 汉字位码
            li_SectorCode = li_SectorCode - 160;
            li_PositionCode = li_PositionCode - 160;
            int li_SecPosCode = li_SectorCode * 100 + li_PositionCode; // 汉字区位码
            if (li_SecPosCode > 1600 && li_SecPosCode < 5590) {
                for (int i = 0; i < 23; i++) {
                    if (li_SecPosCode >= li_SecPosValue[i] && li_SecPosCode < li_SecPosValue[i + 1]) {
                        chinese = lc_FirstLetter[i];
                        matched = true;//中文匹配到了字母
                        break;
                    }
                }
            } else {
                // 非汉字字符,如图形符号或ASCII码
                chinese = matchPinYin(chinese);
            }
        }
        // 如还是无法匹配，再次进行拼音匹配
        if (chinese.equals("?")) {
            chinese = matchPinYin(chineseTemp, false);
        }

        if (!matched) {
            chinese = LetterUtil.CANNOTFIND;//没有找到
        }

        return chinese;
    }

    /**
     * 汉字匹配拼音对照
     *
     * @param chinese
     *
     * @return
     */
    private static String matchPinYin(String chinese, boolean needConvert) {
        try {
            String chineseTemp = chinese;
            if (needConvert) {
                chinese = conversionStr(chinese, "ISO8859-1", "GB2312");
            }
            chinese = chinese.substring(0, 1);
            chinese = URLEncoder.encode(chinese, "utf-8");
            for (Entry<String, String> letterSet : exceptWords.entrySet()) {
                if (letterSet.getValue().indexOf(chinese) != -1) {
                    chinese = letterSet.getKey();
                    break;
                }
            }
            chinese = chineseTemp.equals(chinese) ? "?" : chinese;
        } catch (UnsupportedEncodingException e) {
            logger.error("汉字匹配拼音对照异常", e);
        }
        return chinese;
    }

    private static String matchPinYin(String chinese) {
        return matchPinYin(chinese, true);
    }

    /**
     * 字符串编码转换
     *
     * @param str           要转换编码的字符串
     * @param charsetName   原来的编码
     * @param toCharsetName 转换后的编码
     *
     * @return 经过编码转换后的字符串
     */
    private static String conversionStr(String str, String charsetName, String toCharsetName) {
        try {
            str = new String(str.getBytes(charsetName), toCharsetName);
        } catch (UnsupportedEncodingException ex) {
            ex.getMessage();
        }
        return str;
    }
}
