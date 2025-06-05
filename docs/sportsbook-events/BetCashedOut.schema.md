

# SBK Events - Bet Cashed Out Event

<p>Triggered when a user cashes out a bet in My Bets</p>

<table>
<tbody>
<tr><th>$id</th><td>SBKEventsBetCashedOut.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=event</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sportsbook/bet_cashed_out</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@sportsbook/bet_cashed_out",
    "kind": "event",
    "payload": {
        "betId": "2491229247",
        "cashedOutQuote": 0.11,
        "cashOutToken": "3RJ2aoWAL/f0DbQRiVCVaFHaoRgVvLo+ZDR6tmsYLxKO6Xl1OlWzUteyjMLgdQN0XRSU8mtioba5DqDF75tYiMipgFDaGAV7g87GBzauyq6ae3F60gCsqME1rA0H2uruIaNTu9CerV1Rd6WvWTx9kQrRY+oKMtX9Sd4ZPsCr5enCPAWUCGPk9yvNSj/a3tOZhDai+4BlJCLSWn/42ZqrIVjf+iWonLdrxkQZhw2YFEcp8EUSbHU/D9urG/7zNav+QdHBp4ehVzv+dUgSP+zuftqKeY3kQ7AwlHfHZRXg+l1TZetycnyT3zIftVwX4/QjgiFY3bT/279fLSAhdXXrG8gVnm27SUWRx2lNmB3M1Fk=",
        "quote": 0.11
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
      <td colspan="2">@@sportsbook/bet_cashed_out</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadbetid">betId</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payloadcashedoutquote">cashedOutQuote</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadbetdelay">betDelay</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadcashouttoken">cashOutToken</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payloadquote">quote</a></td><td>Number</td></tr></tbody></table>


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










<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "SBKEventsBetCashedOut.schema.json",
    "title": "SBK Events - Bet Cashed Out Event",
    "description": "Triggered when a user cashes out a bet in My Bets",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-event"
        },
        "type": {
            "const": "@@sportsbook/bet_cashed_out",
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
                    "type": "string"
                },
                "cashedOutQuote": {
                    "type": "number"
                },
                "betDelay": {
                    "type": "number"
                },
                "cashOutToken": {
                    "type": "string"
                },
                "quote": {
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
        "kind",
        "type",
        "payload",
        "meta"
    ],
    "additionalProperties": false,
    "examples": [
        {
            "type": "@@sportsbook/bet_cashed_out",
            "kind": "event",
            "payload": {
                "betId": "2491229247",
                "cashedOutQuote": 0.11,
                "cashOutToken": "3RJ2aoWAL/f0DbQRiVCVaFHaoRgVvLo+ZDR6tmsYLxKO6Xl1OlWzUteyjMLgdQN0XRSU8mtioba5DqDF75tYiMipgFDaGAV7g87GBzauyq6ae3F60gCsqME1rA0H2uruIaNTu9CerV1Rd6WvWTx9kQrRY+oKMtX9Sd4ZPsCr5enCPAWUCGPk9yvNSj/a3tOZhDai+4BlJCLSWn/42ZqrIVjf+iWonLdrxkQZhw2YFEcp8EUSbHU/D9urG/7zNav+QdHBp4ehVzv+dUgSP+zuftqKeY3kQ7AwlHfHZRXg+l1TZetycnyT3zIftVwX4/QjgiFY3bT/279fLSAhdXXrG8gVnm27SUWRx2lNmB3M1Fk=",
                "quote": 0.11
            },
            "meta": {
                "origin": "sportsbook"
            }
        }
    ]
}
```


