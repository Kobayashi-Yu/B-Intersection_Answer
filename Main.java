import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int all = 2*N;
        int[] num = new int[all]; 
        for(int i=0;i<all;i++){
            num[i]= scanner.nextInt();
        }
        int[] Even = new int[N];
        int[] Odd = new int[N];
        int e =0;
        int o =0;
        for(int j=0;j<all;j++){
            if(j%2== 0){
                Even[e] = num[j];
                e++;
            }else{
                Odd[o] = num[j];
                o++;
            }
        }
        /*
        System.out.println("偶数");
        for(int k=0;k<N;k++){
            System.out.println(Even[k]);
        }
        System.out.println("奇数");
        for(int r=0;r<N;r++){
            System.out.println(Odd[r]);
        }
        */
        List<Integer> list = new ArrayList<>();
        int kaisu = Even.length/2;
        for(int k=0; k< kaisu; k++){
            int a = k*2 ;
            System.out.println("==========");
            System.out.println("Even:"+Even[a]);
            System.out.println("Evenk+1:"+Even[a+1]);
            System.out.println("==========");
            int sub = Even[a+1] - Even[a];
            System.out.println("====sub======");
            System.out.println(sub);
            System.out.println("==========");
            int sum = Even[a];
            System.out.println("====sum======");
            System.out.println(sum);
            System.out.println("==========");
            for (int r = 0;r <= sub;r++){
                list.add(sum);
                sum += 1;
            }
        }
        for(int l =0;l<kaisu;l++){
            int b =l*2;
            System.out.println("==========");
            System.out.println("Odd:"+Odd[b]);
            System.out.println("Odd+1:"+Odd[b+1]);
            System.out.println("==========");
            int sub = Odd[b+1] - Odd[b];
            System.out.println("====sub======");
            System.out.println(sub);
            System.out.println("==========");
            int sum = Odd[b];
            System.out.println("====sum======");
            System.out.println(sum);
            System.out.println("==========");
            for (int r = 0; r<=sub;r++){
                list.add(sum);
                sum +=1;
            }
        }



        System.out.println("=====Even======");
        System.out.println(list);
        System.out.println("===========");

        List<Integer> list2 = new ArrayList<>();
        int count = 0;
        for(int i =0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) == list.get(j)){
                    count++;
                    if(count >= N-1){
                        list2.add(list.get(i));
                    }
                }
            }
        }
        System.out.println("=====重複した数字======");
        System.out.println(list2);
        System.out.println("====================");
        System.out.println("====重複した数字の数====");
        System.out.println(list2.size());
        System.out.println("=====================");
    }
}
