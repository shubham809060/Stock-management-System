public class checkarrayequal {

        public static boolean isEqual(int[] arr1,int[] arr2){
            if(arr1.length!=arr2.length){
                return false;
            }
            else{
                for(int i=0;i<arr1.length;i++){
                    if(arr1[i]!=arr2[i]){
                        return false;
                    }
                }
            }
            return true;
        }
    public static void main(String[] args) {
        int[] arr1={2,3,4};
        int[] arr2={3,2,4};
        System.out.print(isEqual(arr1,arr2));
    }
}
