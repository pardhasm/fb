package com.fb.arrays;

import com.fb.core.Test;

public class OrderChecker implements Test {
    @Override
    public void test() {
        int[] take = new int[]{1, 3, 5};
        int[] in = new int[]{2, 4, 6};
        int[] serve = new int[]{1, 2, 4, 6, 5, 3};
        System.out.println(check(take, in, serve));

        int[] take1 = new int[]{17, 8, 24};
        int[] in1 = new int[]{12, 19, 2};
        int[] serve1 = new int[]{17, 8, 12, 19, 24, 2};
        System.out.println(check(take1, in1, serve1));
    }

    private boolean check(int[] take, int[] in, int[] serve) {
        int t1=0, i1=0;
        for(int s=0; s< serve.length; s++){
            int ser = serve[s];
            if(t1 < take.length && ser == take[t1]){
              t1++;
            }else if(i1 < in.length && ser == in[i1]){
                i1++;
            }else{
                return false;
            }
        }
        return true;
    }
}
