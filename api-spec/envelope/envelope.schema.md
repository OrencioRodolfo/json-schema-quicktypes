

# Message Envelope

<p>Envelope for all messages being exchanged, whether they are Events or Commands and by who they get produced</p>

<table>
<tbody>
<tr><th>$id</th><td>envelope/envelope.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr></tbody></table>



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
    "description": "Envelope for all messages being exchanged, whether they are Events or Commands and by who they get produced",
    "type": "object",
    "$defs": {
        "kind": {
            "type": "string",
            "enum": [
                "event",
                "command"
            ],
            "description": "Defines whether the message is an event or a command",
            "required": [
                "type"
            ]
        },
        "origin": {
            "type": "string",
            "enum": [
                "sportsbook",
                "pokerstars"
            ],
            "description": "Identifies by who is the message being produced (either Sportsbook app or the PokerStars host app)",
            "required": [
                "type"
            ]
        }
    },
    "properties": {
        "kind": {
            "$ref": "#/$defs/kind"
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
                    "$ref": "#/$defs/origin"
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
    "additionalProperties": false
}
```


