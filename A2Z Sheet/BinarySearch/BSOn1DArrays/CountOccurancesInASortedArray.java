class CountOccurancesInASortedArray {
    public int countOccurrences(int[] arr, int target) {
       int low=0;
       int high=arr.length-1;
       int left=-1;
       int right=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            left=mid;
            high=mid-1;
        }
        else if(target<arr[mid])
        high=mid-1;
       
       else 
       low=mid+1;
    }

    low=0;
    high=arr.length-1;
     while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            right=mid;
            low=mid+1;
        }
        else if(target<arr[mid])
        high=mid-1;
       
       else 
       low=mid+1;
    }
    if(left==-1 && right==-1)
    return 0;

return right-left+1;
}
}
