public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int temp = 0;
        int var = 0;
        for (int i=0;i<gain.length;i++){
            var = var + gain[i];
            if (var > temp){
                temp = var;
            }
        }
        return temp;

    }
}
