/**
 * Triggered when user's personal details get changed in My Account
 */
export interface PSEventsPerfornalDetailsUpdatedEvent {
    kind:    Kind;
    meta:    PSEventsPerfornalDetailsUpdatedEventMeta;
    payload: PSEventsPerfornalDetailsUpdatedEventPayload;
    /**
     * Defines the UID for this event
     */
    type: PSEventsPerfornalDetailsUpdatedEventType;
}

/**
 * Identifies the message as being an Event
 */
export enum Kind {
    Event = "event",
}

export interface PSEventsPerfornalDetailsUpdatedEventMeta {
    origin?: Origin;
    [property: string]: any;
}

/**
 * Identifies 'PokerStars' as the origin
 */
export enum Origin {
    Pokerstars = "pokerstars",
}

export interface PSEventsPerfornalDetailsUpdatedEventPayload {
    language?: Language;
    timezone?: Timezone;
}

export interface Language {
    new?: string;
    old?: string;
    [property: string]: any;
}

export interface Timezone {
    new?: string;
    old?: string;
    [property: string]: any;
}

export enum PSEventsPerfornalDetailsUpdatedEventType {
    PokerstarsPersonalDetailsUpdated = "@@pokerstars/personal_details_updated",
}

/**
 * Triggered when wallets get updated in PokerStars app
 */
export interface PSEventsWalletUpdatedEvent {
    kind:    Kind;
    meta:    PSEventsWalletUpdatedEventMeta;
    payload: PSEventsWalletUpdatedEventPayload;
    /**
     * Defines the UID for this event
     */
    type: PSEventsWalletUpdatedEventType;
}

export interface PSEventsWalletUpdatedEventMeta {
    origin?: Origin;
    [property: string]: any;
}

export interface PSEventsWalletUpdatedEventPayload {
    details: Details;
    name:    Name;
}

export interface Details {
    amount:          number;
    availabletobet?: number;
    bonus?:          number;
    bonuses?:        number;
    deposits?:       number;
    real?:           number;
    winnings?:       number;
}

export enum Name {
    ArcadeBonus = "ARCADE_BONUS",
    Bingo = "BINGO",
    BingoBonus = "BINGO_BONUS",
    BoostTokens = "BOOST_TOKENS",
    Casino = "CASINO",
    CasinoBonus = "CASINO_BONUS",
    CasinoBonusCash = "CASINO_BONUS_CASH",
    CasinoFunBonus = "CASINO_FUN_BONUS",
    ExchangeBonusCash = "EXCHANGE_BONUS_CASH",
    FantasyBonus = "FANTASY_BONUS",
    Frozen = "FROZEN",
    GamesBonus = "GAMES_BONUS",
    GamingBonus = "GAMING_BONUS",
    GamingBonusTotal = "GAMING_BONUS_TOTAL",
    Ita = "ITA",
    Main = "MAIN",
    MainExposure = "MAIN_EXPOSURE",
    MoneyBackTokens = "MONEY_BACK_TOKENS",
    Poker = "POKER",
    RtBonus = "RT_BONUS",
    SportsbookBonus = "SPORTSBOOK_BONUS",
    SportsbookBonusCash = "SPORTSBOOK_BONUS_CASH",
    SportsbookBonusWagering = "SPORTSBOOK_BONUS_WAGERING",
    Total = "TOTAL",
    UnknownValue = "UNKNOWN_VALUE",
    VegasBonus = "VEGAS_BONUS",
    Virtualsports = "VIRTUALSPORTS",
    VirtualsportsBonusCash = "VIRTUALSPORTS_BONUS_CASH",
    VirtualsportsBonusWagering = "VIRTUALSPORTS_BONUS_WAGERING",
    Xg = "XG",
}

export enum PSEventsWalletUpdatedEventType {
    PokerstarsWalletUpdated = "@@pokerstars/wallet_updated",
}
