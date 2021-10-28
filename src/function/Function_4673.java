package function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Function_4673 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= 10000; i++) {
            arrayList.add(i);
        }
        int i = 1;
        int sum=0;
        while (true) {
            sum = i;
            int num =i;    //<-- 이걸 안해주면 무한루프 돈다.
            while (true) {
                if (num != 0) {
                    sum+= num % 10;
                    num = num / 10;
                } else
                    break;
            }
            if (i> 10000)
                break;
            i++;
            set.add(sum);

        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            arrayList.remove(Integer.valueOf(iter.next()));
        }
        for (int k = 0; k < arrayList.size(); k++) {
        System.out.println(arrayList.get(k)); }
    }
}
//이걸 풀면서 Arraylist 나 set을 좀더 이해한거같다.