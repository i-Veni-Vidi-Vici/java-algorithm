package string.manipulation.excel_sheet_column_number_171;

public class Practice1 {
    public int titleToNumber(String columnTitle) {
        char[] val = columnTitle.toCharArray();
        int result =0;

        for(int i= 0; i<val.length; i++){
            result +=((int) val[i]-64) * Math.pow(26,val.length-1-i);
            System.out.println(result);
        }

        return result;
    }
    // 8ms
}
