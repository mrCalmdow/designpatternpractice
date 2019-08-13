package com.flchen.testDemos;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Pattern;

/**
 * author: flchen
 * Date: 2019-08-12
 * Time: 15:46
 *
 * @Description:
 **/
@Slf4j
public class ParseTest {

    String text = "hello,#{name}.Iam#{name},welcometo#{countryName}....adfasdfa#{}####dsa";

    String regStr = "hello,#name#.Iam#name#,welcometo#{countryName}....adfasdfa#{}####dsa";

    public void testParse() {

        String parse = parse(text);
        log.info("Parse to : --> {}", parse);

        Pattern pattern = Pattern.compile("#\\w+#");
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = pattern.split(regStr);
        for (String s : split) {
            log.error("s  ---> " + s);
            stringBuilder.append(s);
        }
        log.error("result -- >" + stringBuilder.toString());

        String s = regStr.replaceAll("#\\w+#", "");
        log.error("s  --- > {}", s);
    }

    private String parse(String text) {
        String openToken = "#{";
        String closeToken = "}";

        StringBuilder builder = new StringBuilder();
        int start = text.indexOf(openToken);
        if (start == -1) {
            return text;
        }
        final char[] src = text.toCharArray();
        int offset = 0;
        while (-1 < start) {
            log.info("start --> {}", start);
            builder.append(src, offset, start - offset);
            log.info("builder --> {}", builder.toString());

            offset = start + openToken.length();
            int end = text.indexOf(closeToken, offset);
            offset = end + 1;
            log.info("offset --> {}", offset);
            start = text.indexOf(openToken, offset);
        }
        builder.append(src, offset, src.length - offset);

        return builder.toString();
    }

    public static void main(String[] args) {
        ParseTest parseTest = new ParseTest();
        parseTest.testParse();
    }
}
