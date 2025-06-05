

# PS Events - Perfornal Details Updated Event

<p>Triggered when user&#x27;s personal details get changed in My Account</p>

<table>
<tbody>
<tr><th>$id</th><td>PSEventsPersonalDetailsUpdated.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#kind">kind</a></td><td>String=event</td></tr><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@pokerstars/personal_details_updated</td></tr><tr><td colspan="2"><a href="#meta">meta</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>


## Example



```
{
    "type": "@@pokerstars/personal_details_updated",
    "kind": "event",
    "payload": {
        "language": {
            "old": "pt_BR",
            "new": "en_GB"
        }
    },
    "meta": {
        "origin": "pokerstars"
    }
}
```


## Example



```
{
    "type": "@@pokerstars/personal_details_updated",
    "kind": "event",
    "payload": {
        "timezone": {
            "old": "US/Hawaii",
            "new": "Europe/London"
        }
    },
    "meta": {
        "origin": "pokerstars"
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
      <td colspan="2">@@pokerstars/personal_details_updated</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#metaorigin">origin</a></td><td>String=pokerstars</td></tr></tbody></table>


### meta.origin

  <p>Defined in <a href="../envelope/envelope.schema.html#origin-pokerstars">../envelope/envelope.schema.html#origin-pokerstars</a></p>

<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Identifies &#x27;PokerStars&#x27; as the origin</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">pokerstars</td>
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
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadlanguage">language</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#payloadtimezone">timezone</a></td><td>Object</td></tr></tbody></table>


### payload.language


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>



### payload.language.old


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.language.new


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>





### payload.timezone


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>



### payload.timezone.old


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>




### payload.timezone.new


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
    "$id": "PSEventsPersonalDetailsUpdated.schema.json",
    "title": "PS Events - Perfornal Details Updated Event",
    "description": "Triggered when user's personal details get changed in My Account",
    "type": "object",
    "properties": {
        "kind": {
            "$ref": "../envelope/envelope.schema.json#/$defs/kind-event"
        },
        "type": {
            "const": "@@pokerstars/personal_details_updated",
            "description": "Defines the UID for this event"
        },
        "meta": {
            "type": "object",
            "properties": {
                "origin": {
                    "$ref": "../envelope/envelope.schema.json#/$defs/origin-pokerstars"
                }
            }
        },
        "payload": {
            "type": "object",
            "properties": {
                "language": {
                    "type": "object",
                    "properties": {
                        "old": {
                            "type": "string"
                        },
                        "new": {
                            "type": "string"
                        }
                    }
                },
                "timezone": {
                    "type": "object",
                    "properties": {
                        "old": {
                            "type": "string"
                        },
                        "new": {
                            "type": "string"
                        }
                    }
                }
            },
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
            "type": "@@pokerstars/personal_details_updated",
            "kind": "event",
            "payload": {
                "language": {
                    "old": "pt_BR",
                    "new": "en_GB"
                }
            },
            "meta": {
                "origin": "pokerstars"
            }
        },
        {
            "type": "@@pokerstars/personal_details_updated",
            "kind": "event",
            "payload": {
                "timezone": {
                    "old": "US/Hawaii",
                    "new": "Europe/London"
                }
            },
            "meta": {
                "origin": "pokerstars"
            }
        }
    ]
}
```


