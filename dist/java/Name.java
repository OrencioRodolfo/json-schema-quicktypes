package io.quicktype;

import java.io.IOException;

public enum Name {
    ARCADE_BONUS, BINGO, BINGO_BONUS, BOOST_TOKENS, CASINO, CASINO_BONUS, CASINO_BONUS_CASH, CASINO_FUN_BONUS, EXCHANGE_BONUS_CASH, FANTASY_BONUS, FROZEN, GAMES_BONUS, GAMING_BONUS, GAMING_BONUS_TOTAL, ITA, MAIN, MAIN_EXPOSURE, MONEY_BACK_TOKENS, POKER, RT_BONUS, SPORTSBOOK_BONUS, SPORTSBOOK_BONUS_CASH, SPORTSBOOK_BONUS_WAGERING, TOTAL, UNKNOWN_VALUE, VEGAS_BONUS, VIRTUALSPORTS, VIRTUALSPORTS_BONUS_CASH, VIRTUALSPORTS_BONUS_WAGERING, XG;

    public String toValue() {
        switch (this) {
            case ARCADE_BONUS: return "ARCADE_BONUS";
            case BINGO: return "BINGO";
            case BINGO_BONUS: return "BINGO_BONUS";
            case BOOST_TOKENS: return "BOOST_TOKENS";
            case CASINO: return "CASINO";
            case CASINO_BONUS: return "CASINO_BONUS";
            case CASINO_BONUS_CASH: return "CASINO_BONUS_CASH";
            case CASINO_FUN_BONUS: return "CASINO_FUN_BONUS";
            case EXCHANGE_BONUS_CASH: return "EXCHANGE_BONUS_CASH";
            case FANTASY_BONUS: return "FANTASY_BONUS";
            case FROZEN: return "FROZEN";
            case GAMES_BONUS: return "GAMES_BONUS";
            case GAMING_BONUS: return "GAMING_BONUS";
            case GAMING_BONUS_TOTAL: return "GAMING_BONUS_TOTAL";
            case ITA: return "ITA";
            case MAIN: return "MAIN";
            case MAIN_EXPOSURE: return "MAIN_EXPOSURE";
            case MONEY_BACK_TOKENS: return "MONEY_BACK_TOKENS";
            case POKER: return "POKER";
            case RT_BONUS: return "RT_BONUS";
            case SPORTSBOOK_BONUS: return "SPORTSBOOK_BONUS";
            case SPORTSBOOK_BONUS_CASH: return "SPORTSBOOK_BONUS_CASH";
            case SPORTSBOOK_BONUS_WAGERING: return "SPORTSBOOK_BONUS_WAGERING";
            case TOTAL: return "TOTAL";
            case UNKNOWN_VALUE: return "UNKNOWN_VALUE";
            case VEGAS_BONUS: return "VEGAS_BONUS";
            case VIRTUALSPORTS: return "VIRTUALSPORTS";
            case VIRTUALSPORTS_BONUS_CASH: return "VIRTUALSPORTS_BONUS_CASH";
            case VIRTUALSPORTS_BONUS_WAGERING: return "VIRTUALSPORTS_BONUS_WAGERING";
            case XG: return "XG";
        }
        return null;
    }

    public static Name forValue(String value) throws IOException {
        if (value.equals("ARCADE_BONUS")) return ARCADE_BONUS;
        if (value.equals("BINGO")) return BINGO;
        if (value.equals("BINGO_BONUS")) return BINGO_BONUS;
        if (value.equals("BOOST_TOKENS")) return BOOST_TOKENS;
        if (value.equals("CASINO")) return CASINO;
        if (value.equals("CASINO_BONUS")) return CASINO_BONUS;
        if (value.equals("CASINO_BONUS_CASH")) return CASINO_BONUS_CASH;
        if (value.equals("CASINO_FUN_BONUS")) return CASINO_FUN_BONUS;
        if (value.equals("EXCHANGE_BONUS_CASH")) return EXCHANGE_BONUS_CASH;
        if (value.equals("FANTASY_BONUS")) return FANTASY_BONUS;
        if (value.equals("FROZEN")) return FROZEN;
        if (value.equals("GAMES_BONUS")) return GAMES_BONUS;
        if (value.equals("GAMING_BONUS")) return GAMING_BONUS;
        if (value.equals("GAMING_BONUS_TOTAL")) return GAMING_BONUS_TOTAL;
        if (value.equals("ITA")) return ITA;
        if (value.equals("MAIN")) return MAIN;
        if (value.equals("MAIN_EXPOSURE")) return MAIN_EXPOSURE;
        if (value.equals("MONEY_BACK_TOKENS")) return MONEY_BACK_TOKENS;
        if (value.equals("POKER")) return POKER;
        if (value.equals("RT_BONUS")) return RT_BONUS;
        if (value.equals("SPORTSBOOK_BONUS")) return SPORTSBOOK_BONUS;
        if (value.equals("SPORTSBOOK_BONUS_CASH")) return SPORTSBOOK_BONUS_CASH;
        if (value.equals("SPORTSBOOK_BONUS_WAGERING")) return SPORTSBOOK_BONUS_WAGERING;
        if (value.equals("TOTAL")) return TOTAL;
        if (value.equals("UNKNOWN_VALUE")) return UNKNOWN_VALUE;
        if (value.equals("VEGAS_BONUS")) return VEGAS_BONUS;
        if (value.equals("VIRTUALSPORTS")) return VIRTUALSPORTS;
        if (value.equals("VIRTUALSPORTS_BONUS_CASH")) return VIRTUALSPORTS_BONUS_CASH;
        if (value.equals("VIRTUALSPORTS_BONUS_WAGERING")) return VIRTUALSPORTS_BONUS_WAGERING;
        if (value.equals("XG")) return XG;
        throw new IOException("Cannot deserialize Name");
    }
}
