public class NextDayCalculator {
    public static boolean LeapYear(int year){
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static String Date(int day,int month,int year){
        String date = "";
        if (day < 0 || year < 0 || day > 31){
            date = "Nhap lai.";
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:

                    if (day == 31) {
                        if (month == 12) {
                            date = 1 + "/" + 1 + "/" + (year+1);
                        }
                    } else if (day ==31){
                        date = 1 + "/" + (month + 1) + "/" + year;
                    } else {
                        date = (day + 1) + "/" + month + year;
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    if(day == 30){
                        date = 1 + "/" + (month + 1) + "/" + year;
                    } else {
                        date = (day + 1) + "/" + month + year;
                    }
                    break;
                case 2:
                    if (LeapYear(year)){
                        if (day == 29 ){
                            date = 1 + "/" +  (month + 1) + "/" + year;
                        } else  {
                            date = (day + 1) + "/" + month + "/" + year;
                        }
                    }
                    else {
                        if (day == 28){
                            date = 1 + "/" +  (month + 1) + "/" + year;
                        } else if (day > 28) {
                            date = "nhap lai";
                        }
                        else {
                            date = (day + 1) + "/" + month + "/" +  year;
                        }

                }
                    break;
            }
        }
        return date;
    }

}
