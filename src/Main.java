import java.util.*;
class Equilibrium{
    public void findEquilibrium(int arr[]){
        int psum[]=new int[arr.length];
        //
        boolean b=true;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }

        for(int j=1;j<arr.length;j++){
            if(arr[j-1]==arr[arr.length-1]-arr[j]){
                System.out.println(j);
                b=false;
                break;
            }

        }
        if(b){
            System.out.println(-1);
        }

    }

//  -7 1 5 2 -4 3 0
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Equilibrium equilibrium=new  Equilibrium();
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for (int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Prefix Sum");
        equilibrium.findEquilibrium(arr);


        //equilibrium.findEquilibrium(arr);

    }
}
