

# Bet Placement Event

<p>Triggered when a user places a bet</p>

<table>
<tbody>
<tr><th>$id</th><td>betplacement.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sports/bet_placement</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>



<hr />


## type


<table class="jssd-property-table">
  <tbody>
    
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">@@sports/bet_placement</td>
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
    "$id": "betplacement.schema.json",
    "title": "Bet Placement Event",
    "description": "Triggered when a user places a bet",
    "type": "object",
    "properties": {
        "type": {
            "const": "@@sports/bet_placement"
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
        "payload"
    ],
    "additionalProperties": false
}
```


