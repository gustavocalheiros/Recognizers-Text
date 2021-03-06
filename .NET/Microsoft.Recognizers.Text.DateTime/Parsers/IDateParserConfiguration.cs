﻿using System.Collections.Generic;
using System.Collections.Immutable;
using System.Text.RegularExpressions;
using Microsoft.Recognizers.Text.DateTime.Utilities;
using Microsoft.Recognizers.Text.Number;

namespace Microsoft.Recognizers.Text.DateTime
{
    public interface IDateParserConfiguration : IOptionsConfiguration
    {
        string DateTokenPrefix { get; }

        #region internalParsers

        IExtractor IntegerExtractor { get; }

        IExtractor OrdinalExtractor { get; }

        IExtractor CardinalExtractor { get; }

        IParser NumberParser { get; }

        IDateTimeExtractor DurationExtractor { get; }

        IDateExtractor DateExtractor { get; }

        IDateTimeParser DurationParser { get; }

        #endregion

        #region Regexes

        IEnumerable<Regex> DateRegexes { get; }
        Regex OnRegex { get; }
        Regex SpecialDayRegex { get; }
        Regex SpecialDayWithNumRegex { get; }
        Regex NextRegex { get; }
        Regex ThisRegex { get; }
        Regex LastRegex { get; }
        Regex UnitRegex { get; }
        Regex WeekDayRegex { get; }
        Regex MonthRegex { get; }
        Regex WeekDayOfMonthRegex { get; }
        Regex ForTheRegex { get; }
        Regex WeekDayAndDayOfMothRegex { get; }
        Regex RelativeMonthRegex { get; }
        Regex YearSuffix { get; }
        Regex RelativeWeekDayRegex { get; }
        Regex RelativeDayRegex { get; }
        Regex NextPrefixRegex { get; }
        Regex PastPrefixRegex { get; }

        #endregion

        #region Dictionaries
        IImmutableDictionary<string, string> UnitMap { get; }
        IImmutableDictionary<string, int> DayOfMonth { get; }
        IImmutableDictionary<string, int> DayOfWeek { get; }
        IImmutableDictionary<string, int> MonthOfYear { get; }
        IImmutableDictionary<string, int> CardinalMap { get; }

        #endregion

        #region Lists

        IImmutableList<string> SameDayTerms { get; }
        IImmutableList<string> PlusOneDayTerms { get; }
        IImmutableList<string> MinusOneDayTerms { get; }
        IImmutableList<string> PlusTwoDayTerms { get; }
        IImmutableList<string> MinusTwoDayTerms { get; }

        #endregion

        int GetSwiftMonth(string text);

        bool IsCardinalLast(string text);

        string Normalize(string text);

        IDateTimeUtilityConfiguration UtilityConfiguration { get; }
    }
}
