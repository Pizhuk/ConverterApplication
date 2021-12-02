package main.com.converter.services;

public class ExtraServices {
    public boolean IsDouble(String str) {
        boolean bool = false;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3'
                    || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7'
                    || str.charAt(i)=='8' || str.charAt(i)=='9' || (str.charAt(i)=='.' && str.length()>1)) {
                bool = true;
            }
            else {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public boolean IsDoubleWithMinus(String str) {
        boolean bool = false;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3'
                    || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7'
                    || str.charAt(i)=='8' || str.charAt(i)=='9' || (str.charAt(i)=='-'&& str.length()>1) || (str.charAt(i)=='.' && str.length()>1)) {
                bool = true;
            }
            else {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
