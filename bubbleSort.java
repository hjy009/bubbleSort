package GptalkTest;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={13,16,17,18,16,14,15,12,25,21,26};
		bubbleSortPrt(arr);
	}
//排序函数
    public static void bubbleSort(int arr[]) {
    	 //冒泡算法
        for(int i=arr.length-1 ; i >=0 ; i--) { 
            for(int j=0 ; j<=i-1 ; j++) {  
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            	}
            }    
        }
    }
//排序打印函数
    public static void bubbleSortPrt(int arr[]) {
		int[] idx1 = {1,2,3,4,5,6,7,8,9,10,11};
		int[] idx2 = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.printf( "原序号： ");
		for (int i=0;  i<=arr.length-1;i++ ) {
			System.out.printf( "%3d, ",idx1[i]);
		}
		System.out.println( "");
		System.out.printf( "原序列： ");
		for (int i=0;  i<=arr.length-1;i++ ) {
			System.out.printf( "%3d, ",arr[i]);
		}
   	 //冒泡算法
        for(int i=arr.length-1 ; i >=0 ; i--) { 
            for(int j=0 ; j<=i-1 ; j++) {  
                if(arr[j]>arr[j+1]) {
                	//交换数据
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //交换序号
                    temp = idx2[j];
                    idx2[j]=idx2[j+1];
                    idx2[j+1]=temp;
            	}
            }    
        }
		System.out.println( "\n排序后");

		System.out.printf( "后序号： ");
		for (int i=0;  i<=arr.length-1;i++ ) {
			System.out.printf( "%3d, ",idx2[i]);
		}
		System.out.println( "");
		System.out.printf( "后序列： ");
		for (int i=0;  i<=arr.length-1;i++ ) {
			System.out.printf( "%3d, ",arr[i]);
		}

		System.out.println( "");
		
    }

	
}
