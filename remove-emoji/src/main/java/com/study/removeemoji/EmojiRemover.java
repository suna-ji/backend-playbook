package com.study.removeemoji;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiRemover {

    /**
     * @param value
     * \P{L} : 모든 문자
     * \P{N} : 모든 숫자
     * \P{P} : 구두점
     * \P{Z} : 공백 및 공백류 문자
     */
    public static String removeNonStandardCharacters(String value) {
        String regex = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]";
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(value);
        return matcher.replaceAll("");
    }

    /**
     * @param value
     * \p{Cs}: 서러게이트 영역 (복합 이모지 포함).
     * \p{So}: 심볼(기타).
     */
    public static String removeOnlyEmojis(String value) {
        String regex = "[\\p{Cs}\\p{So}]";
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(value);
        return matcher.replaceAll("");
    }

}
