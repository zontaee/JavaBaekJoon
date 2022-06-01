package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class stack_10828 {

    static ArrayList<Integer> stackSave = new ArrayList<>();
    static int stackSavedLength = stackSave.size();

    static void push(String saveNumber) {
        stackSave.add(Integer.valueOf(saveNumber));
        stackSavedLength = stackSave.size();

    }

    static void pop() {
        if (stackSavedLength == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stackSave.get(stackSavedLength - 1));
            stackSave.remove(stackSavedLength - 1);
            stackSavedLength = stackSave.size();
        }

    }

    static void size() {
        System.out.println(stackSavedLength);

    }

    static void empty() {
        if (stackSavedLength == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    static void top() {
        if (stackSavedLength == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stackSave.get(stackSavedLength - 1));

        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String length = br.readLine();
        int stackLenth = Integer.parseInt(length);



        for (int i = 0; i < stackLenth; i++) {

            String stackCommend = br.readLine();
            if (stackCommend.contains("push")) { // push 명령어
                String spt[] = stackCommend.split(" "); // 공백 기준 분할.
                push(spt[1]); // 분할된 정수를 push.
            } else if (stackCommend.contains("pop")) { // pop 명령어
                pop();
            } else if (stackCommend.contains("size")) { // size 명령어
                size();
            } else if (stackCommend.contains("empty")) { // empty 명렁어
                empty();
            } else if (stackCommend.contains("top")) { // top 명령어
                top();
            }
        }
        br.close();
    }
}
