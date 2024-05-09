class CommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> temp = new HashSet<>();
        int[] out = new int[A.length];
        int count = 0;

        for(int i=0; i<A.length; i++){
            if(temp.contains(A[i])){
                count++;
            }else{
                temp.add(A[i]);
            }
            if(temp.contains(B[i])){
                count++;
            }else{
                temp.add(B[i]);
            }
            out[i] = count;
        }
        return out;
    }
}
