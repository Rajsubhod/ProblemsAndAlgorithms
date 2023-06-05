// Searching for an element occurance in an array using loop

class Occurances1{
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int count=0;
        int[] arr = {4,5,2,5,1,7,2,5,5,4,8,5,2,6,5};
        for(int i:arr){
            if(i==5){
                count++;
            }
        }
        System.out.println(count);
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
    }
}

class Occurances2{
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int count=0;
        int[] arr = {4,5,2,5,1,7,2,5,5,4,8,5,2,6,5};
        int i,j;
        for(i=0,j=arr.length-1;i<=j;i++,j--){
            if(i==j && arr[i]==5 && arr[j]==5){
                count++;
            }
            else if(arr[i]==5 && arr[j]==5){
                count+=2;
            }
            else if(arr[j]==5){
                count++;
            }
            else if(arr[i]==5){
                count++;
            }
        }
        System.out.println(count);
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
    }
}


