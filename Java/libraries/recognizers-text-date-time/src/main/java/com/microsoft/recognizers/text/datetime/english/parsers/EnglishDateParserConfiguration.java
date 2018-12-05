package com.microsoft.recognizers.text.datetime.english.parsers;

import com.google.common.collect.ImmutableMap;
import com.microsoft.recognizers.text.IExtractor;
import com.microsoft.recognizers.text.IParser;
import com.microsoft.recognizers.text.datetime.config.BaseOptionsConfiguration;
import com.microsoft.recognizers.text.datetime.english.extractors.EnglishDateExtractorConfiguration;
import com.microsoft.recognizers.text.datetime.extractors.IDateTimeExtractor;
import com.microsoft.recognizers.text.datetime.parsers.IDateTimeParser;
import com.microsoft.recognizers.text.datetime.parsers.config.ICommonDateTimeParserConfiguration;
import com.microsoft.recognizers.text.datetime.parsers.config.IDateParserConfiguration;
import com.microsoft.recognizers.text.datetime.resources.EnglishDateTime;
import com.microsoft.recognizers.text.datetime.utilities.IDateTimeUtilityConfiguration;
import com.microsoft.recognizers.text.utilities.Match;
import com.microsoft.recognizers.text.utilities.RegExpUtility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.regex.Pattern;

public class EnglishDateParserConfiguration extends BaseOptionsConfiguration implements IDateParserConfiguration {

    public EnglishDateParserConfiguration(ICommonDateTimeParserConfiguration config) {

        super(config.getOptions());

        dateTokenPrefix = EnglishDateTime.DateTokenPrefix;

        integerExtractor = config.getIntegerExtractor();
        ordinalExtractor = config.getOrdinalExtractor();
        cardinalExtractor = config.getCardinalExtractor();
        numberParser = config.getNumberParser();

        durationExtractor = config.getDurationExtractor();
        dateExtractor = config.getDateExtractor();
        durationParser = config.getDurationParser();

        dateRegexes = Collections.unmodifiableList(EnglishDateExtractorConfiguration.DateRegexList);
        onRegex = EnglishDateExtractorConfiguration.OnRegex;
        specialDayRegex = EnglishDateExtractorConfiguration.SpecialDayRegex;
        specialDayWithNumRegex = EnglishDateExtractorConfiguration.SpecialDayWithNumRegex;
        nextRegex = EnglishDateExtractorConfiguration.NextDateRegex;
        thisRegex = EnglishDateExtractorConfiguration.ThisRegex;
        lastRegex = EnglishDateExtractorConfiguration.LastDateRegex;
        unitRegex = EnglishDateExtractorConfiguration.DateUnitRegex;
        weekDayRegex = EnglishDateExtractorConfiguration.WeekDayRegex;
        monthRegex = EnglishDateExtractorConfiguration.MonthRegex;
        weekDayOfMonthRegex = EnglishDateExtractorConfiguration.WeekDayOfMonthRegex;
        forTheRegex = EnglishDateExtractorConfiguration.ForTheRegex;
        weekDayAndDayOfMonthRegex = EnglishDateExtractorConfiguration.WeekDayAndDayOfMonthRegex;
        relativeMonthRegex = EnglishDateExtractorConfiguration.RelativeMonthRegex;
        relativeWeekDayRegex = EnglishDateExtractorConfiguration.RelativeWeekDayRegex;

        yearSuffix = EnglishDateExtractorConfiguration.YearSuffix;
        unitMap = config.getUnitMap();
        dayOfMonth = config.getDayOfMonth();
        dayOfWeek = config.getDayOfWeek();
        monthOfYear = config.getMonthOfYear();
        cardinalMap = config.getCardinalMap();
        utilityConfiguration = config.getUtilityConfiguration();

        relativeDayRegex = RegExpUtility.getSafeRegExp(EnglishDateTime.RelativeDayRegex, Pattern.CASE_INSENSITIVE);
        nextPrefixRegex = RegExpUtility.getSafeRegExp(EnglishDateTime.NextPrefixRegex, Pattern.CASE_INSENSITIVE);
        pastPrefixRegex = RegExpUtility.getSafeRegExp(EnglishDateTime.PastPrefixRegex, Pattern.CASE_INSENSITIVE);
    }

    private final String dateTokenPrefix;
    private final IExtractor integerExtractor;
    private final IExtractor ordinalExtractor;
    private final IExtractor cardinalExtractor;
    private final IParser numberParser;
    private final IDateTimeExtractor durationExtractor;
    private final IDateTimeExtractor dateExtractor;
    private final IDateTimeParser durationParser;
    private final Iterable<Pattern> dateRegexes;

    private final Pattern onRegex;
    private final Pattern specialDayRegex;
    private final Pattern specialDayWithNumRegex;
    private final Pattern nextRegex;
    private final Pattern thisRegex;
    private final Pattern lastRegex;
    private final Pattern unitRegex;
    private final Pattern weekDayRegex;
    private final Pattern monthRegex;
    private final Pattern weekDayOfMonthRegex;
    private final Pattern forTheRegex;
    private final Pattern weekDayAndDayOfMonthRegex;
    private final Pattern relativeMonthRegex;
    private final Pattern yearSuffix;
    private final Pattern relativeWeekDayRegex;

