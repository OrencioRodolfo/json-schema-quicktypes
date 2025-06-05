

# Message Envelope

<p>Envelope for all messages being exchanged, whether they are Events or Commands or produced by PokerStars host or Sportsbook embed apps</p>

<table>
<tbody>
<tr><th>$id</th><td>envelope/envelope.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@sportsbook/bet_placed",
    "kind": "event",
    "payload": {
        "betId": 2491229247,
        "betReceiptId": "O/10952522/0003688",
        "totalStake": 0.11,
        "totalPotentialWin": 0.24,
        "betPlacedTime": "2025-06-05T09:39:01.000Z"
    },
    "meta": {
        "origin": "sportsbook"
    }
}
```


## Example



```
{
    "type": "@@pokerstars/wallet_updated",
    "kind": "event",
    "payload": {
        "details": {
            "amount": "number",
            "availabletobet": "number",
            "bonus": "number",
            "bonuses": "number",
            "deposits": "number",
            "real": "number",
            "winnings": "number"
        },
        "walletName": "MAIN"
    },
    "meta": {
        "origin": "sportsbook"
    }
}
```


## Example



```
{
    "type": "@@sportsbook/login",
    "kind": "command",
    "meta": {
        "origin": "sportsbook"
    }
}
```



<hr />


## kind


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Defines whether the message is an event or a command</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Enum</th>
      <td colspan="2"><ul><li>event</li><li>command</li></ul></td>
    </tr>
  </tbody>
</table>




## type


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Each message must have a Unique Identifier</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




## payload


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




## meta


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>

### Properties
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#metaorigin">origin</a></td><td>String</td></tr></tbody></table>


### meta.origin


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Identifies by who is the message being produced (either Sportsbook app or the PokerStars host app)</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    <tr>
      <th>Enum</th>
      <td colspan="2"><ul><li>sportsbook</li><li>pokerstars</li></ul></td>
    </tr>
  </tbody>
</table>










<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "envelope/envelope.schema.json",
    "title": "Message Envelope",
    "description": "Envelope for all messages being exchanged, whether they are Events or Commands or produced by PokerStars host or Sportsbook embed apps",
    "type": "object",
    "$defs": {
        "kind-event": {
            "type": "string",
            "const": "event",
            "description": "Identifies the message as being an Event"
        },
        "kind-command": {
            "type": "string",
            "const": "command",
            "description": "Identifies the message as being a Command"
        },
        "origin-sportsbook": {
            "type": "string",
            "const": "sportsbook",
            "description": "Identifies 'Sportsbook' as the origin"
        },
        "origin-pokerstars": {
            "type": "string",
            "const": "pokerstars",
            "description": "Identifies 'PokerStars' as the origin"
        }
    },
    "properties": {
        "kind": {
            "type": "string",
            "enum": [
                "event",
                "command"
            ],
            "description": "Defines whether the message is an event or a command"
        },
        "type": {
            "type": "string",
            "description": "Each message must have a Unique Identifier"
        },
        "payload": {
            "type": "object"
        },
        "meta": {
            "type": "object",
            "properties": {
                "origin": {
                    "type": "string",
                    "enum": [
                        "sportsbook",
                        "pokerstars"
                    ],
                    "description": "Identifies by who is the message being produced (either Sportsbook app or the PokerStars host app)"
                }
            }
        }
    },
    "required": [
        "type",
        "kind",
        "payload",
        "meta"
    ],
    "additionalProperties": false,
    "examples": [
        {
            "type": "@@sportsbook/bet_placed",
            "kind": "event",
            "payload": {
                "betId": 2491229247,
                "betReceiptId": "O/10952522/0003688",
                "totalStake": 0.11,
                "totalPotentialWin": 0.24,
                "betPlacedTime": "2025-06-05T09:39:01.000Z"
            },
            "meta": {
                "origin": "sportsbook"
            }
        },
        {
            "type": "@@pokerstars/wallet_updated",
            "kind": "event",
            "payload": {
                "details": {
                    "amount": "number",
                    "availabletobet": "number",
                    "bonus": "number",
                    "bonuses": "number",
                    "deposits": "number",
                    "real": "number",
                    "winnings": "number"
                },
                "walletName": "MAIN"
            },
            "meta": {
                "origin": "sportsbook"
            }
        },
        {
            "type": "@@sportsbook/login",
            "kind": "command",
            "meta": {
                "origin": "sportsbook"
            }
        }
    ]
}
```


