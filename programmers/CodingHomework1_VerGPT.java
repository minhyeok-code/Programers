package homework;

import java.util.Arrays;

class CodingHomework1_VerGPT {
        public int solution(int[] arr) {
            int x = 0;

            //arr을 cur에 카피
            int[] cur = Arrays.copyOf(arr, arr.length);

            // ->>> 굳이 조건문을 쓰지않고 무한루프로 만든다음 if문으로 같을 때 리턴받고 끝내버리기.....
            while (true) {
                //지역변수로 next배열에 cur을 또 카피
                int[] next = new int[cur.length];

                //문제 조건? 실행? next에 변환된 값 입력
                for (int i = 0; i < cur.length; i++) {
                    int v = cur[i];
                    if (v >= 50 && v % 2 == 0) next[i] = v / 2;
                    else if (v < 50 && v % 2 == 1) next[i] = v * 2 + 1;
                    else next[i] = v;
                }

                //
                if (Arrays.equals(cur, next)) return x; //비교를 먼저하고 같으면 x리턴으로 끝!
                cur = next;  //값을 카피받고.. --> 근데 이렇게 카피해도 되나..?
                x++;   //
            }
        }
    }

