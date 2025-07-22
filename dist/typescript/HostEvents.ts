/**
 * Triggered when user's personal details get changed in My Account
 */
export interface HostEventsPerfornalDetailsUpdatedEvent {
    kind:    Kind;
    meta:    HostEventsPerfornalDetailsUpdatedEventMeta;
    payload: HostEventsPerfornalDetailsUpdatedEventPayload;
    /**
     * Defines the UID for this event
     */
    type: HostEventsPerfornalDetailsUpdatedEventType;
}

/**
 * Identifies the message as being an Event
 */
export enum Kind {
    Event = "event",
}

export interface HostEventsPerfornalDetailsUpdatedEventMeta {
    origin?: Origin;
    [property: string]: any;
}

/**
 * Identifies 'Host app' as the origin
 */
export enum Origin {
    Host = "host",
}

export interface HostEventsPerfornalDetailsUpdatedEventPayload {
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

export enum HostEventsPerfornalDetailsUpdatedEventType {
    HostPersonalDetailsUpdated = "@@host/personal_details_updated",
}

/**
 * Triggered when wallets get updated in host app
 */
export interface HostEventsWalletUpdatedEvent {
    kind:    Kind;
    meta:    HostEventsWalletUpdatedEventMeta;
    payload: HostEventsWalletUpdatedEventPayload;
    /**
     * Defines the UID for this event
     */
    type: HostEventsWalletUpdatedEventType;
}

export interface HostEventsWalletUpdatedEventMeta {
    origin?: Origin;
    [property: string]: any;
}

export interface HostEventsWalletUpdatedEventPayload {
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

export enum HostEventsWalletUpdatedEventType {
    HostWalletUpdated = "@@host/wallet_updated",
}
