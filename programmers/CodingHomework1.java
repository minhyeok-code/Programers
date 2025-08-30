package homework;

import java.util.Arrays;

class CodingHomework1 {

    public int solution(int[] arr) {
        int answer = 0;
        int[] arrCheck = new int[arr.length]; //x번째가 될 친구..
        boolean isSame = true;   // x와 x+1 같은지 확인하기 위히ㅣㅁ
        int correct = 0;

        //배열속 하나하나 순서대로 비교하기 위해서...
        Arrays.sort(arr);
        Arrays.sort(arrCheck);

        //x반복과 x+1 반복이 같은지 -->... 필요성이 있는가..?
        if(arr.length != arrCheck.length){
            isSame = false;
        }else {
            for (int i = 0; i < arr.length; i++) {
              if( arr[i] != arrCheck[i] ){
                  isSame = false;
              }
            }
        }

        //x와 x+1이 같지 않으면 반복..
        //같으면 탈출하게 됨...
        //x +1 -> x+1 +1 ture break -2가 되어야 하지...
        while (isSame == false) {

            //이전 arr과 메서드 실행 후 arr을 비교..
            //true가 나오더라도... ++이 한 번더 실행돼... break 걸 수 있나.....?
            if(arr.length == arrCheck.length){
                isSame = true;
            }else {
                for (int i = 0; i < arr.length; i++) {
                    if( arr[i] == arrCheck[i] ){
                        isSame = false;
                    }
                }
            }

            //arr을 arrCheck에 이식..
            for (int i = 0; i < arr[i]; i++) {
                arrCheck[i] = arr[i] ;
            }

            //arr 배열 메서드 실행.....
                for (int i : arr) {
                    if (i >= 50 && i % 2 == 0) {
                        i /= 2;              // 50위 짝수이면 나누기 2
                    } else if (i < 50 && i % 2 == 1) {
                        i = i * 2 + 1;      //50밑 홀수이면 곱2 플1
                    } else i = i;           //뭣도 아니면 냅두기..
                    arr[i] = i;

                }Arrays.sort(arr);          //값이 바껴 배열 순서가 엉망이 되었으니 다시 정렬
            answer++;

        }
        return answer-2; //-2여야하나........ 이게맞나;;;;;

    }
}


