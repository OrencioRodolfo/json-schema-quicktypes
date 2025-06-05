

# SBK Events - Bet Placed Event

<p>Triggered when a user places a bet successfuly</p>

<table>
<tbody>
<tr><th>$id</th><td>SBKEventsBetPlaced.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=event</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sportsbook/bet_placed</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>


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
      <td colspan="2">@@sportsbook/bet_placed</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#metaorigin">origin</a></td><td>String=sportsbook</td></tr></tbody></table>


### meta.origin

  <p>Defined in <a href="../envelope/envelope.schema.html#origin-sportsbook">../envelope/envelope.schema.html#origin-sportsbook</a></p>

<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Identifies &#x27;Sportsbook&#x27; as the origin</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">sportsbook</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadbetid">betId</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadbetreceiptid">betReceiptId</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payloadtotalstake">totalStake</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadtotalpotentialwin">totalPotentialWin</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadbetplacedtime">betPlacedTime</a></td><td>String</td></tr></tbody></table>


### payload.betId


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.betReceiptId


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.totalStake


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.totalPotentialWin


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.betPlacedTime


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
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
    "$id": "SBKEventsBetPlaced.schema.json",
    "title": "SBK Events - Bet Placed Event",
    "description": "Triggered when a user places a bet successfuly",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-event"
        },
        "type": {
            "const": "@@sportsbook/bet_placed",
            "description": "Defines the UID for this event"
        },
        "meta": {
            "type": "object",
            "properties": {
                "origin": {
                    "$ref": "../envelope/envelope.schema.json#/$defs/origin-sportsbook"
                }
            }
        },
        "payload": {
            "type": "object",
            "properties": {
                "betId": {
                    "type": "number"
                },
                "betReceiptId": {
                    "type": "string"
                },
                "totalStake": {
                    "type": "number"
                },
                "totalPotentialWin": {
                    "type": "number"
                },
                "betPlacedTime": {
                    "type": "string"
                }
            },
            "required": [
                "betId",
                "betReceiptId"
            ]
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
    ]
}
```


