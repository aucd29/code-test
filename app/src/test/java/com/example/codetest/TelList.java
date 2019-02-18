package com.example.codetest;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by <a href="mailto:aucd29@hanwha.com">Burke Choi</a> on 2019. 2. 18. <p/>
 *
 * 문제 설명
 * ==
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *
 * 구조대 : 119
 * ==
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 *
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * ==
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 *
 * 입출력 예제
 * ==
 * phone_book	return
 * [119, 97674223, 1195524421]	false
 * [123,456,789]	            true
 * [12,123,1235,567,88]	        false
 *
 * 입출력 예 설명
 * ==
 * 입출력 예 #1
 * 앞에서 설명한 예와 같습니다.
 *
 * 입출력 예 #2
 * 한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true 입니다.
 *
 * 입출력 예 #3
 * 첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false 입니다.
 *
 */
public class TelList {
    @Test
    public void teltest() {
        String[] ex = new String[] { "119", "97674223", "1195524421" };
        System.out.println("res: " + solution(ex));

        ex = new String[] { "123", "456", "789" };
        System.out.println("res: " + solution(ex));

        ex = new String[] { "12", "123", "1235", "567", "88" };
        System.out.println("res: " + solution(ex));
    }

    public boolean solution(String[] data) {
        int i = 0;
        int size = data.length - 1;
        Arrays.sort(data);

        for(String d : data) {
            if (i == size) {
                return true;
            }

            String dest = data[i + 1];
            System.out.println("start with: " + dest + ", " + d);
            if (dest.startsWith(d)) {
                return false;
            }

            ++i;
        }

        return true;
    }
}
