package programmers;

public class skillcheck {
    public static void main(String[] args) {
        System.out.println(solution("01029648721"));
    }

    public static String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length(); i++){
            if(i<phone_number.length()-4){
                answer+="*";
            }else{
                answer += phone_number.charAt(i);
            }
            
        }
        return answer;
    }
}
