package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class queue_18258 {

    static LinkedList<Integer> queueSave = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();


    static void push(int pushData) {
        queueSave.add(pushData);

    }

    static void pop() {
        if(queueSave.isEmpty()) {
            sb.append(-1).append("\n");
        }else {
            sb.append(queueSave.pop()).append("\n");
        }
    }

    static void size() {
        if(queueSave.isEmpty()){
            sb.append(0).append("\n");
        }else {
            sb.append(queueSave.size()).append("\n");
        }
    }

    static void empty() {

        if (queueSave.isEmpty()) {
            sb.append(1).append("\n");

        } else {
            sb.append(0).append("\n");
        }

    }

    static void front() {
        if (queueSave.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queueSave.getFirst()).append("\n");
        }
    }

    static void back() {
        if (queueSave.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queueSave.getLast()).append("\n");
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String length = br.readLine();
        int queueLenth = Integer.parseInt(length);


        for (int i = 0; i < queueLenth; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String queueCommend = st.nextToken();
            if(st.hasMoreTokens()){
                push(Integer.parseInt(st.nextToken()));
            } else if (queueCommend.equals("pop")) { // pop 명령어
                pop();
            } else if (queueCommend.equals("size")) { // size 명령어
                size();
            } else if (queueCommend.equals("empty")) { // empty 명렁어
                empty();
            } else if (queueCommend.equals("front")) { // front 명령어
                front();
            } else if (queueCommend.equals(("back"))) { // back 명령어
                back();
            }
        }
        System.out.println(sb);

    }
}
