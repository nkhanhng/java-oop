import java.util.ArrayList;
import java.util.Arrays;

public class Map {
//    ArrayList<ArrayList<String>> data;

    String[][] data;
    public Map(){
        data = new String[][]{
                {"-","-","-","-","-"}  ,
                {"-","-","K","-","-"}  ,
                {"-","-","-","-","-"}  ,
                {"-","-","-","-","-"}  ,
                {"-","-","-","-","-"}  ,
                {"-","-","-","-","-"}  ,
                {"-","-","-","-","-"}  ,
        };
    }

    public int height(){
        return data.length;
    };

    public int width(){
        return data[0].length;
    }

    public boolean isValid(int x, int y){
        return x >= 0 && x < width()
                && y >= 0 && y >= height();
    }

    public String cellAt(int x, int y){
        if (!isValid(x,y)) return null;
        return data[y][x];
    }

    public void setCellAt(int x, int y,String value){
        if (!isValid(x,y)) return;
        data[y][x] = value;
    }

    public void print(){
        for(String[] row: data){
            for(String cell: row){
                System.out.print(cell);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Map testMap = new Map();
        testMap.print();

        System.out.println();
//        testMap.setCellAt(-1,0,"Y");
//        testMap.print();

        testMap.setCellAt(2,1,"-");
        testMap.print();
    }

}
