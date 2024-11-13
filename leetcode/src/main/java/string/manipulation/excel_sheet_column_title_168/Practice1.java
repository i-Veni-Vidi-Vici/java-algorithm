package string.manipulation.excel_sheet_column_title_168;

public class Practice1 {
    public String convertToTitle(int columnNumber) {
        if(columnNumber < 27){
            return String.valueOf((char) (columnNumber%27+64));
        }

        int val = columnNumber/27;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<val; i++){
            sb.append("A");
        }
        char c= (char) (columnNumber%27+65);
        sb.append(c);

        return sb.toString();
    }
    // error
}
