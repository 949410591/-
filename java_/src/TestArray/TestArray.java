package TestArray;

public class TestArray {
    public static void main(String[] args) {
        int[] array1;
        //定义
        int[] array2 = {100,200,300};
        //静态初始化
        int[] array3 = new int[3];
        String[] array4 = new String[3];
        //动态初始化

        System.out.println(array4[2]);
        //读

        array4[2] = "没有";
        System.out.println(array4[2]);
        //改


        for(int i=0 ; i<array4.length;i++){

            System.out.println(array2[i]);
            System.out.println(array3[i]);
            System.out.println(array4[i]);

        }
        //正遍历

        for(int i=array4.length-1 ; i>=0; i--){

            System.out.println(array2[i]);
            System.out.println(array3[i]);
            System.out.println(array4[i]);

        }
        //反遍历 从最后一个元素开始，要注意最后一个元素的索引是数组长度减1
        for (int i = 0;i<args.length;i++){
            System.out.println(args[i]);

        }
        //遍历main方法中的参数args,这也是方法参数是数组时，改怎么使用数组参数的方法

        int[] array5 = {1,2,3};
        int[] array6 = new int[10];
        System.arraycopy(array5,0,array6,1,2);
        //数组扩容参数：源数组，拷贝起点，目标数组，粘贴起点，拷贝长度
        System.out.println("-----------------");
        for(int i=0; i<array5.length; i++){
            System.out.println(array5[i]);
        }

        for(int i=0; i<array5.length; i++){
            System.out.println(array6[i]);
        }

        //拷贝结果













    }
}
