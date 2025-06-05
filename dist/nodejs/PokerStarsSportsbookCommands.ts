/**
 * Triggered when a user cashes out a bet in My Bets
 */
export interface SBKCommandsDepositCommand {
    kind: Kind;
    meta: SBKCommandsDepositCommandMeta;
    /**
     * Defines the UID for this event
     */
    type: SBKCommandsDepositCommandType;
}

/**
 * Identifies the message as being a Command
 */
export enum Kind {
    Command = "command",
}

export interface SBKCommandsDepositCommandMeta {
    origin?: Origin;
    [property: string]: any;
}

/**
 * Identifies 'Sportsbook' as the origin
 */
export enum Origin {
    Sportsbook = "sportsbook",
}

export enum SBKCommandsDepositCommandType {
    SportsbookDeposit = "@@sportsbook/deposit",
}

/**
 * Triggered when a user cashes out a bet in My Bets
 */
export interface SBKCommandsLoginCommand {
    kind: Kind;
    meta: SBKCommandsLoginCommandMeta;
    /**
     * Defines the UID for this event
     */
    type: SBKCommandsLoginCommandType;
}

export interface SBKCommandsLoginCommandMeta {
    origin?: Origin;
    [property: string]: any;
}

export enum SBKCommandsLoginCommandType {
    SportsbookLogin = "@@sportsbook/login",
}

/**
 * Signal to instruct the subscriber (PokerStart host app) to perform a navigation to a
 * given URL
 */
export interface SBKCommandsNavigateCommand {
    kind:    Kind;
    payload: Payload;
    type:    SBKCommandsNavigateCommandType;
}

export interface Payload {
    target: Target;
    url:    string;
    [property: string]: any;
}

export enum Target {
    External = "external",
    Internal = "internal",
}

export enum SBKCommandsNavigateCommandType {
    SportsbookNavigate = "@@sportsbook/navigate",
}
