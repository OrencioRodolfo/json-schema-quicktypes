

# SBK Events - Transaction Event

<p>Triggered when a user places a transaction like bet placed or bet cashed out successfuly</p>

<table>
<tbody>
<tr><th>$id</th><td>SBKEventsTransaction.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=event</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sportsbook/transaction</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@sportsbook/transaction",
    "kind": "event",
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
      <td colspan="2">@@sportsbook/transaction</td>
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
    "$id": "SBKEventsTransaction.schema.json",
    "title": "SBK Events - Transaction Event",
    "description": "Triggered when a user places a transaction like bet placed or bet cashed out successfuly",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-event"
        },
        "type": {
            "const": "@@sportsbook/transaction",
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
            "type": "@@sportsbook/transaction",
            "kind": "event",
            "meta": {
                "origin": "sportsbook"
            }
        }
    ]
}
```


