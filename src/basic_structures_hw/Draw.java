package basic_structures_hw;

public class Draw {
    private int size;
    private char[][] array;
    //constructor to create triangle
    public Draw(int size, char type){
        this.size=size;
        this.array=new char[size][size];
        switch(type){
            case 'A':
                for(int i=0; i<size;i++){
                    for(int j=0; j<size;j++){
                        if(j<=i)
                        array[i][j]='*';
                    }
                }
                break;
            case 'B':
                for (int i = 0; i < size; i++) {
                    for (int j =size-1-i; j>=0; j--){
                            array[i][j] = '*';}

                }
                break;
            case 'C':
                for (int i = 0; i < size; i++) {
                    for (int j =0+i; j<size; j++){
                        array[i][j] = '*';}

                }
                break;
            case 'D':
                for (int i = 0; i < size; i++) {
                    for (int j =size-1; j>=size-1-i; j--){
                        array[i][j] = '*';}

                }
                break;
        }
    }
    // draw our triangle
    public void getTriangle(){
        for(int i=0; i<size;i++){
            for(int j=0; j<size;j++){

                   System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
