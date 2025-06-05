

# SBK Commands - Navigate command

<p>Signal to instruct the subscriber (PokerStart host app) to perform a navigation to a given URL</p>

<table>
<tbody>
<tr><th>$id</th><td>SBKCommandsNavigate.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=command</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sportsbook/navigate</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@sportsbook/navigate",
    "kind": "command",
    "payload": {
        "url": "https://gordonmoody.org.uk/",
        "target": "external"
    },
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
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">@@sportsbook/navigate</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadurl">url</a></td><td>String</td></tr><tr><td colspan="2"><a href="#payloadtarget">target</a></td><td></td></tr></tbody></table>


### payload.url


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.target


<table class="jssd-property-table">
  <tbody>
    
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Enum</th>
      <td colspan="2"><ul><li>internal</li><li>external</li></ul></td>
    </tr>
  </tbody>
</table>










<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "SBKCommandsNavigate.schema.json",
    "title": "SBK Commands - Navigate command",
    "description": "Signal to instruct the subscriber (PokerStart host app) to perform a navigation to a given URL",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-command"
        },
        "type": {
            "const": "@@sportsbook/navigate"
        },
        "payload": {
            "type": "object",
            "properties": {
                "url": {
                    "type": "string"
                },
                "target": {
                    "enum": [
                        "internal",
                        "external"
                    ]
                }
            },
            "required": [
                "url",
                "target"
            ]
        }
    },
    "required": [
        "type",
        "payload",
        "kind"
    ],
    "additionalProperties": false,
    "examples": [
        {
            "type": "@@sportsbook/navigate",
            "kind": "command",
            "payload": {
                "url": "https://gordonmoody.org.uk/",
                "target": "external"
            },
            "meta": {
                "origin": "sportsbook"
            }
        }
    ]
}
```