    private final ImmutableMap<String, String> unitMap;
    private final ImmutableMap<String, Integer> dayOfMonth;
    private final ImmutableMap<String, Integer> dayOfWeek;
    private final ImmutableMap<String, Integer> monthOfYear;
    private final ImmutableMap<String, Integer> cardinalMap;
    private final IDateTimeUtilityConfiguration utilityConfiguration;

    // The following three regexes only used in this configuration
    // They are not used in the base parser, therefore they are not extracted
    // If the spanish date parser need the same regexes, they should be extracted
    private final Pattern relativeDayRegex;
    private final Pattern nextPrefixRegex;
    private final Pattern pastPrefixRegex;

    @Override
    public String getDateTokenPrefix() {
        return dateTokenPrefix;
    }

    @Override
    public IExtractor getIntegerExtractor() {
        return integerExtractor;
    }

    @Override
    public IExtractor getOrdinalExtractor() {
        return ordinalExtractor;
    }

    @Override
    public IExtractor getCardinalExtractor() {
        return cardinalExtractor;
    }

    @Override
    public IParser getNumberParser() {
        return numberParser;
    }

    @Override
    public IDateTimeExtractor getDurationExtractor() {
        return durationExtractor;
    }

    @Override
    public IDateTimeExtractor getDateExtractor() {
        return dateExtractor;
    }

    @Override
    public IDateTimeParser getDurationParser() {
        return durationParser;
    }

    @Override
    public Iterable<Pattern> getDateRegexes() {
        return dateRegexes;
    }

    @Override
    public Pattern getOnRegex() {
        return onRegex;
    }

    @Override
    public Pattern getSpecialDayRegex() {
        return specialDayRegex;
    }

    @Override
    public Pattern getSpecialDayWithNumRegex() {
        return specialDayWithNumRegex;
    }

    @Override
    public Pattern getNextRegex() {
        return nextRegex;
    }

    @Override
    public Pattern getThisRegex() {
        return thisRegex;
    }

    @Override
    public Pattern getLastRegex() {
        return lastRegex;
    }

    @Override
    public Pattern getUnitRegex() {
        return unitRegex;
    }

    @Override
    public Pattern getWeekDayRegex() {
        return weekDayRegex;
    }

    @Override
    public Pattern getMonthRegex() {
        return monthRegex;
    }

    @Override
    public Pattern getWeekDayOfMonthRegex() {
        return weekDayOfMonthRegex;
    }

    @Override
    public Pattern getForTheRegex() {
        return forTheRegex;
    }

    @Override
    public Pattern getWeekDayAndDayOfMonthRegex() {
        return weekDayAndDayOfMonthRegex;
    }

    @Override
    public Pattern getRelativeMonthRegex() {
        return relativeMonthRegex;
    }

    @Override
    public Pattern getYearSuffix() {
        return yearSuffix;
    }

    @Override
    public Pattern getRelativeWeekDayRegex() {
        return relativeWeekDayRegex;
    }

    @Override
    public ImmutableMap<String, String> getUnitMap() {
        return unitMap;
    }

    @Override
    public ImmutableMap<String, Integer> getDayOfMonth() {
        return dayOfMonth;
    }

    @Override
    public ImmutableMap<String, Integer> getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public ImmutableMap<String, Integer> getMonthOfYear() {
        return monthOfYear;
    }

    @Override
    public ImmutableMap<String, Integer> getCardinalMap() {
        return cardinalMap;
    }

    @Override
    public IDateTimeUtilityConfiguration getUtilityConfiguration() {
        return utilityConfiguration;
    }

    @Override
    public Integer getSwiftDay(String text) {

        String trimmedText = text.trim().toLowerCase();
        Integer swift = 0;

        Optional<Match> match = Arrays.stream(RegExpUtility.getMatches(relativeDayRegex, text)).findFirst();

        if (trimmedText.equals("today")) {
            swift = 0;
        } else if (trimmedText.equals("tomorrow") || trimmedText.equals("tmr")) {
            swift = 1;
        } else if (trimmedText.equals("yesterday")) {
            swift = -1;
        } else if (trimmedText.endsWith("day after tomorrow") || trimmedText.endsWith("day after tmr")) {
            swift = 2;
        } else if (trimmedText.endsWith("day before yesterday")) {
            swift = -2;
        } else if (match.isPresent()) {
            swift = getSwift(text);
        }

        return swift;
    }

    @Override
    public Integer getSwiftMonth(String text) {
        return getSwift(text);
    }

    private Integer getSwift(String text) {

        String trimmedText = text.trim().toLowerCase();
        Integer swift = 0;

        Optional<Match> matchNext = Arrays.stream(RegExpUtility.getMatches(nextPrefixRegex, trimmedText)).findFirst();
        Optional<Match> matchPast = Arrays.stream(RegExpUtility.getMatches(pastPrefixRegex, trimmedText)).findFirst();

        if (matchNext.isPresent()) {
            swift = 1;
        } else if (matchPast.isPresent()) {
            swift = -1;
        }

        return swift;
    }

    @Override
    public Boolean isCardinalLast(String text) {
        String trimmedText = text.trim().toLowerCase();
        return trimmedText.equals("last");
    }
}
