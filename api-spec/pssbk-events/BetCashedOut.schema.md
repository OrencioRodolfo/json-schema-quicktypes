

# Bet Cashout Event

<p>Triggered when a user cashes out a bet in My Bets</p>

<table>
<tbody>
<tr><th>$id</th><td>BetCashedOut.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sports/bet_cashout</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>



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
      <td colspan="2">@@sports/bet_cashout</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadbetdelay">betDelay</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadbetid">betId</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payloadcashouttoken">cashOutToken</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payloadquote">quote</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadcashedoutquote">cashedOutQuote</a></td><td>Number</td></tr></tbody></table>


### payload.betDelay


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.betId


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.cashOutToken


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.quote


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.cashedOutQuote


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
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
    "$id": "BetCashedOut.schema.json",
    "title": "Bet Cashout Event",
    "description": "Triggered when a user cashes out a bet in My Bets",
    "type": "object",
    "properties": {
        "type": {
            "const": "@@sports/bet_cashout"
        },
        "payload": {
            "type": "object",
            "properties": {
                "betDelay": {
                    "type": "number"
                },
                "betId": {
                    "type": "string"
                },
                "cashOutToken": {
                    "type": "string"
                },
                "quote": {
                    "type": "number"
                },
                "cashedOutQuote": {
                    "type": "number"
                }
            },
            "required": [
                "betId",
                "cashedOutQuote"
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


