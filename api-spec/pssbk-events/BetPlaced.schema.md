

# Bet Placement Event

<p>Triggered when a user places a bet successfuly</p>

<table>
<tbody>
<tr><th>$id</th><td>BetPlaced.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sports/bet_placed</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>



<hr />


## kind

  <p>Defined in <a href="../envelope/envelope.schema.html#kind">../envelope/envelope.schema.html#kind</a></p>

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
      <td colspan="2">Defines the UID for this event</td>
    </tr>
    
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">@@sports/bet_placed</td>
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
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.totalPotentialWin


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.betPlacedTime


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>










<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "BetPlaced.schema.json",
    "title": "Bet Placement Event",
    "description": "Triggered when a user places a bet successfuly",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind"
        },
        "type": {
            "const": "@@sports/bet_placed",
            "description": "Defines the UID for this event"
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
                "betReceiptId",
                "totalStake",
                "totalPotentialWin",
                "betPlacedTime"
            ]
        }
    },
    "required": [
        "type",
        "kind",
        "payload"
    ],
    "additionalProperties": false
}
```


