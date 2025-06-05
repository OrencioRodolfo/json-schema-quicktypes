

# SBK Commands - Deposit Command

<p>Triggered when a user cashes out a bet in My Bets</p>

<table>
<tbody>
<tr><th>$id</th><td>SBKCommandsDeposit.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=command</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sportsbook/deposit</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@sportsbook/deposit",
    "kind": "command",
    "meta": {
        "origin": "sportsbook"
    }
}
```



<hr />


## kind

  <p>Defined in <a href="../envelope/envelope.schema.html#kind-command">../envelope/envelope.schema.html#kind-command</a></p>

<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Identifies the message as being a Command</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">command</td>
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
      <td colspan="2">@@sportsbook/deposit</td>
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










<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "SBKCommandsDeposit.schema.json",
    "title": "SBK Commands - Deposit Command",
    "description": "Triggered when a user cashes out a bet in My Bets",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-command"
        },
        "type": {
            "const": "@@sportsbook/deposit",
            "description": "Defines the UID for this event"
        },
        "meta": {
            "type": "object",
            "properties": {
                "origin": {
                    "$ref": "../envelope/envelope.schema.json#/$defs/origin-sportsbook"
                }
            }
        }
    },
    "required": [
        "kind",
        "type",
        "meta"
    ],
    "additionalProperties": false,
    "examples": [
        {
            "type": "@@sportsbook/deposit",
            "kind": "command",
            "meta": {
                "origin": "sportsbook"
            }
        }
    ]
}
```


