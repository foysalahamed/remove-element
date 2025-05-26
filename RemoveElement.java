public class RemoveElement {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] item={0,1,2,2,3,0,4,2};
        System.out.println(solution.removeElement(item,2));

    }
}
class Solution{
    int removeElement(int num[],int val){
        int c=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                num[c++]=num[i];
            }
        }
        return c;

    }
}