
public class Formatter {

    public static String formatInput(String input) {

        String formatString;

        StringBuilder stringBuilder = new StringBuilder();

        char[] buffArr = input.trim().toCharArray();

        for (int x = 0; x < buffArr.length; x++) {

            if (x == 0 && buffArr[x] != ' ') {
                stringBuilder.append(String.valueOf(buffArr[x]).toUpperCase());
                continue;
            }

            if (x != 0) {

                if (buffArr[x-1] == ',' && buffArr[x] != ' ') {
                    stringBuilder.append(" ").append(String.valueOf(buffArr[x]).toLowerCase());
                    continue;
                }else if (buffArr[x] == ' ' && buffArr[x+1] == ',') {
                    stringBuilder.append("");
                    continue;
                }

                if ((buffArr[x-1] == '!' && buffArr[x] != ' ') | (buffArr[x-1] == '?' && buffArr[x] != ' ')) {
                    stringBuilder.append(" ").append(String.valueOf(buffArr[x]).toUpperCase());
                    continue;
                }else if (buffArr[x] == ' ' && buffArr[x+1] == '!' | buffArr[x] == ' ' && buffArr[x+1] == '?') {
                    stringBuilder.append("");
                    continue;
                }

                if (buffArr[x-1] == '’' && buffArr[x] != ' ') {
                    stringBuilder.append("").append(String.valueOf(buffArr[x]).toLowerCase());
                    continue;
                }else if (buffArr[x] == ' ' && buffArr[x+1] == '’') {
                    stringBuilder.append("");
                    continue;
                }

                if (x > 2) {
                    if (buffArr[x - 1] == ' ' && buffArr[x - 2] != '.') {
                        stringBuilder.append(String.valueOf(buffArr[x]).toLowerCase());
                        continue;
                    }else if (buffArr[x - 1] == ' ' && buffArr[x - 2] == '.') {
                        stringBuilder.append(String.valueOf(buffArr[x]).toUpperCase());
                        continue;
                    }else if (buffArr[x - 1] == '.' && buffArr[x] != ' ' && buffArr[x] != '.') {
                        stringBuilder.append(" ").append(String.valueOf(buffArr[x]).toUpperCase());
                        continue;
                    }else if (x < buffArr.length-1 && buffArr[x] == ' ' && buffArr[x+1] == '.') {
                        stringBuilder.append("");
                        continue;
                    }
                }
            }

            stringBuilder.append(String.valueOf(buffArr[x]));
        }

        formatString = stringBuilder.toString();

        return formatString;
    }
}