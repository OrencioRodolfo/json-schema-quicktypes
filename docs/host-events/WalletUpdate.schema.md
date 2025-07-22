

# Host Events - Wallet Updated Event

<p>Triggered when wallets get updated in host app</p>

<table>
<tbody>
<tr><th>$id</th><td>HostEventsWalletUpdated.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=event</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@host/wallet_updated</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@host/wallet_updated",
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



<hr />


## kind

  <p>Defined in <a href="../envelope/envelope.schema.html#kind-event">../envelope/envelope.schema.html#kind-event</a></p>

<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Identifies the message as being an Event</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">event</td>
    </tr>
  </tbody>
</table>




## type


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Defines the UID for this event</td>
    </tr>
    
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">@@host/wallet_updated</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#metaorigin">origin</a></td><td>String=host</td></tr></tbody></table>


### meta.origin

  <p>Defined in <a href="../envelope/envelope.schema.html#origin-host">../envelope/envelope.schema.html#origin-host</a></p>

<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Identifies &#x27;Host app&#x27; as the origin</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">host</td>
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

### Properties
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadname">name</a></td><td></td></tr><tr><td colspan="2"><a href="#payloaddetails">details</a></td><td>Object</td></tr></tbody></table>


### payload.name


<table class="jssd-property-table">
  <tbody>
    
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Enum</th>
      <td colspan="2"><ul><li>MAIN</li><li>MAIN_EXPOSURE</li><li>ARCADE_BONUS</li><li>GAMES_BONUS</li><li>VEGAS_BONUS</li><li>BINGO_BONUS</li><li>GAMING_BONUS</li><li>GAMING_BONUS_TOTAL</li><li>SPORTSBOOK_BONUS</li><li>XG</li><li>POKER</li><li>BINGO</li><li>CASINO</li><li>CASINO_BONUS</li><li>CASINO_FUN_BONUS</li><li>CASINO_BONUS_CASH</li><li>ITA</li><li>EXCHANGE_BONUS_CASH</li><li>SPORTSBOOK_BONUS_CASH</li><li>SPORTSBOOK_BONUS_WAGERING</li><li>UNKNOWN_VALUE</li><li>TOTAL</li><li>FROZEN</li><li>VIRTUALSPORTS</li><li>VIRTUALSPORTS_BONUS_CASH</li><li>VIRTUALSPORTS_BONUS_WAGERING</li><li>BOOST_TOKENS</li><li>RT_BONUS</li><li>FANTASY_BONUS</li><li>MONEY_BACK_TOKENS</li></ul></td>
    </tr>
  </tbody>
</table>




### payload.details


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>



### payload.details.amount


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.details.availabletobet


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.details.bonus


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.details.bonuses


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.details.deposits


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.details.real


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.details.winnings


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>











<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "HostEventsWalletUpdated.schema.json",
    "title": "Host Events - Wallet Updated Event",
    "description": "Triggered when wallets get updated in host app",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-event"
        },
        "type": {
            "const": "@@host/wallet_updated",
            "description": "Defines the UID for this event"
        },
        "meta": {
            "type": "object",
            "properties": {
                "origin": {
                    "$ref": "../envelope/envelope.schema.json#/$defs/origin-host"
                }
            }
        },
        "payload": {
            "type": "object",
            "properties": {
                "name": {
                    "enum": [
                        "MAIN",
                        "MAIN_EXPOSURE",
                        "ARCADE_BONUS",
                        "GAMES_BONUS",
                        "VEGAS_BONUS",
                        "BINGO_BONUS",
                        "GAMING_BONUS",
                        "GAMING_BONUS_TOTAL",
                        "SPORTSBOOK_BONUS",
                        "XG",
                        "POKER",
                        "BINGO",
                        "CASINO",
                        "CASINO_BONUS",
                        "CASINO_FUN_BONUS",
                        "CASINO_BONUS_CASH",
                        "ITA",
                        "EXCHANGE_BONUS_CASH",
                        "SPORTSBOOK_BONUS_CASH",
                        "SPORTSBOOK_BONUS_WAGERING",
                        "UNKNOWN_VALUE",
                        "TOTAL",
                        "FROZEN",
                        "VIRTUALSPORTS",
                        "VIRTUALSPORTS_BONUS_CASH",
                        "VIRTUALSPORTS_BONUS_WAGERING",
                        "BOOST_TOKENS",
                        "RT_BONUS",
                        "FANTASY_BONUS",
                        "MONEY_BACK_TOKENS"
                    ]
                },
                "details": {
                    "type": "object",
                    "properties": {
                        "amount": {
                            "type": "number"
                        },
                        "availabletobet": {
                            "type": "number"
                        },
                        "bonus": {
                            "type": "number"
                        },
                        "bonuses": {
                            "type": "number"
                        },
                        "deposits": {
                            "type": "number"
                        },
                        "real": {
                            "type": "number"
                        },
                        "winnings": {
                            "type": "number"
                        }
                    },
                    "required": [
                        "amount"
                    ],
                    "additionalProperties": false
                }
            },
            "required": [
                "name",
                "details"
            ],
            "additionalProperties": false
        }
    },
    "required": [
        "kind",
        "type",
        "payload",
        "meta"
    ],
    "additionalProperties": false,
    "examples": [
        {
            "type": "@@host/wallet_updated",
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
    ]
}
```


