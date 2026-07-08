class ReverseAnArray {
    public void reverse(int[] arr, int n) {
         reverse(arr,0,n-1);
    }

    private void reverse(int[] arr, int left, int right){
        if(left>=right)
        return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);
    }
}

