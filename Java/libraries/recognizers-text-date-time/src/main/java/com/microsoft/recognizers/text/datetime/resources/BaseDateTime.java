// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.microsoft.recognizers.text.datetime.resources;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class BaseDateTime {

    public static final String HourRegex = "(?<hour>00|01|02|03|04|05|06|07|08|09|0|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|1|2|3|4|5|6|7|8|9)(h)?";

    public static final String MinuteRegex = "(?<min>00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|0|1|2|3|4|5|6|7|8|9)(?!\\d)";

    public static final String DeltaMinuteRegex = "(?<deltamin>00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|0|1|2|3|4|5|6|7|8|9)";

    public static final String SecondRegex = "(?<sec>00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|0|1|2|3|4|5|6|7|8|9)";

    public static final String FourDigitYearRegex = "\\b(?<![$])(?<year>((1\\d|20)\\d{2})|2100)(?!\\.0\\b)\\b";

    public static final String IllegalYearRegex = "([-])({FourDigitYearRegex})([-])"
            .replace("{FourDigitYearRegex}", FourDigitYearRegex);

    public static final String RangeConnectorSymbolRegex = "(--|-|—|——|~|–)";

    public static final int MinYearNum = 1500;

    public static final int MaxYearNum = 2100;

    public static final int MaxTwoDigitYearFutureNum = 30;

    public static final int MinTwoDigitYearPastNum = 70;

    public static final ImmutableMap<String, Integer> DayOfMonthDictionary = ImmutableMap.<String, Integer>builder()
        .put("01", 1)
        .put("02", 2)
        .put("03", 3)
        .put("04", 4)
        .put("05", 5)
        .put("06", 6)
        .put("07", 7)
        .put("08", 8)
        .put("09", 9)
        .put("1", 1)
        .put("2", 2)
        .put("3", 3)
        .put("4", 4)
        .put("5", 5)
        .put("6", 6)
        .put("7", 7)
        .put("8", 8)
        .put("9", 9)
        .put("10", 10)
        .put("11", 11)
        .put("12", 12)
        .put("13", 13)
        .put("14", 14)
        .put("15", 15)
        .put("16", 16)
        .put("17", 17)
        .put("18", 18)
        .put("19", 19)
        .put("20", 20)
        .put("21", 21)
        .put("22", 22)
        .put("23", 23)
        .put("24", 24)
        .put("25", 25)
        .put("26", 26)
        .put("27", 27)
        .put("28", 28)
        .put("29", 29)
        .put("30", 30)
        .put("31", 31)
        .build();

    public static final ImmutableMap<String, String> VariableHolidaysTimexDictionary = ImmutableMap.<String, String>builder()
        .put("fathers", "-06-WXX-7-3")
        .put("mothers", "-05-WXX-7-2")
        .put("thanksgiving", "-11-WXX-4-4")
        .put("martinlutherking", "-01-WXX-1-3")
        .put("washingtonsbirthday", "-02-WXX-1-3")
        .put("canberra", "-03-WXX-1-1")
        .put("labour", "-09-WXX-1-1")
        .put("columbus", "-10-WXX-1-2")
        .put("memorial", "-05-WXX-1-4")
        .build();
}
