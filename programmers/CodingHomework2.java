package homework;

class CodingHomework2 {
    public String solution(int q, int r, String code) {
        
        String answer = "";

        for (int i = 0; r+q*i <= code.length(); i++) {
                answer += code.charAt(r+q*i);

            }
return answer;
    }
}